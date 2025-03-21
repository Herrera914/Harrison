package clase7;

public class Trabajador {

    //Atributos
    private int idTrabajador;
    private String nombre;
    private String apellido;

    //Constructor, tiene el mismo nombre de la clase
    public Trabajador(int idTrabajador, String nombre, String apellido) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


    public int gedIdTrabajador() {
        return idTrabajador;
    }

    //Metodo pagar

    public double pagar() {
        return 0.0;
    }

    public String toString() {
        return "Trabajador { idTrabajador: " + idTrabajador + ", nombre: " + nombre + ", apellido: " + apellido + " }";
    }
    
}
