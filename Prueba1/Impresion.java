package Prueba1;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Impresion extends Producto {
    private String color;
    private List<Foto> fotos;      
    private Date fechaImpresion;  

    public Impresion(int numero, String color, Date fechaImpresion) {
        super(numero);
        this.color = color;
        this.fotos = new ArrayList<Foto>();
        this.fechaImpresion = fechaImpresion;
    }

    public void agregarFoto(Foto foto) {
        fotos.add(foto);
    }

    
    public void mostrarDetalles() {
       
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = formato.format(fechaImpresion);

        System.out.println("Impresión - Color: " + color
            + ", Número: " + getNumero()
            + ", Fecha: " + fechaFormateada);

       
        for (int i = 0; i < fotos.size(); i++) {
            Foto f = fotos.get(i);
            f.print();
        }
    }
}
