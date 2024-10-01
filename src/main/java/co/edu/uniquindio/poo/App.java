package co.edu.uniquindio.poo;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
    

        Bibliotecario bibliotecario5 = new Bibliotecario("sofi", "93003033", "2222", "sofia",0,0,1);
        Bibliotecario bibliotecario1 = new Bibliotecario("Sofia", "11912", "1718181", "sofi1@gmail.com",0,0 ,2);
        Bibliotecario bibliotecario2 = new Bibliotecario("Luz", "119122", "17181281", "lui1@gmail.com", 0,0,3);
        Bibliotecario bibliotecario3 = new Bibliotecario("Nicolas", "109122", "17181281", "nicolas1@gmail.com", 0,0,2);
        Bibliotecario bibliotecario4 = new Bibliotecario("Maria", "1194", "393993", "mari3@gmail.com",0,0, 1);

        
        Estudiante estudiante1 = new Estudiante("Sol", "1127575678", "3112910", "sol12@gmail.com", "artes", 0);
        Estudiante estudiante2 = new Estudiante("Sara", "11275", "3112910", "sarita2@gmail.com", "artes", 0);
        Estudiante estudiante3 = new Estudiante("santiago", "1919191", "9292929", "santi12@gmail.com", "ingenieria", 0);
        Estudiante estudiante4 = new Estudiante("Pedro", "87392926", "19181", "pedri1@gmail.com", "ciencia", 0);

        Libro libro1 = new Libro("12", "1", "Miguel de Cervantes", "Don Quijote", "Liber Factory", LocalDate.of(1980, 12, 19), 9, EstadoLibro.DISPONIBLE);
        Libro nuevoLibro = new Libro("11", "2", "Jane Austen", "Orgullo y prejuicio", "Liber Factory", LocalDate.of(2000, 10, 20), 5, EstadoLibro.DISPONIBLE);
        Libro libro3 = new Libro("10", "3", "Gabriel García", "Cien años de soledad", "Liber factory", LocalDate.of(1967, 05, 11), 10, EstadoLibro.DISPONIBLE);
        Libro libro4 = new Libro("09", "4", "Antoine de Saint", "El principito", "Liber factory", LocalDate.of(2001, 1, 24), 3, EstadoLibro.DISPONIBLE);

        Prestamo prestamo1 = new Prestamo(bibliotecario4, estudiante4, LocalDate.of(2024, 9, 10), LocalDate.of(2024, 9, 1), "1");
        Prestamo prestamo2 = new Prestamo(bibliotecario4, estudiante2, LocalDate.of(2024, 9, 6), LocalDate.of(2024, 9, 3), "2");
        Prestamo prestamo3 = new Prestamo(bibliotecario3, estudiante2, LocalDate.of(2024, 9, 29), LocalDate.of(2024, 9, 22), "3");
        Prestamo prestamo4 = new Prestamo(bibliotecario1, estudiante3, LocalDate.of(2024, 9, 24), LocalDate.of(2024,9, 20), "4");


        Biblioteca biblioteca = new Biblioteca("UQuindio", "Norte", 10000, 19);

        biblioteca.agregarBibliotecario(bibliotecario1);
        biblioteca.agregarBibliotecario(bibliotecario2);
        biblioteca.agregarBibliotecario(bibliotecario3);
        biblioteca.agregarBibliotecario(bibliotecario4);

        biblioteca.agregarEstudiante(estudiante1);
        biblioteca.agregarEstudiante(estudiante2);
        biblioteca.agregarEstudiante(estudiante3);
        //System.out.println(biblioteca.getEstudiantes());

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(nuevoLibro);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);

        biblioteca.agregarPrestamo(prestamo3);
        biblioteca.agregarPrestamo(prestamo2);
        biblioteca.agregarPrestamo(prestamo1);

        biblioteca.consultarLibro("11");
        biblioteca.consultarLibro("10");
        biblioteca.consultarLibro("09");
       

        prestamo1.agregarLibroPrestamoo(libro4, 1);
        prestamo2.agregarLibroPrestamoo(libro4, 1);
       prestamo3.agregarLibroPrestamoo(libro3, 3);

       biblioteca.consultarPrestamo("1");


      

        //biblioteca.prestamosPorLibro("El principito");
        
        
        for (Prestamo prestamo : biblioteca.getPrestamos()) {
        long dias = prestamo.calcularDiasDePrestamo();
        double costo = prestamo.calcularCostoPrestamo(15000); // Costo por día
        System.out.println("Días de préstamo: " + dias + ", Costo total: " + costo);
    }

    for (Prestamo prestamo : biblioteca.getPrestamos()) {
    double total = prestamo.calcularPrecioFinalPrestamo();
    System.out.println("El costo total del préstamo es: " + total);



    //biblioteca.calcularSalarioEmpleados(bibliotecario4);
    //bibliotecario4.getPrestamosRealizados();
    //biblioteca.calcularTotalDineroRecaudado();
    //biblioteca.calcularTotalDineroRecaudado();
    

     biblioteca.reemplazarLibro("1", nuevoLibro);

        
       
         

    }

    }

}
