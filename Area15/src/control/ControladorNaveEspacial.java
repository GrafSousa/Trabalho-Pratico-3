
package control;

import java.util.ArrayList;
import model.Arma;
import model.NaveEspacial;
import model.TipoTiro;
import model.TipoUsuario;

public class ControladorNaveEspacial {
    private ArrayList<NaveEspacial> listaNaveEspacial = new ArrayList();
    private static ControladorNaveEspacial controladorNaveEspacial;
    
    private ControladorNaveEspacial(){};
    
    public static ControladorNaveEspacial getInstance(){
        
        if( controladorNaveEspacial == null )
            controladorNaveEspacial = new ControladorNaveEspacial();
        
        return controladorNaveEspacial;
    }
    
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
    
    public void excluirNaveEspacial(TipoUsuario tipoUsuario, int idNave ){
        
        NaveEspacial naveEspacial = recuperarNave(idNave);
        
        if( tipoUsuario.getPatente() >= 5 ){
            if( naveEspacial != null ){
                listaNaveEspacial.remove(naveEspacial);
            }
            else{
                System.out.println("Nave espacial não existente !");    
            }
            
        }
        else{
            System.out.println("Patente baixa !");    
        }
        
    }
    
    public NaveEspacial recuperarNave( int idNave ){
        int size = listaNaveEspacial.size();
        
        for( int i  = 0; i < size; i++ ){
            if( listaNaveEspacial.get(i).getIdNave() == idNave ) {
                return listaNaveEspacial.get(i);
            }
        }
        NaveEspacial naveEspacial = null;
        return naveEspacial;
    }
        public NaveEspacial recuperarNave( String nomeNave ){
        int size = listaNaveEspacial.size();
        
        for( int i  = 0; i < size; i++ ){
            if( listaNaveEspacial.get(i).getNomeNave().equals(nomeNave) ) {
                return listaNaveEspacial.get(i);
            }
        }
        NaveEspacial naveEspacial = null;
        return naveEspacial;
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
    
    public void cadastrarArma( TipoUsuario tipoUsuario, String nomeNave, String nomeArma, int capacidade,
            TipoTiro tipoTiro ){
        
        int size = listaNaveEspacial.size();
        
        if( tipoUsuario.getPatente() >= 5 ){
            if( pesquisarArma(nomeArma) == false ){
                for(int i = 0; i < size; i++ ){
                    if( listaNaveEspacial.get(i).getNomeNave().equals(nomeNave)){
                        Arma arma = new Arma(nomeArma, capacidade, tipoTiro);
                        listaNaveEspacial.get(i).getListaArma().add(arma);
                    }
                }
            }
            else{
                System.out.println("Arma ja cadastrada !");
            }
            
        }
        else{
            System.out.println("Patente baixa !");    
        }
        
    }
    
    public void excluirArma( String nomeArma ){
        
        Arma arma = recuperarArma(nomeArma);
        if( arma != null ){
            listaNaveEspacial.remove(arma);
        }
        else{
            System.out.println("Essa arma não existe");
        }
    }
    
    public Arma recuperarArma( String nomeArma ){
        int size = listaNaveEspacial.size();
        
        for( int i = 0; i < size; i++ ){
            for( int j = 0; j < listaNaveEspacial.get(i).getListaArma().size(); j++ ){
                if( listaNaveEspacial.get(i).getListaArma().get(j).getNomeArma().equals(nomeArma) ){
                    return listaNaveEspacial.get(i).getListaArma().get(j);
                }
            }
        }
        Arma arma = null;
        return arma;
    }
    
    public boolean pesquisarArma( String nomeArma ){
        int size = listaNaveEspacial.size();
        
        for( int i = 0 ; i < size; i++ ){
            {
                for( int j = 0; j < listaNaveEspacial.get(i).getListaArma().size(); j++ ){
                    
                    if( listaNaveEspacial.get(i).getListaArma().get(j).getNomeArma().equals(nomeArma)){
                        return true;
                    }
                }
            }
            
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "ControladorNaveEspacial{" + "listaNaveEspacial=" + listaNaveEspacial + '}';
    }
    
    
}
