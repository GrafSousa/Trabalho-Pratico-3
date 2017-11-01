
package model;

public enum TipoEspecie {
    SIRIANO(0), GRAY_BAIXO(1), GRAY_ALTO(2), ALPHA_DRACONIANO(3), REPTILIANOS_NATIVOS(4),
    ANUNNAKI(5), HUMANO(6);
    
    private int especie;

    private TipoEspecie(int especie) {
        this.especie = especie;
    }

    public int getEspecie() {
        return especie;
    }

    public void setEspecie(int especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "TipoEspecie{" + "especie=" + especie + '}';
    }
    
    
    
    
    
    
}
