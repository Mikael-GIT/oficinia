package com.mecanica.demo.enums;

public enum TipoPagamento {
    PIX(1, "Pix"),
    ESPECIE(2, "Valor em dinheiro"),
    CARTAO(3, "Cartão");

    private int cod;
    private String descricao;

    private TipoPagamento(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod(){
        return cod;
    }

    public String getDescricao(){
        return descricao;
    }

    public static TipoPagamento toEnum(Integer cod){
        if(cod == null) {
            return null;
        }

        for(TipoPagamento x : TipoPagamento.values()) {
            if(x.getCod() == cod){
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido. " + cod);
    }
}