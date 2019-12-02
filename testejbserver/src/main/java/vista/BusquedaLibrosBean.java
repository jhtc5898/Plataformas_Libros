package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Libro;
import negocio.GestionLibros;

@ManagedBean
@SessionScoped
public class BusquedaLibrosBean {
	
	@Inject
	private GestionLibros gl;
	
	private String nombre;
	private List<Libro> libros;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
	public String buscar() {
		libros = gl.getLibrosNombre(nombre);
		return null;
	}
}
