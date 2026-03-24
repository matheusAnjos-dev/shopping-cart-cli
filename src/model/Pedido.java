package model;

import service.Pagamento;

public class Pedido {
    private Carrinho carrinho;
    private Pagamento pagamento;

    public void finalizar(){
        System.out.println("Pagamento finalizado.");
    }
}
