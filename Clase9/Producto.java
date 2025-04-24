package Clase9;

public class Producto {
    private int numero;
     
     public Producto(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    
    
    public void mostrarDetalles() {
        System.out.println("Producto #" + numero);
    }

}