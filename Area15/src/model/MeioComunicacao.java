
package model;

public enum MeioComunicacao {

    ORAL(0), GESTO(1), TELEPATICO(3);
    
    private int meioComunicacao;

    private MeioComunicacao(int meioComunicacao) {
        this.meioComunicacao = meioComunicacao;
    }

    public int getMeioComunicacao() {
        return meioComunicacao;
    }

    public void setMeioComunicacao(int meioComunicacao) {
        this.meioComunicacao = meioComunicacao;
    }

    @Override
    public String toString() {
        return "MeioComunicacao{" + "meioComunicacao=" + meioComunicacao + '}';
    }
    
    
}
