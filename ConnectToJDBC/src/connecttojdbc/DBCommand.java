
package connecttojdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBCommand {
    
    //private String secretPassword;
    
    public static ResultSet executeQuery(Connection conn,
                            String query)
    {
               
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
           
             
        } catch (SQLException ex) {
            Logger.getLogger(DBCommand.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        return resultSet;
    }
    
    //execute - INSERT, DELETE, UPDATE
    
    
    public static void showResultSet(ResultSet resultSet)
    {
        try {
            while(resultSet.next())
            {
                System.out.println(resultSet.getInt("GameID"));
                System.out.println(resultSet.getString("GameName"));
                System.out.println(resultSet.getDate("ReleaseDate"));
                System.out.println(resultSet.getString("Genre"));
            }
            
             resultSet.close();
        
        } catch (SQLException ex) {
                Logger.getLogger(DBCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
}
