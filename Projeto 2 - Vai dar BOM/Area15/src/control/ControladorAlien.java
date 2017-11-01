
package control;

import model.Alien;
import model.Especie;
import model.Galaxia;
import model.NaveEspacial;


public class ControladorAlien {
    
    Alien alien;
    
    public void cadastrarAlien( String nomeAlien, int idade, String nomeGalaxia, 
            String nomeEspecie, int quantidadeOlhos, int quantidadePatas,
            String nomeNave, int totalTripulantes ){
        
        Galaxia galaxia = new Galaxia(nomeGalaxia);
        Especie especie = new Especie(nomeEspecie, quantidadeOlhos, quantidadePatas);
        NaveEspacial naveEspacial = new NaveEspacial(nomeNave, totalTripulantes);
        
        Alien alien = new Alien(nomeAlien, idade, galaxia, especie, naveEspacial);
        this.alien = alien;
    }

    public Alien getAlien() {
        return alien;
    }

    public void setAlien(Alien alien) {
        this.alien = alien;
    }

    @Override
    public String toString() {
        return "ControladorAlien{" + "alien=" + alien + '}';
    }
    
    
    
}
