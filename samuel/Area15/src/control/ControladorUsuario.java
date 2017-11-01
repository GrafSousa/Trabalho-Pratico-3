
package control;

import model.Usuario;


public class ControladorUsuario {
    Usuario usuario;
    public void cadastrarUsuario( String cpf, String nome, String login, 
            String senha, String patente ){
        Usuario usuario = new Usuario(cpf, nome, login, senha, patente);
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
