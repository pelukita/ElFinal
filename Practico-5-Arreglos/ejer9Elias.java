public class ejer9Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    char[] arr = { 'a', 'c', 's', 'f', 'f', 's', 'g', 'f', 'j', 'h' };
    mostrar_arr(arr);
    System.out.println("Hay almenos una letra repetida? : " + contar_repetidas(arr));
  }
  
  public static boolean contar_repetidas(char[] arr) {
    int pos = 0;
    int MAXi = MAX - 1;
    boolean yes = false;
    while (pos < MAXi) {
      for (int i = pos; i < MAXi; i++) {
        if (arr[i] == arr[i + 1]) {
          return yes = true;
        }
      }
      pos++;
    }
    return false;
  }
  

  public static void mostrar_arr(char[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }
}
/*.  Dado  un  arreglo  de  caracteres,  determinar  si  en  el  arreglo  existe  al 
menos una letra repetida.  */