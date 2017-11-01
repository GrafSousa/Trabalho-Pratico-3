
package model;

public class NaveEspacial {
    
    private String nomeNave;
    private int quantidadeTripulantes;
    private int idNave;

    public NaveEspacial(String nomeNave, int quantidadeTripulantes) {
        this.nomeNave = nomeNave;
        this.quantidadeTripulantes = quantidadeTripulantes;
    }

    
    public String getNomeNave() {
        return nomeNave;
    }

    public void setNomeNave(String nomeNave) {
        this.nomeNave = nomeNave;
    }

    public int getQuantidadeTripulantes() {
        return quantidadeTripulantes;
    }

    public void setQuantidadeTripulantes(int quantidadeTripulantes) {
        this.quantidadeTripulantes = quantidadeTripulantes;
    }

    @Override
    public String toString() {
        return "NaveEspacial{" + "nomeNave=" + nomeNave + ", quantidadeTripulantes=" + quantidadeTripulantes + ", idNave=" + idNave + '}';
    }
    
    
    
}
