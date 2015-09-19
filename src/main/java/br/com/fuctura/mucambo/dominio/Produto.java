/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.mucambo.dominio;

/**
 *
 * @author home
 */
public class Produto {
        
    private Integer ID;
    private String Descricao;
    private String Nome;
    private String Categoria;
    private Float Preco;
    private String Status;
    
    public Integer getId(){
        return ID;
    }
    
    public void setID(Integer ID){
        this.ID = ID;
    }
    
    public String getDescricao(){
        return Descricao;
    }
    
    public void setDescricao(String Descricao){
        this.Descricao = Descricao;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public String getCategoria(){
        return Categoria;
    }
    
    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }
    
    public Float getPreco(){
        return Preco;        
    }
    
    public void getPreco(Float Preco){
        this.Preco = Preco;
    }
    
    public String getStatus(){
        return Status;
    }
    
    public void setStatus(String Status){
        this.Status = Status;
    }
    
}
