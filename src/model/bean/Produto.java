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
public class Produto {
    private Integer prodCod;
    private Date prodDataInsercao;
    private Date prodDataAtualizacao;
    private String prodNome;
    private String prodDescricao;
    private Float prodValorCompra;
    private Float prodValorVenda;
    private Funcionario prodFuncionario;

    public Produto() {
    }

    public Produto(Integer prodCod, Date prodDataInsercao, Date prodDataAtualizacao, String prodNome, String prodDescricao, Float prodValorCompra, Float prodValorVenda, Funcionario prodFuncionario) {
        this.prodCod = prodCod;
        this.prodDataInsercao = prodDataInsercao;
        this.prodDataAtualizacao = prodDataAtualizacao;
        this.prodNome = prodNome;
        this.prodDescricao = prodDescricao;
        this.prodValorCompra = prodValorCompra;
        this.prodValorVenda = prodValorVenda;
        this.prodFuncionario = prodFuncionario;
    }

    

    
    public Date getProdDataInsercao() {
        return prodDataInsercao;
    }

    public void setProdDataInsercao(Date prodDataInsercao) {
        this.prodDataInsercao = prodDataInsercao;
    }

    public Date getProdDataAtualizacao() {
        return prodDataAtualizacao;
    }

    public void setProdDataAtualizacao(Date prodDataAtualizacao) {
        this.prodDataAtualizacao = prodDataAtualizacao;
    }

    

    public Integer getProdCod() {
        return prodCod;
    }

    public void setProdCod(Integer prodCod) {
        this.prodCod = prodCod;
    }

    public String getProdNome() {
        return prodNome;
    }

    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }

    public String getProdDescricao() {
        return prodDescricao;
    }

    public void setProdDescricao(String prodDescricao) {
        this.prodDescricao = prodDescricao;
    }
    

    public Float getProdValorCompra() {
        return prodValorCompra;
    }

    public void setProdValorCompra(Float prodValorCompra) {
        this.prodValorCompra = prodValorCompra;
    }

    public Float getProdValorVenda() {
        return prodValorVenda;
    }

    public void setProdValorVenda(Float prodValorVenda) {
        this.prodValorVenda = prodValorVenda;
    }

    public Funcionario getProdFuncionario() {
        return prodFuncionario;
    }

    public void setProdFuncionario(Funcionario prodFuncionario) {
        this.prodFuncionario = prodFuncionario;
    }
    
    
}
