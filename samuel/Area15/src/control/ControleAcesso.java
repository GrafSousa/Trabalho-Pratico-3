/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import acessoBD.ConnectionFactory;
import acessoBD.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author PC10
 */
public class ControleAcesso {

    Connection connection = new ConnectionFactory().abreConexao();

    public ControleAcesso() {
    }

    public boolean conferirLogin(String login) {
        String sql = "select login from usuario where ?=login;";
        boolean bool = false;
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, login);

            if (stmt.execute()) {
                bool = true;
            }
            stmt.close();
            //connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bool;
    }

    public boolean conferirSenha(String senha) {
        String sql = "select senha from usuario where ?=senha;";
        boolean bool = false;
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, senha);

            if (stmt.execute()) {
                bool = true;
            }
            stmt.close();
            //connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bool;
    }

    public Usuario recuperarUsuario(String login, String senha) {
        ResultSet rst;
        Usuario usuario = null;
        if (conferirLogin(login) && conferirSenha(senha)) {
            String sql = "select cpf,nome,login,senha,patente from usuario where login='" + login + "' and senha='" + senha + "'";
            //String sql = "select * from usuario";
            try {
                Statement stmt = connection.createStatement();

                String cpf = null;
                String nome = null;
                String login2;
                String senha2;
                String patente = null;
                //System.out.println(sql);
                rst = stmt.executeQuery(sql);
                while (rst.next()) {
                    //pega o valor da coluna nome, de cada linha:
                    cpf = rst.getString("cpf");
                    nome = rst.getString("nome");
                    login2 = rst.getString("login");
                    senha2 = rst.getString("senha");
                    patente = rst.getString("patente");
                }
                usuario = new Usuario(cpf, nome, login, senha, patente);
                stmt.close();
                //connection.close();

            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return usuario;
    }

    public void recuperarTabelaUsuario(Usuario usuario) {
        ResultSet rst;
        String sql = "select cpf, nome, patente from usuario where patente='"+usuario.getPatente()+"'";
        try {
            Statement stmt = connection.createStatement();;

            rst = stmt.executeQuery(sql);
            while (rst.next()) {
                System.out.print(rst.getString("cpf") + " ");
                System.out.print(rst.getString("nome") + " ");
                System.out.println(rst.getString("patente"));
            }
            stmt.close();
            //connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
