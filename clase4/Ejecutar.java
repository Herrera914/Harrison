package clase4;

public class Ejecutar {
    public static void main(String[] args) {
        //String va en comillas
        //Forma1
        Vehiculo objVehiculo1 = new Vehiculo("Toyota", "Blanco", 4500.0, "TSKFld", 2.3, "150HP");
        
        //Forma2
        Vehiculo objVehiculo2;
        objVehiculo2= new Vehiculo("Ferrari", "Rojo", 5000.0,"iudfhoisu", 1.8, "1300hp");

     //MOstrar la marca  del objeto vehiculo 1
        System.out.println(objVehiculo1.getMarca());

        //Se va a modificar la marca del vehiculo del objeto objVehiculo1
        objVehiculo1.setMarca("Chevrolet");

        //Mostrar todo objeto
        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo2);

        System.out.println(objVehiculo1.getMarca());
        objVehiculo1.acelerar();
        System.out.println(objVehiculo2.getMarca());
        objVehiculo2.frenar();
    }
}