public class ejer7Elias {
  final static int MAX = 10;
  final static int N = 4;
  final static int M = 2;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 4, 8, 9 };
    mostrar_arr(arr);
    newArr(arr);
    mostrar_arr(arr);
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }

  public static void newArr(int[] arr) {
    int contador = 0;
    for (int pos = 0; pos < MAX; pos++) {
      if (arr[pos] == N) {
        arr[pos] = arr[pos] * M;
      }
    }
  }

}
/* Hacer  un  programa  que  dado  un  arreglo  de  enteros  y  un  número 
N, genere  un  arreglo  con  las  posiciones  donde  se  encuentra  dicho 
número.
A  continuación,  multiplicar  por  un  número  M  todas  las 
ocurrencias del número N en el arreglo original.  */