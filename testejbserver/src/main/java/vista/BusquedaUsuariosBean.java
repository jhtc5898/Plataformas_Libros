package vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Usuario;
import negocio.GestionUsuarios;

@ManagedBean
@SessionScoped
public class BusquedaUsuariosBean {
	
	@Inject
	private GestionUsuarios gu;
	
	private String cedula;
	private List<Usuario> usuarios;
		
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public String buscar() {
		usuarios = gu.getUsuarioCedula(cedula);
		return null;
	}

}
