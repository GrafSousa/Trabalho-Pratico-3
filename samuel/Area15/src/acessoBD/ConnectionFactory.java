package acessoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static String status = "Não conectou...";

    public static Connection abreConexao() {
        Connection connection = null;          //atributo do tipo Connection
        try {
            //Colocar no segundo parâmetro o usuário do BD, normalmente é root
            //Colocar no terceiro parâmetro a senha do banco
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Area15?useSSL=false", "root", "1234");
            //Testa sua conexão//  
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;
        } catch (SQLException e) {
            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }

    }
    //Método que retorna o status da sua conexão//

    public static String statusConection() {
        return status;
    }

    //Método que fecha sua conexão//
    public static boolean FecharConexao() {
        try {
            ConnectionFactory.abreConexao().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    //Método que reinicia sua conexão//
    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return ConnectionFactory.abreConexao();
    }
}
