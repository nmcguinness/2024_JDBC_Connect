
package connecttojdbc;

/**
* Provides MySQL DB connection functionality
* @author NMCG
* @see connecttojdbc.DBCommand
* @since 22/4/24
* @version 1.0
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
    
    /**
     * Connects to MySQL DB
     * @param url full DB URL
     * @param dbName MySQL database name
     * @param user user name, no spaces
     * @param password password, no spaces
     * @return 
     */
    public Connection connect(String url,
            String dbName,
            String user, String password)
    {
        Connection conn = null;     
        try{         
        conn = DriverManager.getConnection(
                url + dbName, user, password);
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Check url, name,"
                    + " password, or db name");
        }        
        return conn;
    }
    
      
    /**
     * 
     * @param conn Valid Connection object
     * @return true, if success, otherwise, false
     */
    public boolean disconnect(Connection conn)
    {
        try {
            conn.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
}
