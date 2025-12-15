public class Ejer3Elias {
  final static int MAX_F = 5;
  final static int MAX_C = 10;

  public static void main(String[] args) {
    int[][] mat = {
        { 12, 7, 5, 8, 10, 3, 6, 14, 9, 2 },
        { 1, 4, 11, 16, 18, 20, 15, 22, 24, 26 },
        { 30, 33, 35, 32, 28, 27, 29, 31, 34, 36 },
        { 40, 42, 44, 41, 39, 38, 37, 45, 47, 49 },
        { 50, 52, 54, 53, 51, 55, 57, 59, 58, 60 }
    };
    mostrar_matriz(mat);
    System.out.println("Ingrese un numero de Fila y un numero de Columna, para que sea ELIMINADO");
    int pos_fila = Utils.leerInt();
    int pos_col = Utils.leerInt();
    corrimiento_izquierda(mat, pos_fila, pos_col);
    System.out.println("TARANNNNNNNN!!!"); 
    mostrar_matriz(mat);
  }
  
  public static void corrimiento_izquierda(int[][] mat, int fila, int col) {
    int pos = MAX_F - 1;
    int posicion = fila;
    while (posicion < pos) {
      mat[pos][col] = mat[pos][col-1];
      pos--;
    }
  }

  public static void mostrar_matriz(int[][] mat) {
    for (int i = 0; i < MAX_F; i++) {
      for (int j = 0; j < MAX_C; j++) {
        System.out.print(mat[i][j] + " | ");
      }
      System.out.println();
    }
    System.out.println();
  }

}
/* 3 Hacer  un  programa  que  dada  una  matriz  de  enteros  de  tamaño 5*10  que  se  encuentra  precargada,  solicite  al  usuario  una  posición 
fila, columna y realice un corrimiento a izquierda.  */