package service;

public class Boleto implements Pagamento{
    public double pagar(double valor){
        // boleto possui taxa de 2%
        double taxa = valor * 0.02;
        return (valor + taxa);
    }
}
