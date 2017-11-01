
package model;


public class Usuario {
    private String cpf;
    private String nome;
    private String login;
    private String senha;
    private String patente;

    public Usuario(String cpf, String nome, String login, String senha, String patente) {
        this.cpf = cpf;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.patente = patente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cpf=" + cpf + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", patente=" + patente + '}';
    }

}
