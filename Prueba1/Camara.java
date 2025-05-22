package Prueba1;


public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    
    
    public void mostrarDetalles() {
        System.out.println("Cámara - Marca: " + marca
            + ", Modelo: " + modelo
            + ", Número: " + getNumero());
    }
}
