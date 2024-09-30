package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Estudiante extends Usuario {

    private String programaAcademico;
    private int cantidadPrestamos;
    private Collection<Prestamo> prestamos;

    
    public Estudiante(String nombre, String cedula, String telefono, String correo, String programaAcademico, int cantidadPrestamos) {
        super(nombre, cedula, telefono, correo);
        this.programaAcademico = programaAcademico;
        this.cantidadPrestamos = 0;
        prestamos = new LinkedList<>();
    }


    public void sumarPrestamos(){
     this.cantidadPrestamos = this.cantidadPrestamos + 1;
    }


    public String getProgramaAcademico() {
        return programaAcademico;
    }


    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }


    public Collection<Prestamo> getPrestamos() {
        return prestamos;
    }


    public void setPrestamos(Collection<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }


    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }


    public void setCantidadPrestamos(int cantidadPrestamos) {
        this.cantidadPrestamos = cantidadPrestamos;
    }


    @Override
    public String toString() {
        return "Estudiante [programaAcademico=" + programaAcademico + ", cantidadPrestamos=" + cantidadPrestamos
                + ", prestamos=" + prestamos + "]";
    }

}
