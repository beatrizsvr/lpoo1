package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDateTime data;
    private double valor;

    //associacao com multiplicidade
    Vendedor vendedor;

    //composicão com a classe item
    private Item item;
    private List<Item> itens = new ArrayList();
    private Tipo status;

    public Pedido() {
    }

    public Pedido(int numero, LocalDateTime data, double valor, Vendedor vendedor, Item item, Tipo status) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.item = item;
        this.status = status;
    }

    public Pedido(int numero, LocalDateTime data, double valor, Vendedor vendedor, Item item, List<Item> itens, Tipo status) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.item = item;
        this.itens = itens;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Tipo getStatus() {
        return status;
    }

    public void setStatus(Tipo status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", vendedor=" + vendedor +
                ", item=" + item +
                ", itens=" + itens +
                ", status=" + status +
                '}';
    }
}
