import java.util.Random;
public class Mapa {
    private final int[][] tablero;
    private Posicion posTesoro;
    Random r = new Random();
    public Mapa() {
        this.tablero = new int[10][10];
        int r = -1;
        for (int x = 0; x < this.tablero.length; x++) {

            for (int y = 0; y < this.tablero[x].length; y++) {

                if (x == 0) {
                    this.tablero[x][y] = 0;

                } else if (x == 9 && r < 0) {
                    y = this.tablero[x].length;  // ?
                    r = (int) (Math.random() * 9 + 0);
                    this.tablero[r][y] = 2;
                    this.posTesoro = new Posicion(r,y);

                } else if (x != 0 && x != 9) {
                    int rult = (int) (Math.random() * 9 + 0);
                    if (rult <= 1) {
                        this.tablero[x][y] = 1;
                    } else if (rult >= 2) {
                        this.tablero[x][y] = 0;
                    }
                }
            }
        }
    }
    public int[][] getTablero () {
        return this.tablero;
    }

    public Posicion getPosTesoro () {
        return this.posTesoro;
    }
}
