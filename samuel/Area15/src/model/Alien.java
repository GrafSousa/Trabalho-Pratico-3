/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PC10
 */
public class Alien {
    private String nome;
    private String planeta_idplaneta;
    private TC tc;

    public Alien(String nome, String planeta_idplaneta, TC tc) {
        this.nome = nome;
        this.planeta_idplaneta = planeta_idplaneta;
        this.tc = tc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaneta_idplaneta() {
        return planeta_idplaneta;
    }

    public void setPlaneta_idplaneta(String planeta_idplaneta) {
        this.planeta_idplaneta = planeta_idplaneta;
    }

    public TC getTc() {
        return tc;
    }

    public void setTc(TC tc) {
        this.tc = tc;
    }
    

}
