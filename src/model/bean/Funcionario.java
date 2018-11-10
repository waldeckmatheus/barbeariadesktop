/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Equipe barbearia
 */
public class Funcionario {
    private Integer funCod;
    private String funNome ;
    private String  funLogin;
    private String  funSenha;
    private String funcao;
    private Integer funPercent;

    public Funcionario() {
    }

    public Integer getFunCod() {
        return funCod;
    }

    public void setFunCod(Integer funCod) {
        this.funCod = funCod;
    }

    public Integer getFunPercent() {
        return funPercent;
    }

    public void setFunPercent(Integer funPercent) {
        this.funPercent = funPercent;
    }
    

    public String getFunNome() {
        return funNome;
    }

    public void setFunNome(String funNome) {
        this.funNome = funNome;
    }

    public String getFunLogin() {
        return funLogin;
    }

    public void setFunLogin(String funLogin) {
        this.funLogin = funLogin;
    }

    public String getFunSenha() {
        return funSenha;
    }

    public void setFunSenha(String funSenha) {
        this.funSenha = funSenha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
   public static boolean funcionarioDevidamentePreenchido(Funcionario funcionario){
        if (funcionario.getFunCod()!=null
            && funcionario.getFunLogin()!=null
                && funcionario.getFunNome()!=null 
                    && funcionario.getFunPercent()!=null
                        && funcionario.getFunSenha()!=null
                            && funcionario.getFuncao()!=null){
            return true;
        }
        return false;
    }
    
}
