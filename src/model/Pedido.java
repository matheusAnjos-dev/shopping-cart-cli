package model;

import service.Pagamento;

public class Pedido {
    private Carrinho carrinho;
    private Pagamento pagamento;

    public Pedido(Carrinho carrinho , Pagamento pagamento){
        this.carrinho = carrinho;
        this.pagamento = pagamento;
    }

    public double finalizar(){
        double total = carrinho.calcularTotal();
        return pagamento.pagar(total);
        //pega o total do carrinho e utiliza pagar() de acordo com cada tipo de pagamento via interface
    }
}
