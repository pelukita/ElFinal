public class ejer23Elias {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arr = { 0, 0, 5, 3, 2, 0, 0, 7, 8, 9, 0, 4, 1, 0, 0, 0, 6, 6, 0, 0 };
    mostrar_arr(arr);
    primer_secuencia(arr);
  }

  public static void primer_secuencia(int[] arr) {
      int inicio = 0, fin = -1;
      inicio = buscar_inicio(arr, inicio);
      if (inicio < MAX) {
        fin = buscar_fin(arr, inicio);
        System.out.println("inicio: " + inicio+  "  fin: " + fin);
      }
  }

  public static int buscar_fin(int[] arr, int inicio) {
    int ini = inicio;
    while (ini < MAX && arr[ini] != 0) {
      ini++;
    }
    return ini - 1;
  }
  
  public static int buscar_inicio(int[] arr, int fin) {
    int ini = fin;
    while(ini<MAX && arr[ini] ==0){
      ini++;
    }
    return ini;
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }System.out.println();
  }
}
/*23.  Hacer  un  programa  que  devuelva  la  posición  de  inicio  y  fin  de  la 
primera secuencia de números distinta de ceros. */