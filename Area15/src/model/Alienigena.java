
package model;


public class Alienigena {
    private Especie especie;
    private int idade;
    private int idAlienigena;
    private Galaxia galaxia;
    private Planeta planeta;
    private NaveEspacial naveEspacial;

    public Alienigena(Especie especie, int idade, int idAlienigena, Galaxia galaxia, Planeta planeta, NaveEspacial naveEspacial) {
        this.especie = especie;
        this.idade = idade;
        this.idAlienigena = idAlienigena;
        this.galaxia = galaxia;
        this.planeta = planeta;
        this.naveEspacial = naveEspacial;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdAlienigena() {
        return idAlienigena;
    }

    public void setIdAlienigena(int idAlienigena) {
        this.idAlienigena = idAlienigena;
    }

    public Galaxia getGalaxia() {
        return galaxia;
    }

    public void setGalaxia(Galaxia galaxia) {
        this.galaxia = galaxia;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    public NaveEspacial getNaveEspacial() {
        return naveEspacial;
    }

    public void setNaveEspacial(NaveEspacial naveEspacial) {
        this.naveEspacial = naveEspacial;
    }

    @Override
    public String toString() {
        return "Alienigena{" + "especie=" + especie + ", idade=" + idade + ", idAlienigena=" + idAlienigena + ", galaxia=" + galaxia + ", planeta=" + planeta + ", naveEspacial=" + naveEspacial + '}';
    }
    
    
}
