package edu.fatec.lp2.exercicio2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
public class ListaCompra implements Calculavel {
    private List<ItemCompra> compraList = new LinkedList<>();
    @Setter
    private Integer qtdeMax;

    public ListaCompra(Integer qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    @Override
    public Double calcularPreco() {
        Double totalValor = 0.0;
        for (ItemCompra compra : compraList) {
            totalValor += compra.calcularPreco();
        }
        return totalValor;
    }

    public void incluirProduto(ItemCompra itemCompra){
        if(compraList.size() < qtdeMax && !compraList.contains(itemCompra))
            compraList.add(itemCompra);
        else System.out.println("Erro ao adicionar item na lista.");
    }
}
