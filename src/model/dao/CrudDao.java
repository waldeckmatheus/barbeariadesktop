/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;

/**
 *
 * @author Equipe barbearia
 */

public interface  CrudDao<E> {//E representa a minha entidade 
    //trabalhando com generics
    //serve como forma quanqur um que vai utilizar vai ter que ter o salvar
  
    public void salvar(E entidade) ;
    public void deletar(int cod) ;
    public List<E> listar() ;
    public void alterar(E entidade);
          
    
}
