package model;

import strategy.PagamentoStrategy;

public class Pedido {

    private double valor;
    private PagamentoStrategy estrategia;

    public Pedido(double valor, PagamentoStrategy estrategia) {
        this.valor = valor;
        this.estrategia = estrategia;
    }

    public double calcularTotal() {
        return estrategia.calcular(valor);
    }

    public void alterarEstrategia(PagamentoStrategy novaEstrategia) {
        this.estrategia = novaEstrategia;
    }
}