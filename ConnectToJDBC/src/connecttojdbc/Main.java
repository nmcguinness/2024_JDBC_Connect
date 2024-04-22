package connecttojdbc;

import java.sql.Connection;
import java.sql.ResultSet;

public class Main {
    
      public static void main(String[] args) {        
        
        //setup password and user name stuff
        String password = "";
        String userName =  "root";
        
        //setup DB url stuff
        String dbURL = "jdbc:mysql://localhost:3306/";
        String dbName = "games"; //pick name that you have
        
        //connect to database
        Connection conn = DBConnection.connect(dbURL, dbName, 
                userName, password);
        
        //execute a query
        ResultSet resultSet 
           = DBCommand.executeQuery(conn, "SELECT * FROM releases");
        DBCommand.showResultSet(resultSet);       
        
        //disconnect from database
        DBConnection.disconnect(conn);
         
    }

//   public static void main(String[] args) {        
//        
//        //setup password and user name stuff
//        String password = "";
//        String userName =  "root";
//        
//        //setup DB url stuff
//        String dbURL = "jdbc:mysql://localhost:3306/";
//        String dbName = "games"; //pick name that you have
//        
//        //add conn variable and initialize to null
//        Connection conn = null;
//        
//        try{
//            
//         //connect to DB
//        conn = DriverManager.getConnection(dbURL + dbName, 
//                            userName, password);
//        
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e.getMessage());
//            System.out.println("Check url, name,"
//                    + " password, or db name");
//        }
//        
//        
//        
//        //execute query
//        
//        //disconnect from DB
//        try{
//            conn.close();
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e.getMessage());
//        }
//            
//    }
}

