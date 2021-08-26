package application_gestiondesconcours;
  import java.sql.*;

   public class ConnectJavaSql {
     public static Connection ConnectDb() {
        try
        {   
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection
            ("jdbc:oracle:thin:@localhost:1521:XE","DB_LOGICON","logicon2017");
               return con;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;

        }  
 }   
}
