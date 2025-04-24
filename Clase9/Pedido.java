package Clase9;
import java.util.*;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos; 

    
    // Constructor corregido
    public Pedido(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        System.out.println("Pedido de: " + cliente.getNombre());
        
        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }
}