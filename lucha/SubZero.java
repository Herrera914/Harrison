import java.util.Random;

public class SubZero extends Personaje {
    private final int MIN_DANO = 15;
    private final int MAX_DANO = 25;

    public SubZero(String nombre) {
        super(nombre, 130);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " (Sub-Zero) ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
        // 25% de probabilidad de congelar al oponente
        if (rand.nextInt(100) < 25) {
            System.out.println(oponente.getNombre() + " ha sido congelado y pierde su próximo turno.");
            oponente.recibirDano(0); // No puede atacar en su próximo turno
        }
    }
}