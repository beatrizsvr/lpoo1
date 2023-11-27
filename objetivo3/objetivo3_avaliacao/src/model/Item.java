package model;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private int codItem;
    private double desconto;
    private int quantidade;
    private Produto produto;
    private Pedido pedido;

    public Item() {
    }

    public Item(int codItem, double desconto, int quantidade, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Item(int codItem, double desconto, int quantidade, Produto produto, Pedido pedido) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
        this.pedido = pedido;
    }

    public int getCodItem() {
        return codItem;
    }

    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codItem=" + codItem +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                ", pedido=" + pedido +
                '}';
    }
}

