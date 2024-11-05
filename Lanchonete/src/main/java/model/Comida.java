/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author pedro
 */
@Entity
@DiscriminatorValue("COMIDA")
public class Comida extends Produto{
    @Column(length = 255)
    private String ingredientes;
    
    public String getIngredientes(){
        return ingredientes;
    }
    
    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }

    public Comida(String ingredientes, Long id, String nome, String descricao, double preco) {
        super(id, nome, descricao, preco);
        this.ingredientes = ingredientes;
    }
    
    public Comida() {
        super();
    }
    
}
