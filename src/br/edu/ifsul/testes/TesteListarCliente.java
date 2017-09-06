package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteListarCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DAW-5N1-ESTACIONAMENTO-PU");      
        EntityManager em = emf.createEntityManager();
        List<Cliente> lista = em.createQuery("from Cliente").getResultList();
            for(Cliente c: lista){
                System.out.println("ID: " + c.getId() + " Nome: " + c.getNome() + " RG: " + c.getRg() + " CPF: " + c.getCpf() + " Telefone: " + c.getTelefone());
            }
    }
    
}
