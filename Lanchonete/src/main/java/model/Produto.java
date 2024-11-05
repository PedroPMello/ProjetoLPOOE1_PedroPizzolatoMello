/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_produtos")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome", length = 100, nullable = false) // Tamanho máximo de 100 caracteres
    private String nome;

    @Column(name = "preco", nullable = false) // Não há necessidade de especificar tamanho para números
    private Double preco;
    
    @Column(name = "descricao", length = 255) // Tamanho máximo de 255 caracteres
    private String descricao;

    // Relação ManyToMany com Pedido
    @ManyToMany
    @JoinTable(
        name = "tb_pedidos_produtos", 
        joinColumns = @JoinColumn(name = "produto_id"), 
        inverseJoinColumns = @JoinColumn(name = "pedido_id")
    )
    private List<Pedido> pedidos = new ArrayList<>();

    public String mostraInfoP() {
        return "ID: " + id + "\nNome: " + nome + "\nDescrição: " + descricao + "\nPreço: " + preco;
    }

    // Getters
    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public Long getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    // Setters
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    // Construtores
    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
}
