/* Hacer  un  programa  que  devuelva  la  posición  de  inicio  y  fin  de  la 
anteúltima secuencia de números distintos de ceros.  */

public class ejercicio25 {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arreglo = { 0, 1, 2, 3, 0, 4, 5, 6, 0, 0, 7, 0, 8, 0, 9, 10, 11, 0, 12, 0 };
    mostrarArreglo(arreglo);
    encontrar_Anteultima_Secuencia(arreglo);

  }

  public static void encontrar_Anteultima_Secuencia(int[] arr) {
    int inicio = 0, fin = -1,
        pre_inicio = -1,
        pre_final = -1,
        inicio_antiUltima = -1,
        fin_antiUltima = -1,
        contador_Secuencias = 0;
    while (inicio < MAX) {
      inicio = encontrarInicio(arr, fin + 1);
      if (inicio < MAX) {
        fin = encontrarFin(arr, inicio);
        contador_Secuencias += +1;
        System.out.println("contador de sec: " + contador_Secuencias);
        if (contador_Secuencias >= 2) {
          inicio_antiUltima = pre_inicio;
          fin_antiUltima = pre_final;
        }
        pre_final = fin;
        pre_inicio = inicio;
      }
    }
    System.out.println(inicio_antiUltima + "anteultima?" + fin_antiUltima);
  }

  public static int encontrarFin(int[] arr, int fin) {
    while (fin < MAX && arr[fin] != 0) {
      fin++;
    }
    return fin - 1;
  }

  public static int encontrarInicio(int[] arr, int ini) {
    while (ini < MAX && arr[ini] == 0) {
      ini++;
    }
    return ini;
  }

  public static void mostrarArreglo(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }
}
