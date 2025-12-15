public class Ejer2Elias {
  final static int MAXF = 5;
  final static int MAXC = 10;

  public static void main(String[] args) {
    int[][] mat = {
        { 12, 7, 5, 8, 10, 3, 6, 14, 9, 2 },
        { 1, 4, 11, 16, 18, 20, 15, 22, 24, 26 },
        { 30, 33, 35, 32, 28, 27, 29, 31, 34, 36 },
        { 40, 42, 44, 41, 39, 38, 37, 45, 47, 49 },
        { 50, 52, 54, 53, 51, 55, 57, 59, 58, 60 }
    };
    mostrar_matriz(mat);
    buscar_pares(mat);
  }

  public static void buscar_pares(int[][] mat) {
    int contador = 0;
    for (int i = 0; i < MAXF;i++){
      for(int j=0;j<MAXC;j++){
        if(mat[i][j]%2==0){
          contador++;
        }
      }
    }System.out.println("Cantidad de numeros pares: " + contador);
  }

  public static void mostrar_matriz(int[][] mat) {
    for (int i = 0; i < MAXF; i++) {
      for (int j = 0; j < MAXC; j++) {
        System.out.print(mat[i][j] + " | ");
      }
      System.out.println();
    }
    System.out.println();
  }
}
/*2.  Hacer  un  programa  que  dada  una  matriz  de  enteros  de  tamaño 
5*10  que  se  encuentra  precargada,  obtenga  la  cantidad  de 
números pares que tiene y la imprima. */