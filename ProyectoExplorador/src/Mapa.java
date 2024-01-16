import java.util.Random;
public class Mapa {
    private final int[][] tablero = new int[10][10];
   private Posicion posTesoro;
    Random r = new Random();
   public Mapa(){

        for (int x = 0;x< tablero.length-1;x++){
            for (int y =0; y<tablero[x].length;y++){
                tablero[x][y] = 0;
                if (x == 9)
                {
                    int r = (int)(Math.random()* 101 + 0);
                    tablero[x][r] = 2;
                }
                else if (x > 1 &&  x <= tablero.length-1){
// Crear randint entre 1 y 10
                }
                       x = v = r;
        }
   }

    public int[][] getTablero() {
        return tablero;
    }

    public Posicion getPosTesoro() {
        return posTesoro;
    }
}
