package Clase9;

import java.util.ArrayList;
import java.util.List; 

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos; 

    public Impresion(int numero, String color) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<>(); 
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto); 
    }

    
    public void mostrarDetalles() {
        System.out.println("Impresión - Color: " + color + 
                          ", Número: " + getNumero());
        for (Foto f : fotos) { 
            f.print();
        }
    }
}