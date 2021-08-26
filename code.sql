--****code sql pour table LISTE_INSCRIS****

CREATE TABLE  LISTE_INSCRIS
   (    NOM VARCHAR2(20), 
	PRENOM VARCHAR2(20), 
	DATE_NAIS DATE, 
	WILAYA VARCHAR2(20), 
	DIPLOME VARCHAR2(20), 
	EMAIL VARCHAR2(40), 
	TELEPHONE VARCHAR(15), 
	 CONSTRAINT MAIL_FORMAT CHECK (REGEXP_LIKE(email,'^\w+(\.\w+)*+@\w+(\.\w+)+$')), 
	 CONSTRAINT TEL_FORMAT CHECK (REGEXP_LIKE(telephone,'^\0\d\d{2}\d{2}\d{2}\d{2}$')), 
	 CONSTRAINT MAIL_UNIQUE UNIQUE (EMAIL),
	 CONSTRAINT TEL_UNIQUE UNIQUE (TELEPHONE));
	 -----------------------------------------------------------------------------------
--****code sql pour table LISTE_CANDIDATS****

CREATE TABLE  LISTE_CANDIDATS
   (    N_INSCRI NUMBER(6),
        NOM VARCHAR2(20), 
	    PRENOM VARCHAR2(20), 
	    DATE_NAIS DATE,
        SALLE NUMBER(2),
	    EMAIL VARCHAR2(40)
);
-------------------------------------------------------------------------------------
--****code sql pour table MATIERE****

CREATE TABLE MATIERE(
  NOMMAT  VARCHAR2(20),
  CODEMAT NUMBER(2),
  COEFMAT NUMBER(2)
);
----------------------------------------------------------------------------
--****code sql pour table NOTATION****

CREATE TABLE NOTATION (
   N_INSCRI NUMBER(6),
   CODEMAT NUMBER(2),
   NOTEMAT NUMBER(2)
);
----------------------------------------------------------------------------
--****code sql pour table RESULTAT****

CREATE TABLE RESULTAT(
  N_INSCRI NUMBER(6),
  NOM VARCHAR2(20), 
  PRENOM VARCHAR2(20), 
  DATE_NAIS DATE,
  CODEMAT NUMBER(2),
  MOYMAT NUMBER(5,2)
  );
  -------------------------------------------------
--****code sql pour table CLASSEMENT****

 CREATE TABLE CLASSEMENT(
  N_INSCRI NUMBER(6),
  NOM VARCHAR2(20), 
  PRENOM VARCHAR2(20), 
  DATE_NAIS DATE,
  MOYENNE NUMBER(5,2),
  RANG NUMBER(2)
);
--------------------------------------------------
--****code sql pour table LISTE_ADMIS****

CREATE TABLE LISTE_ADMIS(
  N_INSCRI NUMBER(6),
  NOM VARCHAR2(20), 
  PRENOM VARCHAR2(20), 
  DATE_NAIS DATE,
  MOYENNE NUMBER(5,2),
  RANG NUMBER(2)
);
--------------------------------------------------
--****code sql pour table LISTE_ATTENTES****

CREATE TABLE LISTE_ATTENTES(
  N_INSCRI NUMBER(6),
  NOM VARCHAR2(20), 
  PRENOM VARCHAR2(20), 
  DATE_NAIS DATE,
  MOYENNE NUMBER(3,2),
  RANG NUMBER(2)
);
--------------------------------------------------
--****code sql pour le trigger de filtrage****

CREATE OR REPLACE TRIGGER FILTRAGE_TRIG
             AFTER INSERT OR UPDATE ON LISTE_INSCRIS
             FOR EACH ROW
             WHEN (new.date_nais between '01/Jan/1987' and '31/dec/1992
             and new.diplome in('finance','economie','gestion'))
             declare
             n_ins integer;
             n_salle  integer;
             begin
             n_salle:= TRUNC(dbms_random.value(1,5));
             n_ins:= TRUNC(dbms_random.value(600000,900000));
             insert into liste_candidats values
             (n_ins,:new.nom,:new.prenom,:new.date_nais,n_salle,:new.email);
             END;
