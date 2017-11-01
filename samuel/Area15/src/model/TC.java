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
public enum TC {
    AS(3), S(2), C(1), U(1);
    
    private int tc;

    private TC(int tc) {
        this.tc = tc;
    }

    public int getTC() {
        return tc;
    }

    public void setTC(int tc) {
        this.tc = tc;
    }
}
