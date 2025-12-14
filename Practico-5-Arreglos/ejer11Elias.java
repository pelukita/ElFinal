public class ejer11Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] arr2 = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

    mostrar_arr(arr);
    mostrar_arr(arr2);
    boolean valor = arr_en_arr2(arr, arr2);
    if (valor) {
      System.out.println("Si, todos lso de A estan en B");
    } else {
      System.out.println("no, no todos los de A estan B");
    }
    
  }

  public static boolean arr_en_arr2(int[] arr, int[] arr2) {
    for (int i = 0; i < MAX; i++) {
      boolean valor = false;

      for (int j = 0; j < MAX; j++) {
        if (arr[i] == arr2[j]) {
          valor = true;
        }
      }

      if (!valor) {
        return false;
      }

    }
    return true; // 🧑🏻‍💻
  }
  
  public static void mostrar_arr(int []arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }
}
/* 🌟 Dado  dos  arreglos  de  números  enteros  A  y  B  determinar  si 
todos  los  números  almacenados  en  el  arreglo  A  están  presentes 
en el arreglo B.  */