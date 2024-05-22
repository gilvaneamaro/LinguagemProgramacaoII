package edu.fatec.lp2.exercicio2;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("Comercial Esperança");
        Produto produto = new Produto("Café","mg",13.00,"Creapure",20.00, supermercado);
        Produto produto2 = new Produto("Creatina","mg",120.00,"extra torrado",20.00, supermercado);

        ItemCompra itemCompra = new ItemCompra(3,produto, 10.00);
        ListaCompra listaCompra = new ListaCompra(10);

        listaCompra.incluirProduto(itemCompra);
        listaCompra.incluirProduto(itemCompra);

        System.out.println(itemCompra.calcularPreco());
        listaCompra.calcularPreco();
    }
}