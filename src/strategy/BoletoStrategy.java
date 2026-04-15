package strategy;

public class BoletoStrategy implements PagamentoStrategy {

    @Override
    public double calcular(double valor) {
        return (valor * 0.95) + 2;
    }
}