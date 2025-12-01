package br.dev.daniele.leitura_escrita.model;

public class Contato {
    public String id;
    public String nome;
    public String email;
    public String telefone;

    public String separarDadosContato(){
        String contatoSeparado = id + "; " + nome + "; " + email + "; " + telefone + "\n";
        return contatoSeparado;
    }

}