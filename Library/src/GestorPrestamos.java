// src/library/LibraryManager.java
package library.prestamos;

import java.util.ArrayList;
import java.util.List;

public class GestorPrestamos {
    private List<Prestamo> prestamos;

    // Constructor
    public GestorPrestamos() {
        this.prestamos = new ArrayList<Prestamo>();
    }

    // Método para realizar un préstamo
    public void realizarPrestamo(Libro libro, Usuario usuario) {
        Prestamo nuevoPrestamo = new Prestamo(libro, usuario, java.time.LocalDate.now(), java.time.LocalDate.now().plusWeeks(2));
        prestamos.add(nuevoPrestamo);
        System.out.println("Préstamo realizado con éxito.");
    }

    // Método para listar los préstamos
    public List<Prestamo> listarPrestamos() {
        return prestamos;
    }
}
