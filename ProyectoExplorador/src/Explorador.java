import java.util.Random;

public class Explorador {
    String nombre;
    Posicion posicionActual;
    Random r = new Random();

    public Explorador(String nombre){
        this.nombre = nombre;
        posicionActual.setCoordenadaCol(0);
        posicionActual.setCoordenadaFila(r.nextInt(10)+1);
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
    public void explorar(Mapa mapa){

    }
    public int  checkPosicionMapa(Mapa mapa){
        return 3;
    }
    public void moverse(int direccion){

    }

}
