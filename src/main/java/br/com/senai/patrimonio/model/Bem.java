package br.com.senai.patrimonio.model;

public class Bem implements BuscarEmpresaVinculada{

    private long id;
    private String nome;
    private String codigo;
    private Empresa empresa;



    public Bem () {

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String getEmpresaVinculada() {
        return empresa != null ? "Empresa " + empresa.getNome() :
                "Empresa não informada";
    }
}
