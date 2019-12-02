package modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="nacionalidad")
	private String nacionalidad;
	
	@OneToMany(mappedBy="autor", cascade = CascadeType.ALL)
    private List<Libro> libros;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
		
	@Override
	public String toString() {
		return "Autor [codigo=" + codigo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
}
