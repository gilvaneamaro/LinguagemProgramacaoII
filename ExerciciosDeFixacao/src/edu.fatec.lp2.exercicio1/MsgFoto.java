package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem{
    private Integer tamanho;

    @Override
    public Mensagem sendMessage(String msg) {
        this.setConteudo(msg);
        return this;
    }
}
