public class ejer6Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    mostrar_arr(arr);
    buscar_pares(arr);
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }

  public static void buscar_pares(int[] arr) {
    int contador = 0;
    for (int pos = 0; pos < MAX; pos++) {
      if (arr[pos] % 2 == 0) {
        contador++;
      }
    }
    System.out.println("Cuchame morfi, la cantidad de numero pares es de: " + contador);
  }
}
/*Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño  10 
que  se  encuentra  cargado,  obtenga  la  cantidad  de  números  pares 
que tiene y la imprima.  */