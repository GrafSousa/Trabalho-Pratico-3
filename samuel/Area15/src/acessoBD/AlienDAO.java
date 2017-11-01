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
import model.Alien;

/**
 *
 * @author PC10
 */
public class AlienDAO {

    Connection connection = ConnectionFactory.abreConexao();

    public void cadastrarAlien(Alien alien) {
        String sql = "insert into alien(nome, planeta_idplaneta, TC) values"
                + "(?,?.?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, alien.getNome());
            stmt.setString(2, alien.getPlaneta_idplaneta());
            stmt.setInt(3, alien.getTc().getTC());

            stmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(AlienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
