public class ejer37Elias {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arr = { 0, 3, 1, 12, 8, 780, 0, 2, 8, 9, 5, 11, 12, 13, 5, 15, 16, 17, 18, 19 };
    mostra_arr(arr);
    
    System.out.println("Señor morfeo ingrese dos numero, para ordenar la secuencia.");
    int pos_inicio = Utils.leerInt();
    int pos_fin = Utils.leerInt();
    
    ordenar_secuencia(arr, pos_inicio, pos_fin);
    mostra_arr(arr);
  }

  public static void ordenar_secuencia(int[] arr, int ini, int fin) {
    for (int j = ini; j < fin; j++) {
      for (int i = ini; i < fin; i++) {
      if (arr[i] > arr[i + 1]) {
        int valor = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = valor;
      }
    }
  }
  }
  

  public static void mostra_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }

}
/*
 ✅ 37.  Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño 
10  que  se  encuentra  precargado,  solicite  al  usuario  el  ingreso  de 
dos  números  enteros  (posiciones  del  arreglo)  y  ordene  de  forma 
creciente  el  arreglo  entre  dos  posiciones  correspondientes  a  los 
números ingresados. 🎒  
*/
