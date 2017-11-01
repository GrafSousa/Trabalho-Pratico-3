
package model;

public enum TipoUsuario {
    PRESIDENTE(3), MARECHAL(2), MAJOR(1), TENENTE(1);
    
    private int patente;

    private TipoUsuario(int patente) {
        this.patente = patente;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" + "patente=" + patente + '}';
    }
    
    
}
