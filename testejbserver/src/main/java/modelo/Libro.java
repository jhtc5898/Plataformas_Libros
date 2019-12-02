package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Libro implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="titulo")
	private String titulo;
		
	@Column(name="anio")
	private String anio;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="numeroPaginas")
	private int numeroPaginas;
	
	@Column(name="idioma")
	private String idioma;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="autor_codigo", nullable=false)
    private Autor autor;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="categoria_codigo", nullable=false)
    private Categoria categoria;
	
	@OneToMany(mappedBy="libro", cascade = CascadeType.ALL)
    private List<Prestamo> prestamos;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", titulo=" + titulo + ", anio=" + anio + ", descripcion="
				+ descripcion + ", numeroPaginas=" + numeroPaginas + ", idioma=" + idioma + ", autor=" + autor
				+ ", categoria=" + categoria + ", prestamos=" + prestamos + "]";
	}
}
