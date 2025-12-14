public class ejer8Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

    mostrar_arr(arr);
    mostrar_arr(arr2);

    boolean orden = orden_arr(arr);
    System.out.println("el arreglo es: " + orden);
    boolean orden2 = orden_arr(arr2);
    System.out.println("el arreglo esaa: " + orden2);
  }

  public static boolean orden_arr(int[] arr) {
    boolean valor = true;
    for (int pos = 0; pos < MAX - 1; pos++) {
      if (arr[pos] < arr[pos + 1]) {
        valor = true;
      } else {
        return valor = false;
      }
    }
    System.out.println("__________________________________________________________");
    return true;
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }
}

/*Hacer  un  programa  que  determine  si  los  valores  almacenados  en 
un arreglo de enteros se encuentran en orden ascendente.  */