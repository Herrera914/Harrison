import java.util.Random;

public class LiuKang extends Personaje {
    private final int MIN_DANO = 20;
    private final int MAX_DANO = 40;

    public LiuKang(String nombre) {
        super(nombre, 90);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
    System.out.println(this.nombre + " (Liu Kang) ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
}
}