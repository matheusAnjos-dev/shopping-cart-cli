package service;

public class CartaoCredito implements Pagamento {
    public double pagar(double valor){
        // Cartao de credito possui taxa de 5%
        double taxa = valor * 0.05;
        return (valor + taxa);
    }
}