--------------------------------------------------
--****code sql pour la cursor de classement ****

declare
CURSOR candidat_note IS
SELECT liste_candidats.n_inscri, nom, prenom, date_nais,MATIERE.codemat,
((NVL(noteMat,0)*coefMat))note
FROM liste_candidats, NOTATION, MATIERE
WHERE liste_candidats.n_inscri=NOTATION.n_inscri
AND NOTATION.codemat=MATIERE.codemat;
nbe INTEGER; 
rg INTEGER; 
moy NUMBER(5,2); 
aucun_candidat EXCEPTION;
i INTEGER;
CURSOR candidat_classe IS
SELECT n_inscri, nom, prenom, date_nais,(SUM(moyMat)/SUM(coefMat))moyenne
FROM RESULTAT,matiere
GROUP BY n_inscri, nom, prenom, date_nais
ORDER BY moyenne DESC;
CURSOR candidat_non_note IS
SELECT n_inscri, nom,prenom,date_nais FROM liste_candidats
WHERE n_inscri NOT IN (SELECT DISTINCT n_inscri FROM
NOTATION);
BEGIN
DELETE FROM RESULTAT;
DELETE FROM CLASSEMENT;
SELECT COUNT(*) INTO nbe FROM liste_candidats;
IF nbe=0 THEN
RAISE aucun_candidat;
END IF;
FOR e IN candidat_note LOOP
INSERT INTO RESULTAT
VALUES (e.n_inscri,e.nom,e.prenom,e.date_nais,e.codemat,e.note);
END LOOP;
FOR f IN candidat_non_note LOOP
INSERT INTO RESULTAT
VALUES (f.n_inscri,f.nom,f.prenom,f.date_nais,null,0);
END LOOP;
moy:=21;
rg:=-1;
i:=1;
FOR f IN candidat_classe LOOP
IF moy>f.moyenne THEN
rg:=i;
END IF;
INSERT INTO CLASSEMENT
VALUES (f.n_inscri, f.nom, f.prenom, f.date_nais, f.moyenne, rg); 
moy:=f.moyenne;
i:=i+1;
END LOOP;
COMMIT;
EXCEPTION
WHEN aucun_candidat THEN
INSERT INTO RESULTAT
VALUES(0,'Aucun etudiant',NULL,NULL,NULL,NULL);
END;
--------------------------------------------------------------------------
declare
CURSOR classement_candidats IS
select * FROM classement where (moyenne >= 10.00);
nbr_p INTEGER; 
np INTEGER;
comp INTEGER;
aucun_admis EXCEPTION;
begin
delete from liste_admis;
delete from liste_attentes;
nbr_p:=7;
comp:=nbr_p;
for e in classement_candidats loop
begin
if (e.rang <= nbr_p and comp>=1) then
insert into liste_admis values(e.n_inscri, e.nom, e.prenom, e.date_nais, e.moyenne, e.rang);
comp:=comp-1;
else 
insert into liste_attentes values(e.n_inscri, e.nom, e.prenom, e.date_nais, e.moyenne, e.rang);
end if;
end;
END LOOP;
SELECT COUNT(*) INTO np FROM liste_admis;
IF np=0 THEN
RAISE aucun_admis;
END IF;
COMMIT;
EXCEPTION
WHEN aucun_admis THEN
DBMS_OUTPUT.PUT_LINE('AUCUN ADMIS');
END;
-------------------------------------------------------------------------------
begin
insert into notation values(659185,1,13);
insert into notation values(659185,2,11);
insert into notation values(659185,3,17);
insert into notation values(659185,4,14);

insert into notation values(851246,1,10);
insert into notation values(851246,2,8);
insert into notation values(851246,3,12);
insert into notation values(851246,4,11);

