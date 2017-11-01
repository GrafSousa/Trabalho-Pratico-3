/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acessoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Planeta;

/**
 *
 * @author PC10
 */
public class PlanetaDAO {
        Connection connection = new ConnectionFactory().abreConexao();
    
    public void cadastrarPlaneta( Planeta planeta ){
        String sql = "insert into planeta(nome, sistema, TC) values" +
                "(?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, planeta.getNome());
            stmt.setString(2, planeta.getSistema());
            stmt.setInt(3, planeta.getTc().getTC());
            
            stmt.execute();
            stmt.close();
            //connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
