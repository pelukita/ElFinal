public class ejer24Elias {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arr = { 0, 0, 5, 3, 2, 0, 0, 70, 788, 9, 0, 4, 1, 0, 0, 0, 6, 6, 0, 0 };
    mostrar_arr(arr);
    recorrer_secuecia(arr);
  }

  public static void recorrer_secuecia(int[] arr) {
    int pos = 0, inicio = 0, fin = -1, suma = 0, suma_mayor = 0, inicio_mayor = 0, fin_mayor = 0;
    while (pos < MAX) {
      inicio = buscar_inicio(arr, fin+1);
      if (inicio < MAX) {
        fin = buscar_fin(arr, inicio);
        suma = sumar_secuencia(arr, inicio, fin);
        if (suma > suma_mayor) {
          suma_mayor = suma;
          inicio_mayor = inicio;
          fin_mayor = fin;
        }
      }
      pos++;
    }
    System.out.println("👉🏻La secuencias cuyo suma es la mayor(" + suma_mayor + ")inicia en:" + inicio_mayor
        + " y termina en la posicion: " + fin_mayor);
  }

  public static int sumar_secuencia(int[]arr,int inicio, int fin) {
    int sumar=0;
    while (inicio <= fin) {
      sumar += arr[inicio];
      inicio++;
    }
    return sumar;
  }

  public static int buscar_fin(int[] arr, int inicio) {
    while (inicio < MAX && arr[inicio] != 0) {
      inicio++;
    }
    return inicio - 1;
  }
  
  public static int buscar_inicio(int[] arr, int fin) {
    while (fin < MAX && arr[fin] == 0) {
      fin++;
    }
    return fin;
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }System.out.println();
  }
}
/* ️✅ 23.  Hacer  un  programa  que  devuelva  la  posición  de  inicio  y  fin  de  la 
primera secuencia de números distinta de ceros. */
/*Hacer  un  programa  que  devuelva  la  posición  de  inicio  y  fin  de  la 
secuencia  de  números  distintos  de  ceros  cuya  suma  del  contenido 
sea mayor 💻 */

/*

  BASE de tod
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arr = { 0, 0, 5, 3, 2, 0, 0, 7, 8, 9, 0, 4, 1, 0, 0, 0, 6, 6, 0, 0 };
    mostrar_arr(arr);

  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }System.out.println();
  }

*/