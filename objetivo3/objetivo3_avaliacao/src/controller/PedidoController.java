package controller;

import model.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import static model.Tipo.ATENDIDO;

public class PedidoController {
    public static void main(String[] args) {


        //criação de vendedores
        Vendedor vendedor1 = new Vendedor(123, "Jaqueline", "Felix da Cunha", "Centro", "1120", "Pelotas", "RS", "Pelotas");

        //criação de fornecedores
        Fornecedor fornecedor1 = new Fornecedor("44.654.985/0214-96", "53 984563-0236", "Cis Fornecimentos RS");
        Fornecedor fornecedor2 = new Fornecedor("99.456.286/1425-63", "53 32054585", "Faber Castell Ltda");

        //criação de produtos
        Produto produto1 = new Produto(145, "Lapiseira 1.0 Cis", 988, 19.90, fornecedor1);
        Produto produto2 = new Produto(114, "Borracha Cis", 886, 5.99, fornecedor1);
        Produto produto3 = new Produto(132, "Caderno Faber Castell", 1033, 35.90, fornecedor2);
        Produto produto4 = new Produto(143, "Caneta 0.7 Faber Castell", 755, 6.99, fornecedor2);

        //criação de itens
        Item item1 = new Item(702, 0.0, 2, produto1);
        Item item4 = new Item(705, 0.0, 1, produto2);
        Item item2 = new Item(703, 0.0, 3, produto3);
        Item item3 = new Item(704, 0.0, 5, produto4);

        //aplicação de vendas
        Pedido pedido1 = new Pedido(2154, LocalDateTime.of(2023, 11, 27, 9, 30),
                item1.getQuantidade() * produto1.getPreco() - item1.getDesconto(), vendedor1, item1, ATENDIDO);

        Pedido pedido2 = new Pedido(2155, LocalDateTime.of(2023, 11, 27, 9, 38),
                item2.getQuantidade() * produto2.getPreco() - item2.getDesconto(), vendedor1, item2, ATENDIDO);

        //vendas salvas na coleção
        List<Pedido> pedidoList = new ArrayList<>();
        pedidoList.add(pedido1);
        pedidoList.add(pedido2);

        System.out.println("Vendas realizadas:\n");
        System.out.println(pedidoList);


        //relatório de vendas
        //tratamento de exceção
        int estoquep1, estoquep2;

        System.out.println("Estoque dos produtos pós venda:\n");

        estoquep1 = produto1.getQuantidade() - item1.getQuantidade();
        estoquep2 = produto2.getQuantidade() - item2.getQuantidade();

        System.out.println("Relatório de vendas:\n");
        System.out.println("Estoque do produto " + produto1.getNome() + ":" + estoquep1);
        System.out.println("Estoque do produto " + produto2.getNome() + ":" + estoquep2);
        System.out.println("Estoque do produto " + produto3.getNome() + ":" + produto3.getQuantidade());
        System.out.println("Estoque do produto " + produto4.getNome() + ":" + produto4.getQuantidade());

        //entradas de estoque
        Fornecimento fornecimento1 = new Fornecimento(LocalDateTime.of(2023, 11, 27, 9, 55), produto2.getPreco() * 150, fornecedor1, produto2);
        Fornecimento fornecimento2 = new Fornecimento(LocalDateTime.of(2023, 11, 27, 15, 35), produto3.getPreco() * 300, fornecedor2, produto3);

        List<Fornecimento> fornecimentoList = new ArrayList<>();
        fornecimentoList.add(fornecimento1);
        fornecimentoList.add(fornecimento2);

        System.out.println("Relatório de fornecimento:\n");
        System.out.println(fornecimentoList);
    }
}

