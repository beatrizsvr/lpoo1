package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    //associação da classe Fornecedor
    private Fornecedor fornecedor;

    //composição da classe Item
    private List<Item> itemList = new ArrayList<>();

    public Produto() {
    }

    public Produto(int codigo, String nome, int quantidade, double preco, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public Produto(int codigo, String nome, int quantidade, double preco, Fornecedor fornecedor, List<Item> itemList) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.itemList = itemList;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", fornecedor=" + fornecedor +
                ", itemList=" + itemList +
                '}';
    }
}
