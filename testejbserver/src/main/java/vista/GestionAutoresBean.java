package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Autor;
import negocio.GestionAutores;

@ManagedBean
@SessionScoped
public class GestionAutoresBean {
	
	@Inject
	private GestionAutores ga;
	
	private List<Autor> autores;
	
	private Autor autor = new Autor();
	
	public String guardarAutor() {
		ga.guardarAutor(autor);
		return null;
	}

	public String actualizarAutor() {
		ga.actualizarAutor(autor);
		return null;
	}
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}
