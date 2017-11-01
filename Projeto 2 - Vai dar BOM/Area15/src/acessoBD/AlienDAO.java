
package acessoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Alien;

public class AlienDAO {

    Connection connection = new ConnectionFactory().abreConexao();
    
    public void cadastrarAlien( Alien alien ){
        String sql = "insert into alien(nomeAlien, idade) values" +
                "(?,?)";
        String sql2 = "insert into galaxia(nomeGalaxia) values" +
                "(?)";
        String sql3 = "insert into especie(nomeEspecie, quantidadeOlhos, quantidadePatas) values" +
                "(?,?,?)";
        String sql4 = "insert into NaveEspacial(nomeNave, totalTripulantes) values" +
                "(?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, alien.getNomeAlien());
            stmt.setInt(2, alien.getIdade());
            
            stmt = connection.prepareStatement(sql2);
            stmt.setString(1, alien.getGalaxia().getNomeGalaxia());
            
            stmt = connection.prepareStatement(sql3);
            stmt.setString(1, alien.getEspecie().getNomeEspecie());
            stmt.setInt(2, alien.getEspecie().getQuantidadeOlhos());
            stmt.setInt(3, alien.getEspecie().getQuantidadePatas());
            
            stmt = connection.prepareStatement(sql4);
            stmt.setString(1, alien.getNaveEspacial().getNomeNave());
            stmt.setInt(2, alien.getNaveEspacial().getQuantidadeTripulantes());
            
            stmt.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(AlienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
