
package control;

import java.util.ArrayList;
import model.NaveEspacial;
import model.TipoUsuario;

public class CadastrarNaveEspacial {
    private ArrayList<NaveEspacial> listaNaveEspacial = new ArrayList();
    
    public void cadastrarNave( TipoUsuario tipoUsuario, String nomeNave, int capacidadeTripulantes,
            float velocidadeMaxima, float peso, String forma, int idNave ){
        
        if( tipoUsuario.getPatente() >= 5 ){
            if( pesquisarNave(idNave) == false ){
                NaveEspacial naveEspacial = new NaveEspacial(nomeNave, capacidadeTripulantes, velocidadeMaxima, peso, forma, idNave);
                listaNaveEspacial.add(naveEspacial);
            }
            else{
                System.out.println("Nave já esta cadastrada");
            }
        }
        else{
            System.out.println(" Patente baixa ");
        }
    }
    
    
    public boolean pesquisarNave(int idNave ){
        int size = listaNaveEspacial.size();
        
        for( int i = 0; i < size; i++ ){
            if( listaNaveEspacial.get(i).getIdNave() == idNave ){
                return true;
            }
        }
        return false;
    }
}
