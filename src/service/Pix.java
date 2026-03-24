package service;

public class Pix implements Pagamento{
    @Override
    public double pagar(double valor){
        return valor;
    }
}
