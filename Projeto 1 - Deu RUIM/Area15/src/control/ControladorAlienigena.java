
package control;

import java.util.ArrayList;
import model.Alienigena;
import model.Especie;
import model.Galaxia;
import model.NaveEspacial;
import model.Planeta;
import model.TipoEspecie;
import model.TipoUsuario;


public class ControladorAlienigena {

    private ArrayList<Alienigena> listaAlienigena = new ArrayList();
    private static ControladorAlienigena controladorAlienigena;
    
    private ControladorAlienigena(){};
    
    public static ControladorAlienigena getInstance(){
        
        if( controladorAlienigena == null )
            controladorAlienigena = new ControladorAlienigena();
        
        return controladorAlienigena;
    }
    
    public void cadastrarAlienigena( TipoUsuario tipoUsuario, String nome, int idade, int idAlienigena,
            String nomeGalaxia, String nomePlaneta, double tamanhoPlaneta, double totalHabitantes
                    , String nomeNave, TipoEspecie tipoEspecie ){
        
        if( tipoUsuario.getPatente() >= 5){
            if( pesquisarAlienigena(idAlienigena) == false ){
                Galaxia galaxia = new Galaxia(nomeGalaxia);
                Planeta planeta = new Planeta(tamanhoPlaneta, totalHabitantes, nomePlaneta);
                NaveEspacial naveEspacial = ControladorNaveEspacial.getInstance().recuperarNave(nomeNave);
                Especie especie = ControladorEspecie.getInstance().recuperarEspecie(tipoEspecie);
                Alienigena alienigena = new Alienigena(especie, idade, idAlienigena, galaxia, planeta, naveEspacial);

                listaAlienigena.add(alienigena);
            }
            else{
                System.out.println("Alienigena já cadastrado");
            }
        }
        System.out.println("Patente baixa !");
        
    }
    
    public void excluirAlienigena( TipoUsuario tipoUsuario, int idAlienigena ){
        
        if( tipoUsuario.getPatente() >= 5 ){
            Alienigena alienigena = recuperarAlienigena(idAlienigena);
            if( alienigena != null ){
                listaAlienigena.remove(alienigena);
            }
            else{
                System.out.println("Alienigena não existe !");
            }
        }
        else{
            System.out.println("Patente baixa");
        }
    }
    
    public Alienigena recuperarAlienigena( int idAlienigena ){
        
        int size = listaAlienigena.size();
        
        for( int i = 0; i < size; i++ ){
            if( listaAlienigena.get(i).getIdAlienigena() == idAlienigena )
                return listaAlienigena.get(i);
        }
        Alienigena alienigena = null;
        return alienigena;
    }
    
    
    public boolean pesquisarAlienigena( int idAlienigena ){
        
        int size = listaAlienigena.size();
        
        for( int i = 0; i < size; i++ ){
            if( listaAlienigena.get(i).getIdAlienigena() == idAlienigena ){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "ControladorAlienigena{" + "listaAlienigena=" + listaAlienigena + '}';
    }
    
    
}
