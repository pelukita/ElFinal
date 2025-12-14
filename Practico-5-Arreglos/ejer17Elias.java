public class ejer17Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int numero = pedir_numero();
    System.out.println(numero);
    mostrar_arr(arr);
    insertar_numero(arr, numero);
    System.out.println("el numero es: "+numero+", y asi queda el arreglo");
    mostrar_arr(arr);
  }

  public static void insertar_numero(int[] arr, int numero) {
    int pos = MAX - 1;
    int posicion = 9;
    while (posicion < pos) {
      arr[pos] = arr[pos - 1];
      pos--;
    }
    arr[posicion]= numero;
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }System.out.println();
  }
  
  public static int pedir_numero() {
    System.out.println("Ingrese un numero para insertar en el arreglo, en la posicion 0");
    return Utils.leerInt();
  }
}
/*
17.  Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño 
10  que  se  encuentra  cargado,  solicite  al  usuario  un  número  entero 
y  lo  agregue  al  principio  del  arreglo  (posición  0).  Para  ello  tendrá 
que  realizar  un  corrimiento  a  derecha  (se  pierde  el  último  valor  del 
arreglo) y colocar el número en el arreglo en la posición indicada.
*/