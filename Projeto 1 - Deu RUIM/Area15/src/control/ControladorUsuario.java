
package control;

import conexaoBD.UsuarioDAO;
import java.util.ArrayList;
import model.TipoUsuario;
import model.Usuario;


public class ControladorUsuario {
    UsuarioDAO usuarioDao;
    private static ControladorUsuario controladorUsuario;
    
    private ControladorUsuario(){};
    
    public static ControladorUsuario getInstance(){
        
        if( controladorUsuario == null ){
            controladorUsuario = new ControladorUsuario();
        }
        
        return controladorUsuario;
    }
    
    public void cadastrarUsuario( String login, String senha, String nome, String cpf,
            TipoUsuario tipoUsuario ){
        
      //  if( pesquisarUsuario(cpf) == false ){
            
           // Usuario usuario = new Usuario(login, senha, nome, cpf, tipoUsuario);
            
            //usuarioDao.cadastrarUsuario(usuario);
        //}
    }
   
    /*
    public void excluirUsuario( String cpf ){
        
        Usuario usuario = recuperarUsuario(cpf);
        
        if( usuario != null ){
            listaUsuario.remove(usuario);
        }
        else{
            System.out.println("Este usuario não está cadastrado no sistema !");
        }
    }
    public Usuario recuperarUsuario( String cpf ){
        
        int size = listaUsuario.size();
        
        for( int i = 0; i < size; i++ ){
            if( listaUsuario.get(i).getCpf().equals(cpf) )
                return listaUsuario.get(i);
        }
        Usuario usuario = null;
        return usuario;
    }
    
    public boolean autenticarUsuario( String login, String senha ){
        
        int size = listaUsuario.size();
        
        for( int i = 0; i < size; i++ ){
            if( listaUsuario.get(i).getLogin().equals(login) && listaUsuario.get(i).getSenha().equals(senha) )
                return true;
        }
        return false;
    }
    
    public boolean pesquisarUsuario( String cpf ){
        
        int size = listaUsuario.size();
        
        for( int i = 0; i < size; i++ ){
            if( listaUsuario.get(i).getCpf().equals(cpf) )
                return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "ControladorUsuario{" + "listaUsuario=" + listaUsuario + '}';
    }
    */
    
    
}

