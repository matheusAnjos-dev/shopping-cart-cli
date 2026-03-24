package service;

public class PagamentoFactory {
    public static Pagamento criar(int i){

        switch (i){
            case 1:
                return new Pix();
            case 2:
                return new CartaoCredito();
            case 3:
                return new Boleto();
            default:
                throw new IllegalArgumentException("Opção de pagamento inválida.");
        }

    }
}
