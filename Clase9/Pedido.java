package Clase9;
import java.util.*;

public class Pedido {
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;
}
//creacion de lconstructor
public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito) {
    this.cliente = cliente;
    this.producto = producto;
    this.fecha = fecha;
    this.numeroTarjetaCredito = numeroTarjetaCredito;
    
}
