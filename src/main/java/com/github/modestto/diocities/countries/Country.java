package com.github.modestto.diocities.countries;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pais")
public class Country {
    @Id
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String nomeportuga;

    @Column(name = "sigla")
    private String cod;

    private Integer bacen;

    public Long getId() {
        return id;
    }
    
    public String getname() {
        return name;
    }
    
    public String getnomeportuga() {
        return nomeportuga;
    }
    
    public String getcod() {
        return cod;
    }
    
    public Integer getbacen() {
        return bacen;
    }
}





