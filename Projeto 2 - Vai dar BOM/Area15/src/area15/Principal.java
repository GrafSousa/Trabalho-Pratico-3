
package area15;

import acessoBD.UsuarioDAO;
import control.ControladorUsuario;
import model.TipoUsuario;

public class Principal {

    public static void main(String[] args) {
        ControladorUsuario controladorUsuario = new ControladorUsuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        controladorUsuario.cadastrarUsuario("123", "Gustavo", "graf", "123", TipoUsuario.PRESIDENTE);
        usuarioDAO.cadastrarUsuario(controladorUsuario.getUsuario());
        
        
        
    }
    
}
