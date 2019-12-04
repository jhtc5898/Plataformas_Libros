package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.AutorDAO;
import modelo.Autor;
import modelo.Categoria;

@Stateless
public class GestionAutores {

	@Inject
	private AutorDAO autorDAO;
	
	public void guardarAutor(Autor autor) {
		if(autorDAO.read(autor.getCodigo())==null) {
			autorDAO.insert(autor);
		}else {
			autorDAO.update(autor);
		}
	}
	
	public void actualizarAutor(Autor autor) {
		autorDAO.update(autor);
	}
	
	public List<Autor> getAutoresNombre(String nombre) {	
		return autorDAO.getAutoresNombre(nombre);
	}
}
