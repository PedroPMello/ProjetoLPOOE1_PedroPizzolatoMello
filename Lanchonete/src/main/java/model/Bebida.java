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
@DiscriminatorValue("BEBIDA")
public class Bebida extends Produto{
    @Column(length = 50)
    private String tamanho;
    
    public String getTamanho(){
        return tamanho;
    }
    
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public Bebida() {
        super();
    }
    
    public Bebida(String tamanho, Long id, String nome, String descricao, double preco) {
        super(id, nome, descricao, preco);
        this.tamanho = tamanho;
    }
    
}
