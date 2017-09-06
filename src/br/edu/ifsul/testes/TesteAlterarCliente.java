package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TesteAlterarCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-5N1-ESTACIONAMENTO-PU");      
        EntityManager em = emf.createEntityManager();
        Cliente c = em.find(Cliente.class, 5);
        
        c.setNome("Regis");
        c.setRg("111111");
       
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
    }
    
}
