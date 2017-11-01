
package area15;

import acessoBD.UsuarioDAO;
import control.ControladorUsuario;
import control.ControleAcesso;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        ControladorUsuario controladorUsuario = new ControladorUsuario();
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
//        controladorUsuario.cadastrarUsuario("123", "Gustavo", "graf", "321", TipoUsuario.PRESIDENTE);
//        usuarioDAO.cadastrarUsuario(controladorUsuario.getUsuario());
//        controladorUsuario.cadastrarUsuario("456", "Samuel", "sam", "654", TipoUsuario.MARECHAL);
//        usuarioDAO.cadastrarUsuario(controladorUsuario.getUsuario());
//        controladorUsuario.cadastrarUsuario("789", "Gerferson", "gef", "987", TipoUsuario.MAJOR);
//        usuarioDAO.cadastrarUsuario(controladorUsuario.getUsuario());
//        controladorUsuario.cadastrarUsuario("012", "Valdiney", "vald", "210", TipoUsuario.TENENTE);
//        usuarioDAO.cadastrarUsuario(controladorUsuario.getUsuario());
        
        Scanner scan = new Scanner(System.in);
        String login;
        String senha;
        
        System.out.println("Entre com o login");
        //login = scan.nextLine();
        login = "sam";
        System.out.println("Entre com a senha");
        //senha = scan.nextLine();
        senha = "123";
        
        ControleAcesso controleAcesso = new ControleAcesso();
        
        controleAcesso.recuperarTabelaUsuario(controleAcesso.recuperarUsuario(login, senha));
        
    }
    
}
