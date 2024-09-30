package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Libro {
    private String codigo;
    private String isbn;
    private String autor;
    private String titulo;
    private String editorial;
    private LocalDate fechaPublicacion;
    private int unidadesDisponibles;
    private EstadoLibro estadoLibro;


    public Libro(String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fechaPublicacion,
            int unidadesDisponibles, EstadoLibro estadoLibro) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
        this.estadoLibro = estadoLibro;
    }


    /**
     * Metodo que permite verificar la disponibilidad de un libro
     * @param cantidad
     * @return true si hay suficientes unidades
     */

    public boolean libroDisponible(int cantidad) {
        return this.unidadesDisponibles >= cantidad; 
    }


    /**
     * Metodo que permite disminuir la cantidad de libros según la cantidad que se solicite y modifica su estado según si se encuentra disponile o no disponible
     * @param cantidad
     */

    public void disminuirCantidad(int cantidad) {

        if (this.unidadesDisponibles >= cantidad) {

            this.unidadesDisponibles = this.unidadesDisponibles - cantidad;
            if (this.unidadesDisponibles == 0) {
                this.estadoLibro = EstadoLibro.NO_DISPONIBLE;
            } else {
                this.estadoLibro = EstadoLibro.DISPONIBLE;
            }
        }
    }

    /**
     * Metodo que permite sumar la cantidad total de libros cuando alguien haga la devolución y modifica su estado a disponible
     * @param cantidad
     */

    public void sumarCantidad(int cantidad) {
        this.unidadesDisponibles = this.unidadesDisponibles + cantidad;
        if (this.unidadesDisponibles > 0) {
            this.estadoLibro = EstadoLibro.DISPONIBLE;
        }
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public EstadoLibro getEstadoLibro() {
        return estadoLibro;
    }

    public void setEstadoLibro(EstadoLibro estadoLibro) {
        this.estadoLibro = estadoLibro;
    }

    
    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", fechaPublicacion=" + fechaPublicacion + ", unidadesDisponibles=" + unidadesDisponibles
                + ", estadoLibro=" + estadoLibro + "]";
    }
    

  
}

