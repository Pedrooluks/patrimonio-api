package br.com.senai.patrimonio.model;

public enum PagamentoComposto {

    PIX("pix", "Ativo"),
    CARTAO_CREDITO("Cartão de credito","Ativo"),
    CARTAO_DEBITO("cartao de débito","Ativo"),
    BOLETO("boleto","Inativo"),
    PERMUTA("permuta","Inativo"),
    DINHEIRO("dinheiro", "Ativo");
    private final String descricao;
    private final String situacao;

    PagamentoComposto (String descricao, String situacao){

    this.descricao = descricao;
    this.situacao = situacao;




    }

    public String getDescricao() {
        return descricao;
    }

    public String getInativo() {
        return situacao;
    }
}
