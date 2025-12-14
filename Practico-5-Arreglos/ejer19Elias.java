public class ejer19Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 4, 2, 3, 4, 5, 6, 4, 8, 9 };
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
        corrimiento_izquierda(arr, pos);
      }
      pos++;
    }
  }

  public static void corrimiento_izquierda(int[] arr, int pos) {
    int posición = MAX - 1;

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

/*19.  Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño 
10  que  se  encuentra  precargado,  solicite  al  usuario  un  número 
entero  y  elimine  todas  las  ocurrencia  de  número  en  el  arreglo. 
Mientras  exista  (en  cada  iteración  tiene  que  buscar  la  posición 
dentro  del  arreglo)  tendrá  que  usar  la  posición  para  realizar  un 
corrimiento  a  izquierda  (quedarán  tantas  copias  de  la  última 
posición del arreglo como cantidad de ocurrencias del número).

20.  Suponer  a  partir  de  lo  resuelto  en  el  ejercicio  anterior  (11)  que 
el  elemento  a  eliminar  coincide  con  el  último  que  hay  en  el  arreglo. 
¿Qué pasa en este caso? ¿Cómo daría una solución al problema? 
21.  Hacer  un  programa  que  inserte  un  elemento  en  un  arreglo 
(ordenado decrecientemente) de tamaño MAX=10. 
22.  Hacer  un  programa  que  elimine  los  valores  pares  en  un  arreglo 
de tamaño MAX=10.     */