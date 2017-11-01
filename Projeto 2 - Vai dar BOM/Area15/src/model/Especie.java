
package model;

public class Especie {
    
    private String nomeEspecie;
    private int quantidadeOlhos;
    private int quantidadePatas;
    private int idEspecie;

    public Especie(String nomeEspecie, int quantidadeOlhos, int quantidadePatas) {
        this.nomeEspecie = nomeEspecie;
        this.quantidadeOlhos = quantidadeOlhos;
        this.quantidadePatas = quantidadePatas;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public int getQuantidadeOlhos() {
        return quantidadeOlhos;
    }

    public void setQuantidadeOlhos(int quantidadeOlhos) {
        this.quantidadeOlhos = quantidadeOlhos;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    @Override
    public String toString() {
        return "Especie{" + "nomeEspecie=" + nomeEspecie + ", quantidadeOlhos=" + quantidadeOlhos + ", quantidadePatas=" + quantidadePatas + ", idEspecie=" + idEspecie + '}';
    }
    
    
    
    
}
