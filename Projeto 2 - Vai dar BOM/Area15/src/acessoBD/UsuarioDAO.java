
package acessoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class UsuarioDAO {
    Connection connection = new ConnectionFactory().abreConexao();
    
    public void cadastrarUsuario( Usuario usuario ){
        String sql = "insert into usuario(cpf, nome, login, senha, TipoUsuario) values" +
                "(?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getCpf());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getSenha());
            stmt.setInt(5, usuario.getTipoUsuario().getPatente());
            
            stmt.execute();
            //stmt.close();
            //connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
