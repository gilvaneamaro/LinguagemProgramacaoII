package edu.fatec.lp2.exercicio1;

import java.util.List;

public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;


    public Whatsapp(){}

    public List<Contatinho> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contatinho> contatos) {
        this.contatos = contatos;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }


}
