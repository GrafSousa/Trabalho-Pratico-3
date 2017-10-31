
package model;

import java.util.ArrayList;

public class NaveEspacial {
    private String nomeNave;
    private int capacidadeTripulantes;
    private float velocidadeMaxima;
    private float peso;
    private String forma;
    private int idNave;
    private ArrayList<Arma> listaArma = new ArrayList();

    public NaveEspacial(String nomeNave, int capacidadeTripulantes, float velocidadeMaxima, float peso, String forma, int idNave) {
        this.nomeNave = nomeNave;
        this.capacidadeTripulantes = capacidadeTripulantes;
        this.velocidadeMaxima = velocidadeMaxima;
        this.peso = peso;
        this.forma = forma;
        this.idNave = idNave;
    }

    public String getNomeNave() {
        return nomeNave;
    }

    public void setNomeNave(String nomeNave) {
        this.nomeNave = nomeNave;
    }

    public int getCapacidadeTripulantes() {
        return capacidadeTripulantes;
    }

    public void setCapacidadeTripulantes(int capacidadeTripulantes) {
        this.capacidadeTripulantes = capacidadeTripulantes;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public ArrayList<Arma> getListaArma() {
        return listaArma;
    }

    public void setListaArma(ArrayList<Arma> listaArma) {
        this.listaArma = listaArma;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" + "nomeNave=" + nomeNave + ", capacidadeTripulantes=" + capacidadeTripulantes + ", velocidadeMaxima=" + velocidadeMaxima + ", peso=" + peso + ", forma=" + forma + ", idNave=" + idNave + ", listaArma=" + listaArma + '}';
    }
    
    
    
    
}
