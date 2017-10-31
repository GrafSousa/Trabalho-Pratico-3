
package model;

public class Arma {
    private String nomeArma;
    private int capacidade;
    private TipoTiro tipoTiro;
    private int idArma;

    public Arma(String nomeArma, int capacidade, TipoTiro tipoTiro) {
        this.nomeArma = nomeArma;
        this.capacidade = capacidade;
        this.tipoTiro = tipoTiro;
    }

    public TipoTiro getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(TipoTiro tipoTiro) {
        this.tipoTiro = tipoTiro;
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
        return "Arma{" + "nomeArma=" + nomeArma + ", capacidade=" + capacidade + ", tipoTiro=" + tipoTiro + ", idArma=" + idArma + '}';
    }

    
    
    
    
}
