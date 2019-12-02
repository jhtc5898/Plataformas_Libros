package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Prestamo;

@Stateless
public class PrestamoDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Prestamo prestamo) {
		em.persist(prestamo);
	}
	
	public void update(Prestamo prestamo) {
		em.merge(prestamo);
	}
	
	public void remove(int codigo) {
		em.remove(this.read(codigo));
	}
	
	public Prestamo read(int codigo) {
		return em.find(Prestamo.class, codigo);
	}
	
	public List<Prestamo> getPrestamo(){
		String jpql = "SELECT p FROM prestamo p";
		Query q = em.createQuery(jpql, Prestamo.class);
		
		List<Prestamo> prestamo = q.getResultList();
		
		return prestamo;
	}

}
