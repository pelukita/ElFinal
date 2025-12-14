public class ejer2Elias {
  final static int MAX = 10;
  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    mostrar_arr(arr);
    double paso_de_mas = promedio_arr(arr);
    System.out.println("Señor morfeo el valor del promdeio del arreglo es: " + paso_de_mas);
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }

  public static double promedio_arr(int[] arr) {
    int pos = 0;
    double suma=0;
    while (pos < MAX) {
      suma += arr[pos];
      pos++;
    }
    return (suma/MAX);
  }
}
/*2. Hacer  un  programa  que  dado  un  arreglo  ya  cargado  con  10 
enteros, calcule el promedio y lo muestre por la consola.  */