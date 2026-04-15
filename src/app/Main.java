package app;

import model.Pedido;
import strategy.*;

public class Main {

    public static void main(String[] args) {

        // cenario 1  cartão
        Pedido pedido1 = new Pedido(200, new CartaoCreditoStrategy());
        System.out.println("Pagamento com Cartão: R$ " + pedido1.calcularTotal());

        // cenario 2 pix
        Pedido pedido2 = new Pedido(200, new PixStrategy());
        System.out.println("Pagamento com Pix: R$ " + pedido2.calcularTotal());

        // cenario 3  boleto
        Pedido pedido3 = new Pedido(200, new BoletoStrategy());
        System.out.println("Pagamento com Boleto: R$ " + pedido3.calcularTotal());

        // cenario 4  troca de estrategia
        Pedido pedido4 = new Pedido(200, new CartaoCreditoStrategy());
        System.out.println("\nAlterando forma de pagamento...");
        
        pedido4.alterarEstrategia(new PixStrategy());
        System.out.println("Novo total com Pix: R$ " + pedido4.calcularTotal());
    }
}