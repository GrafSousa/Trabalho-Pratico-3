
package control;

import java.util.ArrayList;
import model.Especie;
import model.MeioComunicacao;
import model.TipoEspecie;
import model.TipoUsuario;

public class ControladorEspecie {
    private ArrayList<Especie> listaEspecie = new ArrayList();
    
    
   public void cadastrarEspecie( TipoUsuario tipoUsuario, int totalPatas, int totaOlhos,
           String cor, MeioComunicacao meioComunicacao, TipoEspecie tipoEspecie ){
       
       if( tipoUsuario.getPatente() >= 5){
           if( pesquisarEspecie(tipoEspecie) == false ){
               Especie especie = new Especie(tipoEspecie, meioComunicacao, totalPatas, totaOlhos, cor, totaOlhos);
               listaEspecie.add(especie);
           }
           else{
               System.out.println("Especie já cadastrada");
           }
       }
       else{
           System.out.println("Patente baixa !");
       }
       
   }
   
   public void excluirEspecie( TipoUsuario tipoUsuario, TipoEspecie tipoEspecie ){
       
       if( tipoUsuario.getPatente() >= 5 ){
           Especie especie = recuperarEspecie(tipoEspecie);
           if( especie != null ){
               listaEspecie.remove(especie);
           }
               
           else{
               System.out.println("Especie não cadastrada");
           }
       }
       else{
           System.out.println("Patente baixa !");
       }
   }
   
   public Especie recuperarEspecie( TipoEspecie tipoEspecie ){
       
       int size = listaEspecie.size();
       
       for( int i = 0; i < size; i++ ){
           if( listaEspecie.get(i).getTipoEspecie().equals(tipoEspecie) ){
               return listaEspecie.get(i);
           }
       }
       Especie especie = null;
       return especie;
   }
   
   public boolean pesquisarEspecie( TipoEspecie tipoEspecie ){
       int size = listaEspecie.size();
       
       for( int i = 0; i < size; i++ ){
           if( listaEspecie.get(i).getTipoEspecie().equals(tipoEspecie) )
               return true;
       }
       return false;
   }
}
