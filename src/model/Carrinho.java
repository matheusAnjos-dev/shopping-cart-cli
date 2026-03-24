package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    List<Produto> carrinhoList = new ArrayList<>();

    public void adicionar(Produto p){
        carrinhoList.add(p);
    }
    public void remover(Produto p){
        int id = p.getId();
        carrinhoList.remove(id);
    }
    public double calcularTotal(){
        double precoTotal = 0;
        for(Produto p : carrinhoList){
            precoTotal = p.getPreco();
        }
        return precoTotal;
    }
    public void listarCarrinho(){
        /*if(carrinhoList.isEmpty()){
            System.out.println("O carrinho está vazio");
        }*/
        if(!carrinhoList.isEmpty()){
            for(Produto p : carrinhoList) {
                System.out.println(p.getId() + " - Produto:" + p.getNome() + " | Preço:R$" + p.getPreco());
            }
        }

    }

}
