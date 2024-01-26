import java.util.Random;

public class Explorador {
    String nombre;
    Posicion posicionActual;
    Random r = new Random();
    public Explorador(String nombre){
        this.nombre = nombre;
        posicionActual = new Posicion(0, r.nextInt(9));

    }

    public String getNombre() {
        return nombre;
    }

    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Posicion posicionActual) {
        this.posicionActual = posicionActual;
    }
    public int explorar(Mapa mapa){
        int trampas = 0;
        if (posicionActual.getCoordenadaCol() + 1 <= 9 && mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol() + 1] == 1) {
            trampas++;
        } else if (posicionActual.getCoordenadaCol() - 1 >= 0 && mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol() - 1] == 1) {
            trampas++;
        } else if (posicionActual.getCoordenadaFila() + 1 <= 9 && mapa.getTablero()[posicionActual.getCoordenadaFila() + 1][posicionActual.getCoordenadaCol()] == 1) {
            trampas++;
        } else if (posicionActual.getCoordenadaFila() - 1 >= 0 && mapa.getTablero()[posicionActual.getCoordenadaFila() - 1][posicionActual.getCoordenadaCol()] == 1) {
            trampas++;
        }

        return trampas;
    }

    public int  checkPosicion(Mapa mapa) {
        int estado;
        if (mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol()] == 1 ) {
            estado = 1;
            System.out.println(getNombre() + "ha caído en una trampa.\nFin del juego.");
        } else if (mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol()] == 0) {
            System.out.println("No pasa nada. Sigue jugando...");
            estado = 0;
        }else {
            estado = 2;
            System.out.println(getNombre() + "ha encontrado el tesoro.\nENHORABUENA.\nFin del juego.");
        }
        return estado;
    }
    public void moverse(int direccion){
        if (direccion == 1 && posicionActual.getCoordenadaFila()-1 >= 0){
            posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila()-1);
        }else if (direccion == 2 && posicionActual.getCoordenadaFila()+1 <= 9){
            posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila()+1);
        }else if (direccion == 3 && posicionActual.getCoordenadaCol()-1 >= 0){
            posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol()-1);
        }else if (direccion == 4 && posicionActual.getCoordenadaCol()+1 <= 9){
            posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol()+1);
        }else{
            System.out.println("Se te ha caido la ficha del tablero, introduce otra posicion valida");
    }
    }
}
