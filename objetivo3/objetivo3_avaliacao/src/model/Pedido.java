package model;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numero;
    private Date data;
    private double valor;

    //associacao com multiplicidade
    Vendedor vendedor;

    //composicão com a classe item
    private List<Item> itens = new ArrayList();

    private Tipo status;

    public boolean manterPedido(int numero){
        return true;
    }
    public boolean manterItem(int codItem){
        return true;
    }
}
