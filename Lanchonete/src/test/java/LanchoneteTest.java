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
/*
import org.junit.jupiter.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

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
        assertNotNull(em); // Verifica se o EntityManager foi criado
        assertTrue(em.isOpen()); // Verifica se a conexão está aberta
        System.out.println("Conexão realizada com sucesso");
    }

    @Test
    public void testePersistirCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste de Cliente");
        cliente.setTelefone("123456789");
        cliente.setEndereco("Rua Teste, 123");

        em.persist(cliente);
        em.getTransaction().commit(); // Comita a transação

        Cliente clientePersistido = em.find(Cliente.class, cliente.getId()); // Supondo que existe um método getId()
        assertNotNull(clientePersistido); // Verifica se o cliente foi persistido
        assertEquals("Teste de Cliente", clientePersistido.getNome());
        System.out.println("Cliente persistido com sucesso!");
    }

    @Test
    public void testePersistirProduto() {
        Produto produto = new Produto();
        produto.setNome("Teste de Produto");
        produto.setPreco(10.00);

        em.persist(produto);
        em.getTransaction().commit(); // Comita a transação

        Produto produtoPersistido = em.find(Produto.class, produto.getId()); // Supondo que existe um método getId()
        assertNotNull(produtoPersistido); // Verifica se o produto foi persistido
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
        em.getTransaction().commit(); // Comita a transação para o cliente

        Produto produto = new Produto();
        produto.setNome("Produto para Pedido");
        produto.setPreco(15.00);

        em.persist(produto);
        em.getTransaction().commit(); // Comita a transação para o produto

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.addProduto(produto); // Supondo que você tenha um método addProduto

        em.persist(pedido);
        em.getTransaction().commit(); // Comita a transação

        Pedido pedidoPersistido = em.find(Pedido.class, pedido.getId()); // Supondo que existe um método getId()
        assertNotNull(pedidoPersistido); // Verifica se o pedido foi persistido
        assertEquals(cliente.getId(), pedidoPersistido.getCliente().getId());
        System.out.println("Pedido persistido com sucesso!");
    }
}
*/