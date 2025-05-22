import java.util.Random;

public class Raiden extends Personaje {
    private final int MIN_DANO = 15;
    private final int MAX_DANO = 30;

    public Raiden(String nombre) {
        super(nombre, 110);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Raiden) ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }
}