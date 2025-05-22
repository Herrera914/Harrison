import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el nombre del jugador 1: ");
            String nombre1 = scanner.nextLine();
            System.out.print("Introduce el nombre del jugador 2: ");
            String nombre2 = scanner.nextLine();

            System.out.println("Elige un personaje para " + nombre1 + ":");
            System.out.println("1. Scorpion");
            System.out.println("2. Sub-Zero");
            System.out.println("3. Raiden");
            System.out.println("4. Liu Kang");
            System.out.println("5. Kitana");
            int eleccion1 = scanner.nextInt();
            Personaje jugador1 = crearPersonaje(eleccion1, nombre1);

            System.out.println("Elige un personaje para " + nombre2 + ":");
            int eleccion2 = scanner.nextInt();
            Personaje jugador2 = crearPersonaje(eleccion2, nombre2);

            JuegoLucha juego = new JuegoLucha(jugador1, jugador2);
            juego.iniciarPelea();
        } finally {
            scanner.close(); // Cerrar el Scanner para evitar fugas de recursos
        }
    }

    private static Personaje crearPersonaje(int eleccion, String nombre) {
        switch (eleccion) {
            case 1:
                return new Scorpion(nombre);
            case 2:
                return new SubZero(nombre);
            case 3:
                return new Raiden(nombre);
            case 4:
                return new LiuKang(nombre);
            case 5:
                return new Kitana(nombre);
            default:
                System.out.println("Elección no válida, se asignará a Scorpion por defecto.");
                return new Scorpion(nombre);
        }
    }
}