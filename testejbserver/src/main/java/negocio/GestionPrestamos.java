package negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import datos.PrestamoDAO;
import modelo.Prestamo;

@Stateless
public class GestionPrestamos {

	@Inject
	private PrestamoDAO prestamoDAO;
	
	public void guardarPrestamo(Prestamo prestamo) {
		if(prestamoDAO.read(prestamo.getCodigo())==null) {
			prestamoDAO.insert(prestamo);
		}else {
			prestamoDAO.update(prestamo);
		}
	}
}
