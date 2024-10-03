// src/library/Member.java
package library.prestamos;

public class Usuario {
    private String nombre;
    private int idUsuario;
    private String email;

    // Constructor
    public Usuario(String nombre, int idUsuario, String email) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.email = email;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
