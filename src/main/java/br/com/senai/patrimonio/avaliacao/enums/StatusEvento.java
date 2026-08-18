package br.com.senai.patrimonio.avaliacao.enums;

public enum StatusEvento {

    EVENTO_PLANEJADO("Evento planejago", 20),
    INSCRICOES_ABERTAS("Inscrições abertas", 10),
    EVENTO_EM_ANDAMENTO("Evento em andamento", 15),
    EVENTO_ENCERRADO("evento encerrado", 30),
    EVENTO_CANCELADO("Evento cancelado", 5);

    private final String descricao;
    private final int codigo;

    StatusEvento (String descricao, int codigo) {

        this.descricao = descricao;
        this.codigo = codigo;

    }

    public String getDescricao() {
        return descricao;
    }

    public int getInativo() {
        return codigo;
    }

}
