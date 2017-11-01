
package area15;

import acessoBD.AlienDAO;
import acessoBD.UsuarioDAO;
import control.ControladorAlien;
import control.ControladorUsuario;
import model.Alien;
import model.Galaxia;
import model.TipoUsuario;
import model.Usuario;

public class Principal {

    public static void main(String[] args) {
        ControladorUsuario controladorUsuario = new ControladorUsuario();
      //  ControladorAlien controladorAlien = new ControladorAlien();
       // AlienDAO alienDAO = new AlienDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        /*
        controladorUsuario.cadastrarUsuario("123", "Gustavo", "graf", "123", TipoUsuario.PRESIDENTE);
        usuarioDAO.cadastrarUsuario(controladorUsuario.getUsuario());
        controladorUsuario.cadastrarUsuario("321", "Samuel", "samu", "321", TipoUsuario.MAJOR);
        usuarioDAO.cadastrarUsuario(controladorUsuario.getUsuario());
        */
        
        Usuario usuario = new Usuario("123", "Gustavo", "graf", "123", TipoUsuario.PRESIDENTE);
        Usuario usuario2 = new Usuario("321", "Samuel", "samu", "321", TipoUsuario.MAJOR);
        usuarioDAO.cadastrarUsuario(usuario);
        usuarioDAO.cadastrarUsuario(usuario2);
        
        //controladorAlien.cadastrarAlien("ET", 0, "Lactea", "Himana", 0, 0, "Teste", 0);
       // alienDAO.cadastrarAlien(controladorAlien.getAlien());
        
        
        
        
        
        
    }
    
}
