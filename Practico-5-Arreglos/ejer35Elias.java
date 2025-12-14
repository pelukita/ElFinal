public class ejer35Elias {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
    mostra_arr(arr);
    int numero = pedir_numero();
    int posicion = buscar_posicion_numero(arr, numero);
    insertar_numero(arr, posicion, numero);
    mostra_arr(arr);
  }
  
  public static void insertar_numero(int[] arr, int posicion, int numero) {
    int pos = MAX - 1;
    while (posicion < pos) {
      arr[pos] = arr[pos - 1];
      pos--;
    }
    arr[posicion] = numero;
  }

  public static int buscar_posicion_numero(int[] arr, int numero) {
    int pos = 0;
    while (pos < MAX && arr[pos] < numero) {
      pos++;
    }
    if (pos < MAX && arr[pos] == numero) {
      return pos;
    } else {
      return -1;
    }
  }

  public static int pedir_numero() {
    System.out.println("Señor morfeo ingrese un numero entero, para meter en el arreglo.");
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
private static int buscar_pos_ordenado(int[] arr,int valor){
int pos = 0;
while ((pos<MAX)&&(arr[pos]>valor)) {
pos++;
}
if ((pos<MAX)&&(arr[pos]==valor)) 
return pos;
else 
return -1


35.  Hacer  un  programa  que  dado  un  arreglo  ordenado  creciente  de 
enteros  de  tamaño  10  que  se  encuentra  precargado,  solicite  al 
usuario  un  número  entero  y  lo  inserte  en  el  arreglo  manteniendo 
su  orden.  Para  ello  tendrá  que  realizar  un  corrimiento  a  derecha 
(se  pierde  el  último  valor  del  arreglo)  y  colocar  el  número  en  el 
arreglo en la posición indicada.
*/