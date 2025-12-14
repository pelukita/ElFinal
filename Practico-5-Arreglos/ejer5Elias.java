public class ejer5Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    char[] arr = { 'a', 'c', 's', 'f', 'f', 's', 'g', 'f', 'j', 'h' };
    mostrar_arr(arr);
    invertir(arr);
    mostrar_arr(arr);
  }
  
  public static void mostrar_arr(char[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }

  public static void invertir(char[] arr) {
    for (int pos = MAX-1; pos >=0; pos--) {
      System.out.print(arr[pos] + " | ");
    }
    System.out.println();
  }
}
/* Hacer  un  programa  que  dado  un  arreglo  de  caracteres  de  tamaño 
MAX que se encuentra cargado, invierta el orden del contenido.  */
/*
 public static void inventirArr(char[] Arr) {
    int Maxi = MAX + 1;
    for (int i = 0; i < Maxi / 2; i++) {
      char tiempo = Arr[i];
      Arr[i] = Arr[Maxi - 1 - i];
      Arr[Maxi - 1 - i] = tiempo;
    }
  }
*/