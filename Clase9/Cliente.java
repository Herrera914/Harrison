package Clase9;

public class Cliente {
    public String cedula;
    public String nombre;
    
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Getters
    public String getCedula() { return cedula; } 
    public String getNombre() { return nombre; }
}

