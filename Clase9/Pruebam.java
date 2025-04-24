package Clase9;
import java.util.Date;

public class Pruebam {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("987654", "María Gómez");

        
        Producto camara = new Camara(101, "Sony", "Alpha A7III");
        Producto impresion = new Impresion(202, "Color");

        ((Impresion)impresion).agregarFoto(new Foto("boda.jpg"));
        ((Impresion)impresion).agregarFoto(new Foto("fiesta.png"));

        
        Pedido pedido = new Pedido(cliente, new Date());
        pedido.agregarProducto(camara);
        pedido.agregarProducto(impresion);

        
        pedido.mostrarPedido();
    }
}