import java.util.Random;
public class Mapa {
    private final int[][] tablero = new int[10][10];
    private Posicion posTesoro;
    Random r = new Random();

    public Mapa() {

        for (int x = 0; x < tablero.length; x++) {
            for (int y = 0; y < tablero[x].length; y++) {
                if (y != 0 && y != 9){
                    tablero[x][y] = 0;
                }
                else if (y == 9) {
                    y = tablero[x].length;
                    int r = (int) (Math.random() * 11 + 1);
                    tablero[y][r] = 2;
                } else if (x !=1 && x != 9 ){
                    int r = (int) (Math.random() * 101 + 1);
                    tablero[x][r] = 2;
                }
            }
        }
        }
    public int[][] getTablero () {
        return tablero;
    }

    public Posicion getPosTesoro () {
        return posTesoro;
    }

}