insert into notation values(791929,1,14);
insert into notation values(791929,2,16);
insert into notation values(791929,3,17);
insert into notation values(791929,4,13);

insert into notation values(883903,1,8);
insert into notation values(883903,2,4);
insert into notation values(883903,3,2);
insert into notation values(883903,4,10);

insert into notation values(734360,1,11);
insert into notation values(734360,2,6);
insert into notation values(734360,3,14);
insert into notation values(734360,4,12);

insert into notation values(646520,1,18);
insert into notation values(646520,2,16);
insert into notation values(646520,3,13);
insert into notation values(646520,4,15);

insert into notation values(659068,1,14);
insert into notation values(659068,2,3);
insert into notation values(659068,3,6);
insert into notation values(659068,4,8);

insert into notation values(866893,1,6);
insert into notation values(866893,2,10);
insert into notation values(866893,3,14);
insert into notation values(866893,4,00);

insert into notation values(822330,1,17);
insert into notation values(822330,2,13);
insert into notation values(822330,3,11);
insert into notation values(822330,4,9);

insert into notation values(709299,1,16);
insert into notation values(709299,2,16);
insert into notation values(709299,3,19);
insert into notation values(709299,4,18);

insert into notation values(649591,1,18);
insert into notation values(649591,2,16);
insert into notation values(649591,3,13);
insert into notation values(649591,4,4);

insert into notation values(704859,1,16);
insert into notation values(704859,2,01);
insert into notation values(704859,3,17);
insert into notation values(704859,4,05);

insert into notation values(793387,1,11);
insert into notation values(793387,2,12);
insert into notation values(793387,3,10);
insert into notation values(793387,4,8);

insert into notation values(641609,1,13);
insert into notation values(641609,2,10);
insert into notation values(641609,3,14);
insert into notation values(641609,4,16);

insert into notation values(829134,1,17);
insert into notation values(829134,2,16);
insert into notation values(829134,3,11);
insert into notation values(829134,4,9);


insert into notation values(816717,1,6);
insert into notation values(816717,2,11);
insert into notation values(816717,3,10);
insert into notation values(816717,4,05);

insert into notation values(846232,1,14);
insert into notation values(846232,2,10);
insert into notation values(846232,3,15);
insert into notation values(846232,4,18);

insert into notation values(863396,1,10);
insert into notation values(863396,2,09);
insert into notation values(863396,3,14);
insert into notation values(863396,4,08);

insert into notation values(842097,1,12);
insert into notation values(842097,2,13);
insert into notation values(842097,3,7);
insert into notation values(842097,4,11);

insert into notation values(627597,1,16);
insert into notation values(627597,2,1);
insert into notation values(627597,3,11);
insert into notation values(627597,4,12);

insert into notation values(726898,1,11);
insert into notation values(726898,2,11);
insert into notation values(726898,3,11);
insert into notation values(726898,4,11);

insert into notation values(647455,1,08);
insert into notation values(647455,2,09);
insert into notation values(647455,3,18);
insert into notation values(647455,4,05);

insert into notation values(723245,1,12);
insert into notation values(723245,2,15);
insert into notation values(723245,3,7);
insert into notation values(723245,4,9);

insert into notation values(733884,1,11);
insert into notation values(733884,2,15);
insert into notation values(733884,3,08);
insert into notation values(733884,4,10);

insert into notation values(761799,1,1);
insert into notation values(761799,2,7);
insert into notation values(761799,3,8);
insert into notation values(761799,4,9);

insert into notation values(883060,1,10);
insert into notation values(883060,2,09);
insert into notation values(883060,3,13);
insert into notation values(883060,4,05);

insert into notation values(841729,1,12);
insert into notation values(841729,2,5);
insert into notation values(841729,3,7);
insert into notation values(841729,4,16);

insert into notation values(771677,1,05);
insert into notation values(771677,2,08);
insert into notation values(771677,3,11);
insert into notation values(771677,4,10);

