package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Categoria;
import negocio.GestionCategorias;

@ManagedBean
@SessionScoped
public class GestionCategoriasBean {

	@Inject
	private GestionCategorias gc;
	
	private List<Categoria> categorias;
	
	private Categoria categoria = new Categoria();
	
	public String guardarCategoria() {
		gc.guardarCategoria(categoria);
		return null;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
}
