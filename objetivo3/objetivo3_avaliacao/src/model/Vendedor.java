package model;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario{
    private String local;
   private List<Pedido> pedidoList = new ArrayList<>();

    public Vendedor() {
    }



    public Vendedor(String local, List<Pedido> pedidoList) {
        this.local = local;
        this.pedidoList = pedidoList;
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local, List<Pedido> pedidoList) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
        this.pedidoList = pedidoList;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "local='" + local + '\'' +
                ", pedidoList=" + pedidoList +
                '}';
    }
}
