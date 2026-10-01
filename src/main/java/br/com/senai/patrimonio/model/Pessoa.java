package br.com.senai.patrimonio.model;

public class Pessoa{
    private long  id;
    private String nome;
    private String cpf;

    public Pessoa(){

    }

    public Pessoa(long id, String nome, String spf) {
        this.id = id;
        this.nome = nome;
        this.cpf = spf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /* Metodo com implementação padrão na super classe mas que pode ser sobrescrito com (@Override) pelas
    *  na subclasses ver {@link Funcionario*getIdentidade()}.
    *  isso caracterisa o polimorfismo, o mesma chamada getIdentificação()
    *  se comporta de forma diferente dependendo do objeto em memória  *
     */

    public String getIdentificacao (){
        return this.nome + " ( CPF; " + this.cpf + ")" ;
    }



}
