
package area15;

import conexaoBD.ConnectionFactory;
import conexaoBD.UsuarioDAO;
import control.ControladorAlienigena;
import control.ControladorEspecie;
import control.ControladorNaveEspacial;
import control.ControladorUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import model.MeioComunicacao;
import model.NaveEspacial;
import model.TipoEspecie;
import model.TipoTiro;
import model.TipoUsuario;
import model.Usuario;

public class Principal {

    public static void main(String[] args) throws SQLException {
        
        //ControladorUsuario.getInstance().cadastrarUsuario("grafsousa", "123", "Gustavo", "11111111", TipoUsuario.SOLDADO);
        Usuario usuario = new Usuario("grafsousa", "123", "Gustavo", "11111111", TipoUsuario.SOLDADO);
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.cadastrarUsuario(usuario);
    }
    
}

        
        /*
        ControladorUsuario.getInstance().cadastrarUsuario("graf", "123", "Gustavo", "116", TipoUsuario.PRESIDENTE);
        ControladorUsuario.getInstance().cadastrarUsuario("graf", "123", "Gustavo", "117", TipoUsuario.MARECHAL_DA_FEDERACAO_RUSSA);
        ControladorUsuario.getInstance().cadastrarUsuario("graf", "123", "Gustavo", "118", TipoUsuario.CORONEL);
        ControladorUsuario.getInstance().cadastrarUsuario("graf", "123", "Gustavo", "119", TipoUsuario.SOLDADO);
        
        
        ControladorEspecie.getInstance().cadastrarEspecie(TipoUsuario.SOLDADO, 0, 0, "preto", MeioComunicacao.GESTO, TipoEspecie.REPTILIANOS_NATIVOS);
        ControladorEspecie.getInstance().cadastrarEspecie(TipoUsuario.CORONEL, 1, 1, "branco", MeioComunicacao.ORAL, TipoEspecie.HUMANO);
        ControladorEspecie.getInstance().cadastrarEspecie(TipoUsuario.GENERAL_EXERCITO, 2, 2, "verde", MeioComunicacao.TELEPATICO, TipoEspecie.ALPHA_DRACONIANO);
        ControladorEspecie.getInstance().cadastrarEspecie(TipoUsuario.MARECHAL_DA_FEDERACAO_RUSSA, 3, 3, "amarelo", MeioComunicacao.GESTO, TipoEspecie.ANUNNAKI);
        ControladorEspecie.getInstance().cadastrarEspecie(TipoUsuario.PRESIDENTE, 4, 4, "vermelho", MeioComunicacao.TELEPATICO, TipoEspecie.GRAY_ALTO);
        
        
        ControladorNaveEspacial.getInstance().cadastrarNave(TipoUsuario.SOLDADO, "Milenium", 0, 0, 0, "redonda", 0);
        ControladorNaveEspacial.getInstance().cadastrarNave(TipoUsuario.CORONEL, "Milenium1", 1, 1, 1, "triangular", 1);
        ControladorNaveEspacial.getInstance().cadastrarNave(TipoUsuario.GENERAL_EXERCITO, "Milenium2", 2, 2, 2, "quadrada", 2);
        ControladorNaveEspacial.getInstance().cadastrarNave(TipoUsuario.MARECHAL_DA_FEDERACAO_RUSSA, "Milenium3", 3, 3, 3, "retangular", 3);
        ControladorNaveEspacial.getInstance().cadastrarNave(TipoUsuario.PRESIDENTE, "Milenium4", 4, 4, 4, "Elipse", 4);
        
        
        ControladorNaveEspacial.getInstance().cadastrarArma(TipoUsuario.SOLDADO,"Milenium", "ak47", 10, TipoTiro.BALA);
        ControladorNaveEspacial.getInstance().cadastrarArma(TipoUsuario.CORONEL,"Milenium1", "laser", 11, TipoTiro.LASER);
        ControladorNaveEspacial.getInstance().cadastrarArma(TipoUsuario.GENERAL_EXERCITO,"Milenium2", "plasma", 12, TipoTiro.PLASMA);
        ControladorNaveEspacial.getInstance().cadastrarArma(TipoUsuario.MARECHAL_DA_FEDERACAO_RUSSA,"Milenium3", "Ovelhador", 13, TipoTiro.TRANSFORMADOR);
        ControladorNaveEspacial.getInstance().cadastrarArma(TipoUsuario.PRESIDENTE,"Milenium4", "Bomba Hidrogenio", 14, TipoTiro.ATOMICA);
        
        NaveEspacial nave = ControladorNaveEspacial.getInstance().recuperarNave("Milenium");
        NaveEspacial nave1 = ControladorNaveEspacial.getInstance().recuperarNave("Milenium1");
        NaveEspacial nave2 = ControladorNaveEspacial.getInstance().recuperarNave("Milenium2");
        NaveEspacial nave3 = ControladorNaveEspacial.getInstance().recuperarNave("Milenium3");
        NaveEspacial nave4 = ControladorNaveEspacial.getInstance().recuperarNave("Milenium4");
               
        
        //ControladorAlienigena.getInstance().cadastrarAlienigena(TipoUsuario.SOLDADO, "ET", 0, 0, "Lactea", "Terra", 0, 0, nave.getNomeNave(), TipoEspecie.REPTILIANOS_NATIVOS);
        ControladorAlienigena.getInstance().cadastrarAlienigena(TipoUsuario.CORONEL, "ET1", 1, 1, "Lactea1", "Terra1", 0, 0, nave1.getNomeNave(), TipoEspecie.HUMANO);
        ControladorAlienigena.getInstance().cadastrarAlienigena(TipoUsuario.GENERAL_EXERCITO, "ET2", 2, 2, "Lactea2", "Terra2", 0, 0, nave2.getNomeNave(), TipoEspecie.ALPHA_DRACONIANO);
        ControladorAlienigena.getInstance().cadastrarAlienigena(TipoUsuario.MARECHAL_DA_FEDERACAO_RUSSA, "ET3", 3, 3, "Lactea3", "Terra3", 0, 0, nave3.getNomeNave(), TipoEspecie.ANUNNAKI);
        ControladorAlienigena.getInstance().cadastrarAlienigena(TipoUsuario.PRESIDENTE, "ET4", 4, 4, "Lactea4", "Terra4", 0, 0, nave4.getNomeNave(), TipoEspecie.GRAY_ALTO);
        
   
        System.out.println(" " + ControladorAlienigena.getInstance().toString());
        */
