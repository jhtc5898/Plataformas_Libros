package vista;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Libro;
import modelo.Autor;
import modelo.Categoria;
import negocio.GestionLibros;

@ManagedBean
@SessionScoped
public class GestionLibrosBean {
	
	@Inject
	private GestionLibros gl;
	
	private List<Libro> libros;
	
	/*Bean Properties*/
	private Libro libro = new Libro();
	
	/*Action Controller*/
	public String guardarLibro() {
		gl.guardarLibro(libro);
		return null;
	}
	
	public List<Libro> buscarLibro() {
		return gl.getLibros();
	}
			
	@PostConstruct
	public void init() {
		libro = new Libro();
		libro.setAutor(new Autor());
		libro.setCategoria(new Categoria());
	}

	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
}
