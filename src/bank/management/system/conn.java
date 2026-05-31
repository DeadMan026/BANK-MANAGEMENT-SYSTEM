package bank.management.system;
import java.sql.*;
public class conn {
    
    Connection con;
    Statement  statement;
    public conn(){
        try{
            String db_pass = System.getenv("DB_PASSWORD");
            if (db_pass == null || db_pass.isBlank()) {
                throw new RuntimeException("DB_PASSWORD environment variable is not set");
            }
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root",db_pass);
            statement = con.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
