package br.com.fuctura.mucambo.dominio;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by rose on 19/09/2015.
 */
@ManagedBean(name = "CategoriaProduto", eager = true)
@RequestScoped
public class CategoriaProduto {
    private Integer idcateg;
    private String categnome;
    public Integer getIdcateg(){return idcateg;}
    public void setIdcateg(Integer id_categ){this.idcateg = id_categ;}
    public String getCategnome(){return categnome;}
    public void setCategnome(){this.idcateg = idcateg;}
}
