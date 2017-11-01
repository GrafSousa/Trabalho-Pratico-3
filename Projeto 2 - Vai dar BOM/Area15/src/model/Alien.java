
package model;

public class Alien {
    
    private String nomeAlien;
    private int idade;
    private int idAlien;
    private Galaxia galaxia;
    private Especie especie;
    private NaveEspacial naveEspacial;

    public Alien(String nomeAlien, int idade, Galaxia galaxia, Especie especie, NaveEspacial naveEspacial) {
        this.nomeAlien = nomeAlien;
        this.idade = idade;
        this.galaxia = galaxia;
        this.especie = especie;
        this.naveEspacial = naveEspacial;
    }

    public String getNomeAlien() {
        return nomeAlien;
    }

    public void setNomeAlien(String nomeAlien) {
        this.nomeAlien = nomeAlien;
    }

    @Override
    public String toString() {
        return "Alien{" + "nomeAlien=" + nomeAlien + ", idade=" + idade + ", idAlien=" + idAlien + ", galaxia=" + galaxia + ", especie=" + especie + ", naveEspacial=" + naveEspacial + '}';
    }
    
    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdAlien() {
        return idAlien;
    }

    public void setIdAlien(int idAlien) {
        this.idAlien = idAlien;
    }

    public Galaxia getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(Galaxia galaxia) {
        this.galaxia = galaxia;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public NaveEspacial getNaveEspacial() {
        return naveEspacial;
    }

    public void setNaveEspacial(NaveEspacial naveEspacial) {
        this.naveEspacial = naveEspacial;
    }
    
    
    
}
