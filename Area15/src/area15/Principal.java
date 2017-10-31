
package area15;

import control.ControladorUsuario;
import model.TipoUsuario;

public class Principal {

    public static void main(String[] args) {
        ControladorUsuario controladorUsuario = new ControladorUsuario();
        controladorUsuario.cadastrarUsuario("graf", "123", "Gustavo", "116", TipoUsuario.PRESIDENTE);
        controladorUsuario.cadastrarUsuario("graf", "123", "Gustavo", "117", TipoUsuario.MARECHAL_DA_FEDERACAO_RUSSA);
        controladorUsuario.cadastrarUsuario("graf", "123", "Gustavo", "118", TipoUsuario.CORONEL);
        controladorUsuario.cadastrarUsuario("graf", "123", "Gustavo", "119", TipoUsuario.SOLDADO);
        
        
        
    }
    
}
