package br.com.fuctura.mucambo.controller;

import br.com.fuctura.mucambo.dominio.FormaPagamento;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlInputText;
import java.util.ArrayList;

@ManagedBean
@ViewScoped
public class FormaPagamentoController {

    private ArrayList<FormaPagamento> formasPagamento;

    private HtmlInputText inputNome;

    public FormaPagamentoController(){
        this.formasPagamento = new ArrayList<FormaPagamento>();
    }

    public void salvar() {
        FormaPagamento fp = new FormaPagamento();
        fp.setNome(this.inputNome.getValue().toString());

        this.inputNome.resetValue();

        this.formasPagamento.add(fp);
    }

    public HtmlInputText getInputNome() {
        return inputNome;
    }

    public void setInputNome(HtmlInputText inputNome) {
        this.inputNome = inputNome;
    }

    public ArrayList<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }

    public void setFormasPagamento(ArrayList<FormaPagamento> formasPagamento) {
        this.formasPagamento = formasPagamento;
    }
}
