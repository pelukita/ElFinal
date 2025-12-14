public class ejer36Elias {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 11, 12, 13, 5, 15, 16, 17, 18, 19 };
    mostra_arr(arr);
    int numero = pedir_numero();
    int posicion = buscar_posicion(arr, numero);
    if(posicion>=0){
      System.out.println("el numero: " + numero + "esta en la posicion: " + posicion);
      eliminar_numero(arr, posicion);
      mostra_arr(arr);
    } else {
      System.out.println("morfeo el numero no esta en el arreglo.");
    }
  }

  public static void eliminar_numero(int []arr, int posicion) {
    int pos = MAX-1;
    while (posicion<pos) {
      arr[posicion] = arr[posicion + 1];
      posicion++;
    }
  }
  
  public static int buscar_posicion(int[] arr, int numero) {
    int pos = 0;
    while (pos<MAX) {
      if (arr[pos] == numero) {
        return pos;
      }
      pos++;
    }
    return -1;
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
36.  Hacer  un  programa  que  dado  un  arreglo  ordenado  creciente  de 
enteros  de  tamaño  10  que  se  encuentra  precargado,  solicite  al 
usuario  un  número  entero  y  elimine  la  primera  ocurrencia  de 
número  (un  número  igual)  en  el  arreglo  (si  existe).  Informar  si  no 
existe en el arreglo. 
*/