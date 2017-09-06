package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestePersistirCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-5N1-ESTACIONAMENTO-PU");      
        EntityManager em = emf.createEntityManager();
        Cliente c = new Cliente();
       
        c.setNome("Leticia");
        c.setCpf("03319394010");
        c.setRg("1234567891");
        c.setTelefone("05484210353");
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
     
    }
    
}
