package com.mecanica.demo.enums;

public enum EstadoPagamento {
    PENDENTE(1, "Pendente"),
    PAGO(2, "Pago");

    private int cod;
    private String descricao;

    private EstadoPagamento(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod(){
        return cod;
    }

    public String getDescricao(){
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer cod){
        if(cod == null) {
            return null;
        }

        for(EstadoPagamento x : EstadoPagamento.values()) {
            if(x.getCod() == cod){
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido. " + cod);
    }
}