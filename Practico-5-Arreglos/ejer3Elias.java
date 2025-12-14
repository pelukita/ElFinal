public class ejer3Elias {
  final static int MAX = 10;
  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    mostrar_arr(arr);
    double promedio = promedio_arr(arr);
    valores_mayores_promdeio(arr, promedio);
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
    double suma = 0;
    while (pos < MAX) {
      suma += arr[pos];
      pos++;
    }
    return (suma / MAX);
  }

  public static void valores_mayores_promdeio(int[] arr, double promedio) {
    System.out.println("Eu morfeo, cuchame los valores que estan por encima del promedio del arreglo son: ");
    for (int pos = 0; pos < MAX;pos++){
      if(arr[pos]>promedio){
        System.out.print(arr[pos] + " | ");
      }
    }
  }
}
/* Con  el  mismo  arreglo  del  ejercicio  anterior  informe  por  pantalla 
cuantos  elementos  del  mismo  están  por  encima  del  promedio 
calculado. */