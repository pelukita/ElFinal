public class ejer37Elias {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 11, 12, 13, 5, 15, 16, 17, 18, 19 };
    mostra_arr(arr);
    int numero = pedir_numero();

    }

  public static int pedir_numero() {
    System.out.println("Señor morfeo ingrese un numero entero, para eliminarlo.");
    return Utils.leerInt();
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
37.  Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño 
10  que  se  encuentra  precargado,  solicite  al  usuario  el  ingreso  de 
dos  números  enteros  (posiciones  del  arreglo)  y  ordene  de  forma 
creciente  el  arreglo  entre  dos  posiciones  correspondientes  a  los 
números ingresados.  
*/
