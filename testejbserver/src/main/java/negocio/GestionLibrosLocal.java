package negocio;

import javax.ejb.Local;

import modelo.Libro;

@Local
public interface GestionLibrosLocal {
	
	public void guardarLibro(Libro libro);
	
}
