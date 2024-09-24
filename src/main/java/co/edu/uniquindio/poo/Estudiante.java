package co.edu.uniquindio.poo;

public class Estudiante extends Usuario {

    private String ProgramaAcademico;

    public Estudiante(String nombre, String cedula, String telefono, String correo, String programaAcademico) {
        super(nombre, cedula, telefono, correo);
        ProgramaAcademico = programaAcademico;
    }

    public String getProgramaAcademico() {
        return ProgramaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        ProgramaAcademico = programaAcademico;
    }

    @Override
    public String toString() {
        return "Estudiante [ProgramaAcademico=" + ProgramaAcademico + ", getProgramaAcademico()="
                + getProgramaAcademico() + ", getNombre()=" + getNombre() + ", getCedula()=" + getCedula()
                + ", getTelefono()=" + getTelefono() + ", getCorreo()=" + getCorreo() + ", toString()="
                + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }

}
