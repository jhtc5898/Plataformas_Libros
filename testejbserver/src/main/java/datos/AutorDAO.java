package datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import modelo.Autor;
import modelo.Categoria;
import modelo.Usuario;

@Stateless
public class AutorDAO {

	@Inject
	private EntityManager em;
	
	public void insert(Autor autor) {
		em.persist(autor);
	}
	
	public void update(Autor autor) {
		em.merge(autor);
	}
	
	public void remove(int codigo) {
		em.remove(this.read(codigo));
	}
	
	public Autor read(int codigo) {
		return em.find(Autor.class, codigo);
	}
	
	public List<Autor> getPersona(){
		String jpql = "SELECT * FROM Autor";
		Query q = em.createQuery(jpql, Autor.class);
		
		List<Autor> autores = q.getResultList();
		
		return autores;
	}
	
	public List<Autor> getAutoresNombre(String nombre){
		String jpql = "SELECT a FROM Autor a WHERE nombre LIKE ?1";
		Query q = em.createQuery(jpql, Autor.class);
		q.setParameter(1, "%" + nombre + "%");
		List<Autor> autores= q.getResultList();
		return autores;
	}
}
