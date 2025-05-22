package Prueba1;


import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("987654", "María Gómez");

        
        Camara camara = new Camara(101, "Sony", "Alpha A7III");

        
        Impresion impresion = new Impresion(202, "Color", new Date());
        impresion.agregarFoto(new Foto("boda.jpg"));
        impresion.agregarFoto(new Foto("fiesta.png"));

        
        Pedido pedido = new Pedido(cliente, new Date());
        pedido.agregarProducto(camara);
        pedido.agregarProducto(impresion);

        
        pedido.mostrarPedido();
    }
}
