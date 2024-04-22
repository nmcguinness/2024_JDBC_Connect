package connecttojdbc;

import java.sql.DriverManager;
import java.sql.Connection;

public class Main {

   public static void main(String[] args) {        
        
        //setup password and user name stuff
        String password = "";
        String userName =  "root";
        
             
        //setup DB url stuff
        String dbURL = "jdbc:mysql://localhost:3306/";
        String dbName = "games"; //pick name that you have
        
        //connect to DB
        DriverManager.getConnection()
        
        //execute query
        
        //disconnect from DB
    }
}



