package Clase8;

public class EjecutarComposicionAgregacion {
    public static void main(String[] args) {
        //creacion de los objetos para validar el modelo
        Cuenta objCuenta1 = new Cuenta(123456, "Ahorros", 2000.0);
        Cuenta objCuenta2 = new Cuenta(654321, "Corriente", 5000.0);

        Cliente objCliente1 = new Cliente(123456789, "Juan Perez");
        Cliente objCliente2 = new Cliente(987654321, "Maria Lopez");

        Banco objBanco1 = new Banco("Bancarota ", "Calle 5ta ", objCuenta1);
        System.out.println(objBanco1);
        objBanco1.consultarCliente(objCliente2);
        


    }
}
