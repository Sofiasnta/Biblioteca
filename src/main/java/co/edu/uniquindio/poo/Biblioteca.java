package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {

    private String nombre;
    private String direccion;
    private double dineroRecaudado;
    private Collection<Estudiante> estudiantes;
    private Collection<Bibliotecario> bibliotecarios;
    private Collection<Prestamo> prestamos;
    private List<Libro> libros;
    private int cantidadLibrosTotales;


    public Biblioteca(String nombre, String direccion, double dineroRecaudado, int cantidadLibrosTotales) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dineroRecaudado = dineroRecaudado;
        this.cantidadLibrosTotales = cantidadLibrosTotales;
        estudiantes = new LinkedList<>();
        bibliotecarios = new LinkedList<>();
        libros = new LinkedList<>();
        prestamos = new LinkedList<>();
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

    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Collection<Bibliotecario> getBibliotecarios() {
        return bibliotecarios;
    }

    public void setBibliotecarios(Collection<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public int getCantidadLibrosTotales() {
        return cantidadLibrosTotales;
    }

    public void setCantidadLibrosTotales(int cantidadLibrosTotales) {
        this.cantidadLibrosTotales = cantidadLibrosTotales;
    }

    /**
     * Metodo que permite verificar la existencia de un estudiante
     * 
     * @param cedula
     * @return true si la cedula no existe en la lista; false si ya existe un
     *         estudiante con esa cedula
     */

    public boolean verificarEstudiante(String cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (cedula.equals(estudiante.getCedula())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite agregar estudiantes verificando que no hayan estudiantes
     * duplicados para agregarse
     * 
     * @param estudiante
     */

    public void agregarEstudiante(Estudiante estudiante) {
        boolean esUnico = verificarEstudiante(estudiante.getCedula());
        if (esUnico) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("El estudiante ya existe");
        }
    }

    /**
     * Metodo que permite verificar la existencia de un bibliotecario
     * 
     * @param cedula
     * @return true si la cedula no existe en la lista; false si ya existe un
     *         bibliotecario con esa cedula
     */

    public boolean verificarBibliotecario(String cedula) {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            if (cedula.equals(bibliotecario.getCedula())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite agregar bibliotecarios verificando que no hayan
     * bibliotecarios duplicados para agregarse
     * 
     * @param bibliotecario
     */

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        boolean esUnico = verificarBibliotecario(bibliotecario.getCedula());
        if (esUnico) {
            bibliotecarios.add(bibliotecario);
        } else {
            System.out.println("El bibliotecario ya existe");
        }
    }

    /**
     * Metodo que permite verificar la existencia de un libro
     * 
     * @param isbn
     * @return true si el isbn no existe en la lista; false si ya existe un libro con ese isbn
     */

    public boolean verificarLibro(String isbn) {
        for (Libro libro : libros) {
            if (isbn.equals(libro.getIsbn())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite agregar libros verificando que no hayan libros duplicados
     * para agregarse
     * 
     * @param libro
     */

    public void agregarLibro(Libro libro) {
        boolean esUnico = verificarLibro(libro.getIsbn());
        if (esUnico) {
            libros.add(libro);
        } else {
            System.out.println("El libro ya existe");
        }
    }

    /**
     * Metodo que permite verificar la existencia de un prestamo
     * 
     * @param codigo
     * @return true si el codigo no existe en la lista; false si ya existe un
     *         prestamo con ese codigo
     */

    public boolean verificarPrestamo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (codigo.equals(prestamo.getCodigo())) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo que permite agregar prestamos verificando que no hayan prestamos
     * duplicados para agregarse
     * 
     * @param prestamo
     */

    public void agregarPrestamo(Prestamo prestamo) {
        boolean esUnico = verificarPrestamo(prestamo.getCodigo());
        if (esUnico) {
            prestamos.add(prestamo);
        } else {
            System.out.println("El prestamo ya existe");
        }
    }


    /**
     * Metodo que permite reemplazar un libro por unp nuevo
     * @param isbn
     * @param nuevoLibro
     * @return 
     */
    public boolean reemplazarLibro(String isbn, Libro nuevoLibro) {
        for (int i = 0; i < libros.size(); i++) {
            Libro libroActual = libros.get(i);
            if (libroActual.getIsbn().equals(isbn)) {
                libros.set(i, nuevoLibro);
                System.out.println("El libro con isbn " + isbn + " ha sido reemplazado.");
                return true;
            }
        }

        System.out.println("El libro con isbn " + isbn + " no se encontró.");
        return false;
    }


    /**
     * Metodo que permite consultar los datos de un libro por medio de su codigo
     * 
     * @param codigo
     * @return libro
     */

    public Libro consultarLibro(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;

            }
        }
        return null;

    }

    /**
     * Metodo que pérmite calcular los datos de un prestamo por medio de su codigo
     * 
     * @param codigo
     * @return prestamo
     */

    public Prestamo consultarPrestamo(String codigo) {
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getCodigo().equals(codigo)) {
                return prestamo;

            }
        }
        return null;

    }

    /**
     * Metodo que permite consultar dado el titulo de un libro, en cuantos prestamos
     * se encuentra
     * 
     * @param titulo
     * @return contadorPrestamos
     */

    public int prestamosPorLibro(String titulo) {
        int contadorPrestamos = 0;
        for (Prestamo prestamo : prestamos) {
            for (DetallePrestamo detalle : prestamo.getDetallePrestamos()) {
                if (detalle.getLibro().getTitulo().equals(titulo)) {
                    contadorPrestamos++;
                    break; // sale del bucle cuando encuentra el libro
                }
            }
        }
        return contadorPrestamos;
    }

    /**
     * Metodo que permite calcular el salario de un bibliotecario deopendediendo de
     * la comision de cada prestamo y bonificacion de los años de antiguedad
     * 
     * @return salarioPagar
     */

    public double calcularSalarioEmpleados() {
        double salarioPagar = 0;
        for (Prestamo prestamo : prestamos) {
            Bibliotecario bibliotecario = prestamo.getBibliotecario();

            double totalPrestamo = prestamo.calcularPrecioFinalPrestamo();
            double comisionPrestamo = totalPrestamo * 0.20;

            int añosTrabajando = bibliotecario.getAñosTrabajando();
            double bonificacion = comisionPrestamo * (0.02 * añosTrabajando);

            salarioPagar += comisionPrestamo + bonificacion;
        }
        return salarioPagar;

    }

    /**
     * Meotodo que permite calcular el dinero recaudado por la biblioteca me cada
     * prestamo
     * 
     * @return totalDinero
     */

    public double calcularTotalDineroRecaudado() {
        double totalDinero = 0;
        for (Prestamo prestamo : prestamos) {
            totalDinero = totalDinero + prestamo.calcularPrecioFinalPrestamo();
        }

        return totalDinero;

    }



    @Override
    public String toString() {
        return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", dineroRecaudado=" + dineroRecaudado
                + ", estudiantes=" + estudiantes + ", bibliotecarios=" + bibliotecarios + ", prestamos=" + prestamos
                + ", libros=" + libros + ", cantidadLibrosTotales=" + cantidadLibrosTotales + "]";
    }

}
