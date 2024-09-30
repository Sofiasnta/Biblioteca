package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;
import java.time.temporal.ChronoUnit;
import java.util.Collection;

public class Prestamo {

    private Bibliotecario bibliotecario;
    private Estudiante estudiante;
    private LocalDate fechaDevolucion;
    private LocalDate fechaInicialPrestamo;
    private static double COSTODIA = 15000;
    private Collection<DetallePrestamo> detallePrestamos;
    private String codigo;

    public Prestamo(Bibliotecario bibliotecario, Estudiante estudiante, LocalDate fechaDevolucion,
            LocalDate fechaInicialPrestamo, String codigo) {
        this.bibliotecario = bibliotecario;
        this.estudiante = estudiante;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaInicialPrestamo = fechaInicialPrestamo;
        this.detallePrestamos = new LinkedList<>();
        this.codigo = codigo;
    }

    /**
     * Metodo que permite agregar un libro a un prestamo verificando su disponibilidad y modificando la disminución del mismo
     * @param libro
     * @param cantidad
     * @return true si hay disponibilidad del libro; False no se puede adicionar por que no hay suficientes unidades 
     */

    public boolean agregarLibroPrestamoo(Libro libro, int cantidad) {
        if (libro.libroDisponible(cantidad)) {
            libro.disminuirCantidad(cantidad);// Disminuye la cantidad en el libro
            DetallePrestamo detalle = new DetallePrestamo(cantidad, libro); // Crea un nuevo detalle de préstamo
            detallePrestamos.add(detalle); // Agrega el detalle al préstamo
            bibliotecario.incrementarPrestamos();
            return true; // si hay unidades se agrega 
        }
        System.out.println("No se pudo agrgar el libro al prestamo, no quedan unidades disponibles");
        return false; // si no hay unidades suficientes no se agrega el libro 
    }

    /**
     * Metodo que permite calcular los dias de diferencia entre dos fechas de días
     * 
     * @return diasDePrestamo
     */

    public long calcularDiasDePrestamo() {
        long diasDePrestamo = ChronoUnit.DAYS.between(fechaInicialPrestamo, fechaDevolucion);
        return diasDePrestamo;
    }

    /**
     * Metodo que permite calcular el costo de los dias del prestamo
     * 
     * @param COSTODIA
     * @return dias
     */

    public double calcularCostoPrestamo(double COSTODIA) {
        long dias = calcularDiasDePrestamo();
        return dias * COSTODIA;

    }

    /**
     * Metodo que permite calcular el precio final de un prestamo

     * @return total
     */
    
    public double calcularPrecioFinalPrestamo (){
        double total=0;
        for (DetallePrestamo detalle : detallePrestamos){
            total = total + detalle.getSubTotal();
        } 
        
        return total;

    }


    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaInicialPrestamo() {
        return fechaInicialPrestamo;
    }

    public void setFechaInicialPrestamo(LocalDate fechaInicialPrestamo) {
        this.fechaInicialPrestamo = fechaInicialPrestamo;
    }

    public static double getCOSTODIA() {
        return COSTODIA;
    }

    public static void setCOSTODIA(double cOSTODIA) {
        COSTODIA = cOSTODIA;
    }

    public Collection<DetallePrestamo> getDetallePrestamos() {
        return detallePrestamos;
    }

    public void setDetallePrestamos(Collection<DetallePrestamo> detallePrestamos) {
        this.detallePrestamos = detallePrestamos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Prestamo [bibliotecario=" + bibliotecario + ", estudiante=" + estudiante + ", fechaDevolucion="
                + fechaDevolucion + ", fechaInicialPrestamo=" + fechaInicialPrestamo + ", detallePrestamos="
                + detallePrestamos + ", codigo=" + codigo + "]";
    }

    
}
