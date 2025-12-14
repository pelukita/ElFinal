public class ejer25Elias {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arr = { 0, 0, 100, 2000, 300, 0, 0, 55, 66, 77, 88, 99, 0, 0, 1, 2, 3, 4, 5, 0 };
    mostrar_arr(arr);
    buscar_anteUltima_secuencia(arr);
  }
  // 🗿

  public static void buscar_anteUltima_secuencia(int[] arr) {
    int inicio = MAX - 1, fin = 0, contador = 0;
    while (inicio > 0) {
      fin = buscar_fin(arr, inicio);
      if (inicio > 0) {
        inicio = buscar_inicio(arr, fin);
        contador++;
        if (contador == 2) {
          System.out.println("SI?, digo Inicio es  gay  : " + inicio + " y fin creo que es: " + fin);
        }
      }
      inicio--;
    }
  }
  
  public static int buscar_inicio(int[] arr, int fin) {
    while (0<=fin && arr[fin] != 0) {
      fin--;
    }
    return fin+1;
  }

  public static int buscar_fin(int[] arr, int inicio) {
    while (0<inicio && arr[inicio] == 0) {
      inicio--;
    }
    return inicio;
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }System.out.println();
  }
}
/*  Hacer  un  programa  que  devuelva  la  posición  de  inicio  y  fin  de  la 
anteúltima secuencia de números distintos de ceros. */

