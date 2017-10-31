
package model;


public enum TipoTiro {
    BALA(0), PLASMA(1), ATOMICA(2), TRANSFORMADOR(3), LASER(4);
    
    private int tipoTiro;

    private TipoTiro(int tipoTiro) {
        this.tipoTiro = tipoTiro;
    }

    public int getTipoTiro() {
        return tipoTiro;
    }

    public void setTipoTiro(int tipoTiro) {
        this.tipoTiro = tipoTiro;
    }

    @Override
    public String toString() {
        return "TipoTiro{" + "tipoTiro=" + tipoTiro + '}';
    }
    
    
}
