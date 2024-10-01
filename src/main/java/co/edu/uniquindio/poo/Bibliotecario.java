package co.edu.uniquindio.poo;
import java.util.Collection;
import java.util.LinkedList;

public class Bibliotecario extends Usuario {

    private double salario;
    private int prestamosRealizados;
    private int añosTrabajando;
    private Collection<Prestamo> prestamos;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario, int prestamosRealizados, int añosTrabajando) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.prestamosRealizados = 0;
        this.añosTrabajando = añosTrabajando;
        prestamos = new LinkedList <>();
    }

    public void incrementarPrestamos() {
        this.prestamosRealizados = this.prestamosRealizados + 1;
    }

     

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void setPrestamosRealizados(int prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }

    public int getAñosTrabajando() {
        return añosTrabajando;
    }

    public void setAñosTrabajando(int añosTrabajando) {
        this.añosTrabajando = añosTrabajando;
    }

    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + ", prestamosRealizados=" + prestamosRealizados
                + ", añosTrabajando=" + añosTrabajando + ", prestamos=" + prestamos + "]";
    }

   
}
