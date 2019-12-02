package negocio;

import javax.ejb.Remote;

import modelo.Libro;

@Remote
public interface GestionLibrosRemote {
	
	public void guardarLibro(Libro libro);
	
}
