package edu.fatec.lp2.exercicio1;

public class MsgAudio extends  Mensagem{
    private Integer duracao;

    @Override
    public Mensagem sendMessage(String msg) {
        this.setConteudo(msg);
        return this;
    }
}
