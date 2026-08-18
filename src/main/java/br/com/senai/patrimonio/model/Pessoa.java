package br.com.senai.patrimonio.model;

public class Pessoa {
    private long  id;
    private String nome;
    private String spf;

    public Pessoa(){

    }

    public Pessoa(long id, String nome, String spf) {
        this.id = id;
        this.nome = nome;
        this.spf = spf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSpf() {
        return spf;
    }

    public void setSpf(String spf) {
        this.spf = spf;
    }
}
