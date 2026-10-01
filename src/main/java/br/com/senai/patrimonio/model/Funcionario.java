package br.com.senai.patrimonio.model;

import br.com.senai.patrimonio.model.enums.Cargo;

public class Funcionario extends Pessoa implements Localizavel, BuscarEmpresaVinculada{
    private Cargo cargo;
    private Empresa empresa;
    private Sala salasResponsavel;

    public Funcionario () {}

    public Funcionario(Sala salasResponsavel, Empresa empresa, Cargo cargo) {
        this.salasResponsavel = salasResponsavel;
        this.empresa = empresa;
        this.cargo = cargo;
    }

    public Funcionario(long id, String nome, String spf, Sala salasResponsavel, Empresa empresa, Cargo cargo) {
        super(id, nome, spf);
        this.salasResponsavel = salasResponsavel;
        this.empresa = empresa;
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Sala getSalasResponsavel() {
        return salasResponsavel;
    }

    public void setSalasResponsavel(Sala salasResponsavel) {
        this.salasResponsavel = salasResponsavel;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String getDescricaoLocalizavel() {
        return "Responsabilidade de "+ getNome() + " (" + cargo + ")";
    }

    @Override
    public String getEmpresaVinculada() {
        return empresa != null ? "Empresa " + empresa.getNome() :
                "Empresa não informada";
    }
    @Override
    public String getIdentificacao(){
        return super.getIdentificacao() + " - " + cargo;
    }

}
