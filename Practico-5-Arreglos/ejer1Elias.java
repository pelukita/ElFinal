public class ejer1Elias {
  final static int MAX = 15;

  public static void main(String[] args) {
    int[] arr = new int[MAX];
   
    cargar_arreglo(arr);
    mostrar_arr(arr);
  }

  public static void cargar_arreglo(int[] arr) {
    System.out.println("Señor morfeo ngrese un numeor entre 1 y 12, para llenar el arreglo (°-°)");
    for (int pos = 0; pos < MAX; pos++) {
      arr[pos] = Utils.leerInt();
    }
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos<MAX) {
      System.out.println("posicion:" + pos + " : " + arr[pos]);
      System.out.print("");
      pos++;
    }
  }
}
/*1.  Cargar  un  arreglo  de  tamaño  15,  pidiendo  el  ingreso  por  teclado 
de valores entre 1 y 12. Luego mostrar cómo quedó cargado.  */