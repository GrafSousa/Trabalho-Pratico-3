
package control;

import model.TipoUsuario;
import model.Usuario;


public class ControladorUsuario {
    Usuario usuario;
    public void cadastrarUsuario( String cpf, String nome, String login, 
            String senha, TipoUsuario tipoUsuario ){
        Usuario usuario = new Usuario(cpf, nome, login, senha, tipoUsuario);
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "ControladorUsuario{" + "usuario=" + usuario + '}';
    }
    
}
