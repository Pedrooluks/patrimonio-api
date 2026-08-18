package br.com.senai.patrimonio.avaliacao;

import br.com.senai.patrimonio.avaliacao.enums.StatusEvento;

public class Evento {

    private int codigo;
    private String nome;
    private String local;
    private StatusEvento status;
    private Participante responsavel;

    public Evento (){}

    public Evento(int codigo, String nome, String local, StatusEvento status, Participante responsavel) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.status = status;
        this.responsavel = responsavel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String nome() {
        return nome;
    }

    public void nome(String noem) {
        this.nome = noem;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public StatusEvento getStatus() {
        return status;
    }

    public void setStatus(StatusEvento status) {
        this.status = status;
    }

    public Participante getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Participante responsavel) {
        this.responsavel = responsavel;
    }
}