insert into notation values(806238,1,12);
insert into notation values(806238,2,11);
insert into notation values(806238,3,12);
insert into notation values(806238,4,9);

insert into notation values(709935,1,16);
insert into notation values(709935,2,09);
insert into notation values(709935,3,17);
insert into notation values(709935,4,08);

end;
--------------------------------------------------------------
begin
insert into matiere values(1,3);
insert into matiere values(2,2);
insert into matiere values(3,3);
insert into matiere values(4,2);
end;
--------------------------------------------------------------
begin 
INSERT INTO liste_inscris VALUES('yassin','khaled','25/Aug/1990','Alger','gestion','khaledyassin@gmail.com','0578965863');
INSERT INTO liste_inscris VALUES('djilali','ahmed','12/Dec/1989','Alger','economie','kalthoumhilali@gmail.com','0658479874');
INSERT INTO liste_inscris VALUES('maalem','ikram','02/May/1987','Annaba','Anglais','ikrammaalem@gmail.com','0565412030');
INSERT INTO liste_inscris VALUES('benmohammed','samir','18/April/1988','Annaba','francais','samirbenmohammed@gmail.com','0598879541');
INSERT INTO liste_inscris VALUES('makdad','ahlem','22/jun/1991','Constantine','Science et tech','ahlemmakdad@gmail.com','0629874125');
INSERT INTO liste_inscris VALUES('slimani','ahmed','12/nov/1990','Constantine','finance','ahmedslimani@gmail.com','0659228877');
INSERT INTO liste_inscris VALUES('benmossa','siham','05/jan/1991','Constantine','gestion','sihambenmossa@gmail.com','0599844521');
INSERT INTO liste_inscris VALUES('mohamdi','samira','17/aug/1985','Alger','finance','samiramohamdi17@gmail.com','0659874120');
INSERT INTO liste_inscris VALUES('hamdani','ahmed','16/sep/1992','Alger','sociologie','ahmedhamdani16@gmail.com','0688774412');
INSERT INTO liste_inscris VALUES('lamkadam','bilal','19/dec/1985','Annaba','economie','bilallamkadam19@gmail.com','0574889966');
INSERT INTO liste_inscris VALUES('saadani','ibtissam','29/jan/1993','Alger','gestion','ibtissamsaadani29@gmail.com','0758746952');
INSERT INTO liste_inscris VALUES('mohamdi','amira','07/mar/1994','Constantine','gestion','amiramohamdi07@gmail.com','0755221040');
INSERT INTO liste_inscris VALUES('salmi','sara','19/apr/1986','Alger','economie','sarasalmi@gmail.com','0658744562');
INSERT INTO liste_inscris VALUES('hamdani','abdaldjalil','01/feb/1990','Annaba','génie-civil','abdaldjalilhamdani01@gmail.com','0787956241');
INSERT INTO liste_inscris VALUES('benommar','hadjer','17/jun/1993','Annaba','finance','hadjerbenommar17@gmail.com','0789547625');
INSERT INTO liste_inscris VALUES('khaldoni','khadidja','11/jul/1982','Annaba','economie','khadidjakhaldoni11@gmail.com','0755879612');
INSERT INTO liste_inscris VALUES('fatimi','rami','11/sep/1987','Annaba','Droit','ramifatimi11@gmail.com','0754784120');
INSERT INTO liste_inscris VALUES('djilali','adal','14/oct/1991','Constantine','Science et tech','adaldjilali14@gmail.com','0789745121');
INSERT INTO liste_inscris VALUES('boubgra','ishak','26/nov/1992','Alger','Droit','ishakboubgra26@gmail.com','0587210407');
INSERT INTO liste_inscris VALUES('hilali','salim','20/may/1988','Alger','finance','salimhilali20@gmail.com','0756987412');
INSERT INTO liste_inscris VALUES('ghalmi','mohammed','18/jan/1990','Constantine','finance','mohammedghalmi18@gmail.com','0558997744');
INSERT INTO liste_inscris VALUES('mansori','iman','24/mar/1987','Alger','economie','imanmansori24@gmail.com','0749885532');
INSERT INTO liste_inscris VALUES('benjado','ahlam','06/aug/1990','Constantine','gestion','ahlambenjado06@gmail.com','0588774466');
INSERT INTO liste_inscris VALUES('benmohammed','ahmed','12/nov/1988','Alger','economie','ahmedbenmohammed12@gmail.com','0781701424');
INSERT INTO liste_inscris VALUES('salmi','abdallah','14/jun/1990','Constantine','finance','abdallahsalmi14@gmail.com','0759886633');
INSERT INTO liste_inscris VALUES('bouhali','noralhouda','15/dec/1992','Constantine','gestion','noralhouda44@gmail.com','0569321420');
INSERT INTO liste_inscris VALUES('boubgra','amel','28/may/1990','Alger','economie','amelboubgra28@gmail.com','0688759421');
INSERT INTO liste_inscris VALUES('djilali','amel','28/sep/1990','Constantine','economie','ameldjilali28@gmail.com','0658741010');
INSERT INTO liste_inscris VALUES('makdad','ahlem','22/nov/1991','Annaba','finance','ahlemmakdad22@gmail.com','0696857420');
INSERT INTO liste_inscris VALUES('bendjaloul','serour','14/oct/1992','Alger','finance','serourbendjaloul14@gmail.com','0532625050');
INSERT INTO liste_inscris VALUES('bouhali','soumia','20/apr/1990','Alger','gestion','soumiabouhali20@gmail.com','0750102030');
INSERT INTO liste_inscris VALUES('khaldi','rima','06/feb/1989','Alger','finance','rimakhaldi06@gmail.com','0685741230');
INSERT INTO liste_inscris VALUES('rachdi','maya','28/feb/1990',',Alger','finance','mayarachdi28@gmail.com','0758741250');
INSERT INTO liste_inscris VALUES('rachdi','ammar','22/jun/1992','Constantine','economie','ammarrachdi22@gmail.com','0698745412');
INSERT INTO liste_inscris VALUES('benrachid','marwa','23/jul/1989','Alger','finance','marwabenrachid23@gmail.com','0752471380');
INSERT INTO liste_inscris VALUES('benmossa','islam','18/sep/1988','Constantine','gestion','islambenmossa18@gmail.com','0665212058');
INSERT INTO liste_inscris VALUES('maalem','soumia','29/jul/1990','Alger','gestion','soumiamaalem29@gmail.com','0752417895');
INSERT INTO liste_inscris VALUES('maazawi','souhila','04/dec/1990','Annaba','economie','souhilamaazawi04@gmail.com','0754216399');
INSERT INTO liste_inscris VALUES('alliwa','hicham','17/aug/1987','Constantine','finance','hichamalliwa17@gmail.com','0689745121');
INSERT INTO liste_inscris VALUES('hamlawi','isra','29/jul/1991','Constantine','gestion','israhamlawi29@gmail.com','0658663320');
INSERT INTO liste_inscris VALUES('salimani','sara','19/aug/1989','Alger','economie','sarasalmi19@gmail.com','0588745211');
INSERT INTO liste_inscris VALUES('ramdani','samir','01/feb/1990','Annaba','finance','ramdanisamir@gmail.com','0669854711');
INSERT INTO liste_inscris VALUES('bensalm','radia','12/mar/1987','Annaba','gestion','radiabensalm12@gmail.com','0685231236');
INSERT INTO liste_inscris VALUES('boumaaza','moustapha','28/sep/1990','Alger','finance','boummazamoustapha28@gmail.com','0593201457');
INSERT INTO liste_inscris VALUES('hilali','kalthoum','24/dec/1991','Constantine','economie','kalthoumhilali24@gmail.com','0687452010');
end; 
------------

