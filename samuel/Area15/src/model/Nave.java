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
public class Nave {
    private String nome;
    private String formato;
    private String alien_idalien;
    private TC tc;

    public Nave(String nome, String formato, String alien_idalien, TC tc) {
        this.nome = nome;
        this.formato = formato;
        this.alien_idalien = alien_idalien;
        this.tc = tc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getAlien_idalien() {
        return alien_idalien;
    }

    public void setAlien_idalien(String alien_idalien) {
        this.alien_idalien = alien_idalien;
    }

    public TC getTc() {
        return tc;
    }

    public void setTc(TC tc) {
        this.tc = tc;
    }

}
