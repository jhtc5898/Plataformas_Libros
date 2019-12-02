package vista;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import modelo.Libro;
import modelo.Prestamo;
import modelo.Usuario;
import negocio.GestionPrestamos;

@ManagedBean
@SessionScoped
public class GestionPrestamosBean {

	@Inject
	private GestionPrestamos gp;
	
	private List<Prestamo> prestamos;
	
	/*Bean Properties*/
	private Prestamo prestamo = new Prestamo();
	
	/*Action Controller*/
	public String guardarPrestamo() {
		gp.guardarPrestamo(prestamo);
		return null;
	}
	
	@PostConstruct
	public void init() {
		prestamo = new Prestamo();
		prestamo.setUsuario(new Usuario());
		prestamo.setLibro(new Libro());
		Date date = new Date();
		prestamo.setFechaInicio(date);
	}
	
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}
}
