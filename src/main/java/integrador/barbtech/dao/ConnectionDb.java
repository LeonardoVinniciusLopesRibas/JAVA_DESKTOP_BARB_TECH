package integrador.barbtech.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionDb {
    
    private static final String DRIVERCLASS = "org.postgresql.Driver";
    private static final String URL = "jdbc:postgresql://localhost:5432/barbtech";
    private static final String USER = "postgres";       
    private static final String SENHA = "gtsnfe2010";
    
    public static Connection abreConnection() {
        Connection conn = null;
        try{
           Class.forName(DRIVERCLASS); 
           conn = DriverManager.getConnection(URL, USER, SENHA);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return conn;
    }
    
}
