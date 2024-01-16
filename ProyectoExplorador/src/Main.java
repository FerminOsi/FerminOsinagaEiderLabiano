import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    static Scanner sc = new Scanner(System.in);
    private static Liga laLiga;
    public static void main(String[] args) {
        System.out.println("Empiece creando una liga:");
        System.out.println("Inserte el país de la liga:");
        String Pais = sc.next();
        laLiga = new Liga(Pais);
        int eleccion = 0;
        while (eleccion != 6){

            System.out.println("MENU DE LA LIGA");
            System.out.println("1- Insertar equipo");
            System.out.println("2- Insertar jugador");
            System.out.println("3- Ver equipos de la liga");
            System.out.println("4- Ver jugadores de un equipo");
            System.out.println("5- Vender jugador");
            System.out.println("6- Salir");
            eleccion = sc.nextInt();

            if (eleccion == 1){
                insertarEquipo();
            }Hola maricarmen
            else if(eleccion == 2){
                insertarJugador();
            }"Hola don jose"
            else if(eleccion == 3){

            }
        }

    }
    public static void insertarEquipo(){
        System.out.println("Inserte el nombre del equipo");
        String nombreEquipo = sc.next();
        System.out.println("Inserte la ciudad del equipo");
        String nombreCiudad = sc.next();
        System.out.println("Creando equipo...");
        Equipo miEquipo = new Equipo(nombreEquipo,nombreCiudad);
        System.out.println("Insertando equipo...");
        laLiga.anadirEquipo(miEquipo);
        System.out.println("Equipo " + miEquipo + " insertado");
    }
    public static void insertarJugador(){
        System.out.println("Indique el nombre del equipo donde quiere insertar el jugador:");
        String nombreEquipo = sc.next(); // tiene sentido repetir esto cuando ya esta en insertar equipo?
        System.out.println("Indique el nombre del jugador:");
        String nombreJugador = sc.next();
        System.out.println("Indique la nacionalidad del jugador:");
        String paisJugador = sc.next();
        System.out.println("Indique la edad del jugador:");
        int edadJugador = sc.nextInt();
        System.out.println("Indique la posición del jugador:");
        String posicionJugador = sc.next();
        System.out.println("Creando jugador…");
        Jugador jugadorNuevo = new Jugador (nombreJugador,paisJugador,edadJugador,posicionJugador);
        System.out.println("Insertando jugador…");
        miEquipo.adquirirJugador(nombreJugador);
        System.out.println("Jugador " + nombreJugador + "insertado en " + nombreJugador);
        // : Si el equipo está lleno se mostrará un mensaje como el siguiente: El equipo está lleno
        // volver al menu inicial
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public static void  venderJugador(){
        System.out.println("Inserte el nombre del equipo donde quiere vender el jugador:");
        String nombreEquipoV = sc.next();
        System.out.println("Inserte el nombre del jugador:");
        String nombreJugadorV = sc.next();
        System.out.println("Vendiendo jugador…");
        if (n.getNombre() == nombreJugadorV){
            System.out.println("El jugador no existe.");
            Jugador jugadorAborrar = Jugador(nombreJugadorV);
        }
        else if{nombreJugadorV

        }
        Equipo miEquipo = laLiga.getEquipo(nombreEquipoV);
        miEquipo.venderJugador(nombreJugadorV);
        System.out.println("");
        System.out.println("");

        Inserte el nombre del jugador:

        Jugador vendido.
        Nota: Si el equipo no existe se procederá exactamente igual que en el procedimiento
        de InsertarJugador.
        Nota: Si el jugador no existe se indicará con el siguiente mensaje:

        Y se volverá al menú inicial.
        Nota: Al vender el jugador, evidentemente se deberá borrar del equipo

    }
}
