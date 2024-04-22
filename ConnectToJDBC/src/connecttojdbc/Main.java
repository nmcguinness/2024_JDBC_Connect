package connecttojdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

   public static void main(String[] args) {        
        
        //setup password and user name stuff
        String password = "";
        String userName =  "root";
        
             
        //setup DB url stuff
        String dbURL = "jdbc:mysql://localhost:3306/";
        String dbName = "games"; //pick name that you have
        
        
        try{
            
         //connect to DB
        Connection conn = DriverManager.getConnection(dbURL, 
                            userName, password);
        
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Check url, name,"
                    + " password, or db name");
        }
        
        
        
        //execute query
        
        //disconnect from DB
    }
}



