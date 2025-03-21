package clase7;

import clase.Trabajador;

public class operario extends Trabajador {

    private double horas;
    public final double SALARIO_BASE = 1000.0; //Constante
     
    //CXonstructor hereda de la superclase idtranajador, nombre y apellido
    public operario(int idTrabajador, String nombre, String apellido, double horas) {

        super(idTrabajador, nombre, apellido);
        this.horas = horas;
    }

    public double pagar() {
        return SALARIO_BASE + (horas * 10);
    }

    public String toString() {
        return "Operario { idTrabajador: " super.getIdTrabajador()
         + ", nombre: " + super.getNombre() + ", apellido: " + super.getApellido() + ", horas trabajadas: " + horas + " }";
    }
}
