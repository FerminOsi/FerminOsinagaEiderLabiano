import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Explorador explorador;
    private static Mapa tablero;
    private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Menu");
        System.out.println("*******************************************************");
        System.out.println("Bienvenido al juego del explorador");
        System.out.println("*******************************************************");
        System.out.println("Cual es tu apodo, jugador?");

        String nombre = sc.next();

        System.out.println("""
                1. Ver posición actual del explorador\s
                2. Mover explorador\s
                3. Explorar\s
                4. Salir""");

        explorador = new Explorador(nombre);
        tablero = new Mapa();




        }
    }
