package org.example;

public class Passagem {
    private String tipoVoo;
    private double valorPassagem;

    public Passagem(String tipoVoo, double valorPassagem) {
        this.tipoVoo = tipoVoo;
        this.valorPassagem = valorPassagem;
    }

    public String getTipoVoo() {
        return tipoVoo;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }
}

