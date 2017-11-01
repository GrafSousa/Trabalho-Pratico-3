
package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
    public Connection abreConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/Area15", "root", "senha");
        } catch( SQLException e){
            throw new RuntimeException();
        }
    }
}
