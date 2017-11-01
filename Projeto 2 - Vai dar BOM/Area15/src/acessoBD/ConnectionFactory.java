
package acessoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    
        public Connection abreConexao(){
        try{
            //Colocar no segundo parâmetro o usuário do BD, normalmente é root
            //Colocar no terceiro parâmetro a senha do banco
            return DriverManager.getConnection("jdbc:mysql://localhost/Area15","" , "");
        } catch( SQLException e){
            throw new RuntimeException();
        }
    }
}
