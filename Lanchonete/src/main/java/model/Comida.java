/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pedro
 */
public class Comida extends Produto{
    private String ingredientes;
    
    public String getIngredientes(){
        return ingredientes;
    }
    
    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }
}
