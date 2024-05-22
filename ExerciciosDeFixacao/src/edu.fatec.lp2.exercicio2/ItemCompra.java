package edu.fatec.lp2.exercicio2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemCompra implements Calculavel {
    private Integer quantidade;
    private Produto produto;
    private Double desconto;

    public ItemCompra(Produto produto, Double desconto) {
        this.produto = produto;
        this.desconto = desconto;
    }

    @Override
    public Double calcularPreco(){
        return produto.getPreco()* quantidade - produto.getPreco() *quantidade * (desconto / 100);
    }

    public ItemCompra(Integer quantidade, Produto produto, Double desconto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.desconto = desconto;
    }
}
