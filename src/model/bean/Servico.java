/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.Date;

/**
 *
 * @author Equipe barbearia
 */
public class Servico {
    private Integer servCod;
    private Date servData;
    private String servNome;
    private Float servValor;

    public Servico() {
    }

    public Servico(Integer servCod, Date servData, String servNome, Float servValor) {
        this.servCod = servCod;
        this.servData = servData;
        this.servNome = servNome;
        this.servValor = servValor;
    }

    public Integer getServCod() {
        return servCod;
    }

    public void setServCod(Integer servCod) {
        this.servCod = servCod;
    }

    public Date getServData() {
        return servData;
    }

    public void setServData(Date servData) {
        this.servData = servData;
    }

    public String getServNome() {
        return servNome;
    }

    public void setServNome(String servNome) {
        this.servNome = servNome;
    }

    public Float getServValor() {
        return servValor;
    }

    public void setServValor(Float servValor) {
        this.servValor = servValor;
    }
}
