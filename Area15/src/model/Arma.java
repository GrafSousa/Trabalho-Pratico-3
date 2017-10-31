
package model;

public class Arma {
    private String nomeArma;
    private int capacidade;
    private int idArma;

    public Arma(String nomeArma, int capacidade, int idArma) {
        this.nomeArma = nomeArma;
        this.capacidade = capacidade;
        this.idArma = idArma;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getIdArma() {
        return idArma;
    }

    public void setIdArma(int idArma) {
        this.idArma = idArma;
    }

    @Override
    public String toString() {
        return "Arma{" + "nomeArma=" + nomeArma + ", capacidade=" + capacidade + ", idArma=" + idArma + '}';
    }
    
    
    
    
}
