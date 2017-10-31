
package model;

import java.util.ArrayList;


public class Especie {
    private TipoEspecie  tipoEspecie;
    private ArrayList<MeioComunicacao> listaMeioComunicacao = new ArrayList();
    private int totalPatas;
    private int totalOlhos;
    private String cor;
    private int idEspecie;

    public Especie(TipoEspecie tipoEspecie, MeioComunicacao meioComunicacao, int totalPatas, int totalOlhos, String cor, int idEspecie) {
        this.tipoEspecie = tipoEspecie;
        listaMeioComunicacao.add(meioComunicacao);
        this.totalPatas = totalPatas;
        this.totalOlhos = totalOlhos;
        this.cor = cor;
        this.idEspecie = idEspecie;
    }

    public TipoEspecie getTipoEspecie() {
        return tipoEspecie;
    }

    public void setTipoEspecie(TipoEspecie tipoEspecie) {
        this.tipoEspecie = tipoEspecie;
    }

    public ArrayList<MeioComunicacao> getListaMeioComunicacao() {
        return listaMeioComunicacao;
    }

    public void setListaMeioComunicacao(ArrayList<MeioComunicacao> listaMeioComunicacao) {
        this.listaMeioComunicacao = listaMeioComunicacao;
    }

    public int getTotalPatas() {
        return totalPatas;
    }

    public void setTotalPatas(int totalPatas) {
        this.totalPatas = totalPatas;
    }

    public int getTotalOlhos() {
        return totalOlhos;
    }

    public void setTotalOlhos(int totalOlhos) {
        this.totalOlhos = totalOlhos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    public void setIdEspecie(int idEspecie) {
        this.idEspecie = idEspecie;
    }

    @Override
    public String toString() {
        return "Especie{" + "tipoEspecie=" + tipoEspecie + ", listaMeioComunicacao=" + listaMeioComunicacao + ", totalPatas=" + totalPatas + ", totalOlhos=" + totalOlhos + ", cor=" + cor + ", idEspecie=" + idEspecie + '}';
    }
    
    
    
    
    
}
