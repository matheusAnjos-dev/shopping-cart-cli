package app;

import model.Carrinho;
import model.Pedido;
import model.Produto;
import service.Pagamento;
import service.PagamentoFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Map para cadastro e busca de produtos
        Map<Integer,Produto> catalogo = new HashMap<>();
        catalogo.put(1, new Produto("Bola", 10.0, 1));
        catalogo.put(2, new Produto("Cubo Mágico", 55.0, 2));
        catalogo.put(3, new Produto("Camisa", 120.0, 3));
        catalogo.put(4, new Produto("Tênis", 250.0, 4));
        catalogo.put(5, new Produto("Mochila", 170.0, 5));

        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        int opcao;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos no carrinho");
            System.out.println("3 - Remover produto do carrinho");
            System.out.println("4 - Finalizar compra");

            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    //entrySet() retorna todos os pares do Map
                    for(Map.Entry<Integer,Produto> entry : catalogo.entrySet()){
                        Produto prod = entry.getValue();
                        System.out.println(entry.getKey() + "-" + prod.getNome() + " | R$" + prod.getPreco());
                    }
                    System.out.println("Selecione o ID do produto");
                    int escolha = sc.nextInt();
                    Produto selecionado = catalogo.get(escolha);
                    if(selecionado != null){
                        carrinho.adicionar(selecionado);
                        System.out.println("Produto adicionado");
                    }
                    else{
                        System.out.println("Produto inválido");
                    }
                    break;
                case 2:
                    carrinho.listarCarrinho();
                    break;
                case 3:
                    System.out.println("Selecione qual produto deseja remover pelo ID");
                    int idRemover = sc.nextInt();
                    carrinho.remover(idRemover);
                    break;
                case 4:
                    System.out.println("Selecione uma forma de pagamento:\n" +
                            "1 - Pix\n" +
                            "2 - Cartão de Crédito\n" +
                            "3 - Boleto");
                    int formaPagamento = sc.nextInt(); 
                    try {
                        Pagamento pagamento = PagamentoFactory.criar(formaPagamento);
                        Pedido pedido = new Pedido(carrinho, pagamento);
                        double total = pedido.finalizar();

                        System.out.println("Total do carrinho: R$" + total);
                        break;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        break;
                    }

            }

        }while (opcao!= 0);


    }
}
