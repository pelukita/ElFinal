public class ejer15Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("arreglo ORIGINAL");
    mostrar_arr(arr);
    corrimiento_derecha_while(arr);
    System.out.println("corrimiento DERECHA WHILE");
    mostrar_arr(arr);
    /*
    corrimiento_derecha_for(arr);
    System.out.println("corrimiento DERECHA FOR");
    mostrar_arr(arr);
    */
  }
  //con WHILE
  public static void corrimiento_derecha_while(int[] arr) {
    int posicion = 3;
    int pos = MAX - 1;
    while (posicion <= pos) {
      arr[pos] = arr[pos - 1];
      pos--;
    }
  }
  
  /*public static void corrimiento_derecha_for(int[] arr) {
    int posicion = 6;
    for (int pos = MAX - 1; pos >= posicion; pos--) {
      arr[pos]=arr[pos-1];
    }
  }
  */
  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }
}
/*15.  Implementar  un  método  que  realice  un  corrimiento  a  derecha 
en  un  arreglo  ordenado  de  tamaño  MAX=10  a  partir  de  una 
posición. 
*/