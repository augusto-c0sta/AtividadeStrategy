package strategy;

public class PixStrategy implements PagamentoStrategy {

    @Override
    public double calcular(double valor) {
        return valor * 0.90;
    }
}