
package model;

public class Planeta {
    private double tamanho;
    private double totalHabitantes;
    private String nome;

    public Planeta(double tamanho, double totalHabitantes, String nome) {
        this.tamanho = tamanho;
        this.totalHabitantes = totalHabitantes;
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(double totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Planeta{" + "tamanho=" + tamanho + ", totalHabitantes=" + totalHabitantes + ", nome=" + nome + '}';
    }
    
    
}
