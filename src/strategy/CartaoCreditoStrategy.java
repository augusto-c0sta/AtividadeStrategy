package strategy;

public class CartaoCreditoStrategy implements PagamentoStrategy {

    @Override
    public double calcular(double valor) {
        return valor * 1.05;
    }
}