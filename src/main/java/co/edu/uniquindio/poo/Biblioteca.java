package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Biblioteca {

    private String nombre;
    private String direccion;
    private double dineroRecaudado;
    private LinkedList<Estudiante> estudiantes;
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Libro> libros;
    private LinkedList<Prestamo> prestamos;

    public Biblioteca(String nombre, String direccion, double dineroRecaudado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dineroRecaudado = dineroRecaudado;
        estudiantes = new LinkedList <>();
        bibliotecarios = new LinkedList <>();
        libros = new LinkedList <>();
        prestamos = new LinkedList <>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDineroRecaudado() {
        return dineroRecaudado;
    }

    public void setDineroRecaudado(double dineroRecaudado) {
        this.dineroRecaudado = dineroRecaudado;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public LinkedList<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(LinkedList<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public LinkedList<Prestamo> getprestamos() {
        return prestamos;
    }

    public void setPrestamos(LinkedList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public boolean verificarEstudiante (String cedula){
        for (Estudiante estudiante : estudiantes){
            if (cedula.equals(estudiante.getCedula())){
                return false;
            }
        }
        return true;
    }

    public void agregarEstudiante (Estudiante estudiante){
        boolean esUnico = verificarEstudiante(estudiante.getCedula());
        if (esUnico){
            estudiantes.add(estudiante);
        }
        else{
            System.out.println("El estudiante ya existe");
        }
    }
    
    public boolean verificarBibliotecario (String cedula){
        for (Bibliotecario bibliotecario : bibliotecarios){
            if (cedula.equals(bibliotecario.getCedula())){
                return false;
            }
        }
        return true;
    }


    public void agrgarBibliotecario (Bibliotecario bibliotecario){
        boolean esUnico = verificarBibliotecario(bibliotecario.getCedula());
        if (esUnico){
            bibliotecarios.add(bibliotecario);
        }
        else{
            System.out.println("El bibliotecario ya existe");
        }
    }

    public Libro consultarLibro (String codigo){
        for (Libro libro: libros){
            if (libro.getCodigo().equals(codigo)){
                return libro;

            }
        }
        return null;

    }

    

    @Override
    public String toString() {
        return "biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", dineroRecaudado=" + dineroRecaudado
                + ", estudiantes=" + estudiantes + ", bibliotecarios=" + bibliotecarios + ", libros=" + libros + ", prestamos=" + prestamos + "]";
    }

}


