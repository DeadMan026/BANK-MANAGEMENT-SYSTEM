package bank.management.system;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager; 
public class conn {
    
    Connection con;
    Statement  statement;
    public conn(){
        try{
            con = DriverManager.getConnection("jdbs:mysql://localhost:3306/BankSystem","root","password123");
            statement = (Statement) con.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
