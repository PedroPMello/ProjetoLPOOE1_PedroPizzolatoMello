/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pedro
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    
    public String mostraInfoP() {
        return "ID: " + id + "\nNome: " + nome + "\nDescrição: " + descricao + "\nPreço: " + preco;
    }
    
    // getter
    public double getPreco() {
        return preco;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getId() {
        return id;
    }

    // setter
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
