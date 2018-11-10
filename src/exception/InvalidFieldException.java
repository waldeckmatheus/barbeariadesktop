/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Equipe barbearia
 */
public class InvalidFieldException extends Exception{

    private String field;
    
    public InvalidFieldException() {
        super();
    }

    public InvalidFieldException(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
    
    
    
}
