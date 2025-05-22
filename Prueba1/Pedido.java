package Prueba1;



import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pedido {
    private Cliente cliente;        
    private List<Producto> productos; 
    private Date fechaPedido;         

    public Pedido(Cliente cliente, Date fechaPedido) {
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarPedido() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaConHora = formato.format(fechaPedido);

        System.out.println("=== Pedido de: " + cliente.getNombre() + " ===");
        System.out.println("Fecha del pedido: " + fechaConHora);
        System.out.println("------------------------------------------");

        
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            p.mostrarDetalles();
        }
    }
}
