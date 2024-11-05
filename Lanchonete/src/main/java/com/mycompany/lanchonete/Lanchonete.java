/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lanchonete;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Cliente;
import model.Comida;
import model.Bebida;
import model.Pedido;
import model.Produto;

public class Lanchonete {

       public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LanchonetePU");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Cliente cliente1 = new Cliente();
            cliente1.setNome("João da Silva");
            cliente1.setTelefone("123456789");
            cliente1.setEndereco("Rua A, 123");
            em.persist(cliente1);

            Cliente cliente2 = new Cliente();
            cliente2.setNome("Maria Oliveira");
            cliente2.setTelefone("987654321");
            cliente2.setEndereco("Rua B, 456");
            em.persist(cliente2);


            Produto produto1 = new Produto();
            produto1.setNome("Refrigerante");
            produto1.setPreco(5.00);
            em.persist(produto1);

            Produto produto2 = new Produto();
            produto2.setNome("Sanduíche");
            produto2.setPreco(10.00);
            em.persist(produto2);


            Pedido pedido1 = new Pedido();
            pedido1.setCliente(cliente1);
            pedido1.setData(new Date()); 
            pedido1.addProduto(produto1);
            pedido1.addProduto(produto2);
            em.persist(pedido1);

            Pedido pedido2 = new Pedido();
            pedido2.setCliente(cliente2);
            pedido2.setData(new Date()); 
            pedido2.addProduto(produto1);
            em.persist(pedido2);

            em.getTransaction().commit(); 
            System.out.println("Persistido com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
                System.out.println("Transação revertida devido a um erro.");
            }
        } finally {
            em.close();
            emf.close();
        }
    }
}

