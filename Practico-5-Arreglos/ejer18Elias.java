public class ejer18Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int numero = pedir_numero();
    System.out.println(numero);
    mostrar_arr(arr);
    buscar_numero(arr, numero);
    System.out.println("El numero es: " +numero+ "asi queda el arreglo despues de eliminarlo: ");
    mostrar_arr(arr);
  }

  public static void buscar_numero(int[] arr, int numero) {
    int pos = 0;
    while (pos < MAX) {
      if (arr[pos] == numero) {
        corrimiento_izquierda(arr,pos);
      }
      pos++;
    }
  }
  
  public static void corrimiento_izquierda(int[] arr, int pos) {
    int posicion = arr[pos];
    while (posicion<MAX-1) {
      arr[posicion] = arr[posicion + 1];
      posicion++;
    }
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }System.out.println();
  }
  
  public static int pedir_numero() {
    System.out.println("Ingrese un numero para eliminarlo del arreglo");
    return Utils.leerInt();
  }
}
/*

18.  Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño 
10  que  se  encuentra  precargado,  solicite  al  usuario  un  número 
entero  y  elimine  la  primera  ocurrencia  del  número  (un  número 
igual)  en  el  arreglo  (si  existe).  Para  ello  tendrá  que  buscar  la 
posición  y  si  está,  realizar  un  corrimiento  a  izquierda  (queda  una 
copia de la última posición del arreglo en la anteúltima posición).

*/