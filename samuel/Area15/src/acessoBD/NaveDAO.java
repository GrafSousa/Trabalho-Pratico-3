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
import model.Nave;

/**
 *
 * @author PC10
 */
public class NaveDAO {
            Connection connection = ConnectionFactory.abreConexao();
    
    public void cadastrarPlaneta( Nave nave ){
        String sql = "insert into nave(nome, formato, alien_idalien, TC) values" +
                "(?,?,?,?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nave.getNome());
            stmt.setString(2, nave.getFormato());
            stmt.setString(3, nave.getAlien_idalien());
            stmt.setInt(4, nave.getTc().getTC());
            
            stmt.execute();
            stmt.close();
            //connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
