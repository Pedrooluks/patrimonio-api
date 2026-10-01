package br.com.senai.patrimonio.model;

public class Bloco implements BuscarEmpresaVinculada{

    private long id;
    private String nome;
    private Empresa empresa;

    public Bloco(long id, String nome, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
    }

    public Bloco (){

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

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    @Override
    public String getEmpresaVinculada() {
        return empresa != null ? "Bloco" + empresa.getNome() :
                "Empresa não informada";
    }
}
