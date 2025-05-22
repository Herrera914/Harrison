import java.util.Random;

public class Kitana extends Personaje {
    private final int MIN_DANO = 10;
    private final int MAX_DANO = 20;

    public Kitana(String nombre) {
        super(nombre, 95);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Kitana) ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
        // 20% de probabilidad de ataque doble
        if (rand.nextInt(100) < 20) {
            int danoAdicional = rand.nextInt(6) + 5; // Daño adicional entre 5 y 10
            oponente.recibirDano(danoAdicional);
            System.out.println(this.nombre + " realiza un ataque doble causando " + danoAdicional + " puntos de daño adicional.");
        }
    }
}