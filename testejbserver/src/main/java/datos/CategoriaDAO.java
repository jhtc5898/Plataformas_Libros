package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Categoria;

@Stateless
public class CategoriaDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Categoria categoria) {
		em.persist(categoria);
	}
	
	public void update(Categoria categoria) {
		em.merge(categoria);
	}
	
	public void remove(int codigo) {
		em.remove(this.read(codigo));
	}
	
	public Categoria read(int codigo) {
		return em.find(Categoria.class, codigo);
	}
	
	public List<Categoria> getPersona(){
		String jpql = "SELECT * FROM Autor";
		Query q = em.createQuery(jpql, Categoria.class);
		
		List<Categoria> autores = q.getResultList();
		
		return autores;
	}
}
