/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author grafs
 */
public enum TipoUsuario {
    SOLDADO(0), SARGENTO(1),TENENTE(2),CAPITAO(3), MAJOR(4), CORONEL(5), GENERAL_EXERCITO(6),
    MARECHAL_DA_FEDERACAO_RUSSA(7), PRESIDENTE(8);
    
    private int patente;
    
    TipoUsuario( int patente ){
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
