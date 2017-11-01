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
public class Planeta {

    private String nome;
    private String sistema;
    private TC tc;

    public Planeta(String nome, String sistema, TC tc) {
        this.nome = nome;
        this.sistema = sistema;
        this.tc = tc;
    }

    public TC getTc() {
        return tc;
    }

    public void setTc(TC tc) {
        this.tc = tc;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

}
