package app;

import model.Carrinho;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setId(1);
        p.setNome("Bola");
        p.setPreco(10.0);
        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionar(p);
        carrinho1.listarCarrinho();


    }
}
