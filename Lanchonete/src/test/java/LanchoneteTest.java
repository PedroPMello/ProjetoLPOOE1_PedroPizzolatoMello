/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pedro
 */
import model.Cliente;
import model.Produto;
import model.Pedido;

import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;

import static org.junit.Assert.*;
/*
public class LanchoneteTest {
    private EntityManagerFactory emf;
    private EntityManager em;

    @Before
    public void setUp() {
        emf = Persistence.createEntityManagerFactory("LanchonetePU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    @After
    public void tearDown() {
        if (em.getTransaction().isActive()) {
            em.getTransaction().rollback(); // Reverte qualquer transação ativa
        }
        em.close();
        emf.close();
    }

    @Test
    public void testeConexao() {
        assertNotNull(em);
        assertTrue(em.isOpen()); 
        System.out.println("Conexão realizada com sucesso");
    }

    @Test
    public void testePersistirCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste de Cliente");
        cliente.setTelefone("123456789");
        cliente.setEndereco("Rua Teste, 123");

        em.persist(cliente);
        em.getTransaction().commit();

        Cliente clientePersistido = em.find(Cliente.class, cliente.getId());
        assertNotNull(clientePersistido); 
        assertEquals("Teste de Cliente", clientePersistido.getNome());
        System.out.println("Cliente persistido com sucesso!");
    }

    @Test
    public void testePersistirProduto() {
        Produto produto = new Produto();
        produto.setNome("Teste de Produto");
        produto.setPreco(10.00);

        em.persist(produto);
        em.getTransaction().commit(); 

        Produto produtoPersistido = em.find(Produto.class, produto.getId());
        assertNotNull(produtoPersistido); 
        assertEquals("Teste de Produto", produtoPersistido.getNome());
        System.out.println("Produto persistido com sucesso!");
    }

    @Test
    public void testePersistirPedido() {
        Cliente cliente = new Cliente();
        cliente.setNome("Cliente para Pedido");
        cliente.setTelefone("987654321");
        cliente.setEndereco("Rua Pedido, 456");

        em.persist(cliente);
        em.getTransaction().commit();

        Produto produto = new Produto();
        produto.setNome("Produto para Pedido");
        produto.setPreco(15.00);

        em.persist(produto);
        em.getTransaction().commit(); 

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.addProduto(produto);

        em.persist(pedido);
        em.getTransaction().commit();

        Pedido pedidoPersistido = em.find(Pedido.class, pedido.getID()); 
        assertNotNull(pedidoPersistido); 
        assertEquals(cliente.getId(), pedidoPersistido.getCliente().getId());
        System.out.println("Pedido persistido com sucesso!");
    }
}
*/