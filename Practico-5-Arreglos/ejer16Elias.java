public class ejer16Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("arreglo ORIGINAL");
    mostrar_arr(arr);
    corrimiento_izquierda(arr);
    mostrar_arr(arr);
  }
  //en caso de que se elimine el ultimo, deberai de si o si insertar algo en esa posicion(creo)
  public static void corrimiento_izquierda(int []arr){
    int pos = MAX - 1;
    int posicion = 3;
    while (posicion<pos) {
      arr[posicion] = arr[posicion + 1];
      posicion++;
    }
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }
}
/*
16.  Implementar  un  método  que  realice  un  corrimiento  a  izquierda 
en  un  arreglo  ordenado  de  tamaño  MAX=10  a  partir  de  una 
posición. 
*/