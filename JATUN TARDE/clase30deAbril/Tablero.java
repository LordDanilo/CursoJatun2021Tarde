public class Tablero{
    private int[][] mat;
    public Tablero(int n, int m){
        mat = new int[n][m];
    }
    public String recorrido(){
        int marca = 1;
        for(int fila = 0; fila<mat.length; ++fila){
            for(int col = 0; col<mat[fila].length; col++){
                mat[fila][col] = marca++;
            }
        }
        return "Matriz completada";
    }
}
