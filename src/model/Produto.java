package model;

public class Produto {
    private String nome;
    private double preco;
    private int id;

    public Produto(){

    }
    public Produto(String nome, double preco, int id){
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
}