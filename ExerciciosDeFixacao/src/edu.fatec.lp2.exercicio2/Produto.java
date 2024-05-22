package edu.fatec.lp2.exercicio2;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Produto {

    private String nome;
    private String unidade;
    private Double preco;
    private String descricao;
    private Double descontoMaximo;
    private Supermercado supermercado;

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", descontoMaximo=" + descontoMaximo +
                ", supermercado=" + supermercado +
                '}';
    }

    public Produto(String nome, String unidade, Double preco, String descricao, Double descontoMaximo, Supermercado supermercado) {
        this.nome = nome;
        this.unidade = unidade;
        this.preco = preco;
        this.descricao = descricao;
        this.descontoMaximo = descontoMaximo;
        this.supermercado = supermercado;
    }
}
