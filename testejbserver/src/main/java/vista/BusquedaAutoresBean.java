package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Autor;
import negocio.GestionAutores;

@ManagedBean
@SessionScoped
public class BusquedaAutoresBean {

	@Inject
	private GestionAutores ga;
	
	private String nombre;
	private List<Autor> autores;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	public String buscar() {
		autores = ga.getAutoresNombre(nombre);
		return null;
	}
}
