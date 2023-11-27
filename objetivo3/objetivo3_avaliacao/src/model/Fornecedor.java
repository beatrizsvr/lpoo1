package model;
import java.util.List;
import java.util.ArrayList;
public class Fornecedor {
    private int cnpj;
    private String contato;
    private String nome;
    //fornecedor x produto
    List<Produto> produtos = new ArrayList();
}
