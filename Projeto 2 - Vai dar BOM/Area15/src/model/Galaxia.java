
package model;


public class Galaxia {
    private String nomeGalaxia;
    private int idGalaxia;

    public Galaxia(String nomeGalaxia) {
        this.nomeGalaxia = nomeGalaxia;
    }

    public String getNomeGalaxia() {
        return nomeGalaxia;
    }

    public void setNomeGalaxia(String nomeGalaxia) {
        this.nomeGalaxia = nomeGalaxia;
    }

    public int getIdGalaxia() {
        return idGalaxia;
    }

    public void setIdGalaxia(int idGalaxia) {
        this.idGalaxia = idGalaxia;
    }

    @Override
    public String toString() {
        return "Galaxia{" + "nomeGalaxia=" + nomeGalaxia + ", idGalaxia=" + idGalaxia + '}';
    }
    
    
}
