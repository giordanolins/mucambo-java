package br.com.fuctura.mucambo.dominio;

public class FormaPagamento {
    private int id;
    private String nome;
    //private String Status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
