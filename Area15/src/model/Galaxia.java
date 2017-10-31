
package model;

public class Galaxia {
    
    private String nome;

    public Galaxia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Galaxia{" + "nome=" + nome + '}';
    }
    
    
}
