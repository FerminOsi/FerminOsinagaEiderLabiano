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
                if (mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol()+1] == 1)
                {
                    trampas++;
                }else if (mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol()-1] == 1)
                {
                    trampas++;
                }else if (mapa.getTablero()[posicionActual.getCoordenadaFila()+1][posicionActual.getCoordenadaCol()] == 1)
                {
                    trampas++;
                }else if (mapa.getTablero()[posicionActual.getCoordenadaFila()-1][posicionActual.getCoordenadaCol()] == 1)
                {
                    trampas++;
        }
        return trampas;
        }

    public int  checkPosicion(Mapa mapa) {
        int estado;
        if (mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol()] == 1) {
            System.out.println("Has reventado");
            estado = 1;
        } else if (mapa.getTablero()[posicionActual.getCoordenadaFila()][posicionActual.getCoordenadaCol()] == 0) {
            System.out.println("Sigues vivo, por poco tiempo");
            estado = 0;
        }else {
            estado = 2;
            System.out.println("Has ganado!");
        }
        return estado;
    }
    public void moverse(int direccion){
        if (direccion == 1){
            posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol()-1);
        }else if (direccion == 2){
            posicionActual.setCoordenadaCol(posicionActual.getCoordenadaCol()+1);
        }else if (direccion == 3){
            posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila()-1);
        }else if (direccion == 4){
            posicionActual.setCoordenadaFila(posicionActual.getCoordenadaFila()+1);
        }else{
            System.out.println("Se te ha caido la ficha del tablero");
    }
    }
}
