package co.edu.uniquindio.poo;

public class Bibliotecario extends Estudiante {

    private double salario;
    private int prestamosRealizados;
    private int añosTrabajando;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario,
            int prestamosRealizados, int añosTrabajando) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.prestamosRealizados = prestamosRealizados;
        this.añosTrabajando = añosTrabajando;
    }

    public void sumarPrestamo(){
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

    

}


