package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem {
    private Integer numChar;

    @Override
    public Mensagem sendMessage(String msg) {
        this.setConteudo(msg);
        return this;
    }
}
