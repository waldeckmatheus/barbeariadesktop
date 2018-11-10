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
public class Venda {
    private Integer venCod;
    private Date venData;
    private Funcionario funcionario;
    private Produto produto;
    private Servico servico;;

    public Venda() {
    }

    public Venda(Integer venCod, Date venData, Funcionario funcionario, Produto produto, Servico servico) {
        this.venCod = venCod;
        this.venData = venData;
        this.funcionario = funcionario;
        this.produto = produto;
        this.servico = servico;
    }

    public Integer getVenCod() {
        return venCod;
    }

    public void setVenCod(Integer venCod) {
        this.venCod = venCod;
    }

    public Date getVenData() {
        return venData;
    }

    public void setVenData(Date venData) {
        this.venData = venData;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    
    
    
    
}
