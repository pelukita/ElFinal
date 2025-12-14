public class ejer12Elias {
  final static int MAXA = 5;
  final static int MAXB = 2;

  public static void main(String[] args) {
    int[] arr = { 1000, 1, 2, 3, 4, };
    int[] arr2 = { 0, 2};

    mostrar_arr(arr);
    mostrar_arr2(arr2);
    esaSuma(arr, arr2);
  }
  
  public static void esaSuma(int[] arr, int[] arr2) {
    int suma = 0;
    for (int i = 0; i < MAXB; i++) {
      int posicion = arr2[i];
      if (posicion >= 0 && posicion < MAXA) {
        suma += arr[posicion];
      }
    }
    System.out.println("la suma es: " + suma);
  }
   // 🚬 en efecto es codigo
  public static void mostrar_arr2(int []arr2) {
    int pos = 0;
    while (pos < MAXB) {
      System.out.print(arr2[pos] + " | ");
      pos++;
    }
    System.out.println();
  }

  public static void mostrar_arr(int []arr) {
    int pos = 0;
    while (pos < MAXA) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }
}
/* 🌟 putoo..... Dado  dos  arreglos  de  números  enteros:  un  arreglo  A  de  tamaño 
MAXA  y  un  arreglo  B  de  tamaño  MAXB  con  números  entre  0  y 
MAXA-1,  determinar  la  suma  de  los  elementos  del  arreglo  A  cuyas 
posiciones  son  indicadas  por  el  arreglo  B.  Por  ejemplo,  dado 
A={3,6,31,9},  MAXA=3  y  B={0,2}  con  MAXB=2  el  sistema  deberá 
informar:  34  (lo  cual  es  el  resultado  de  sumar  el  3  de  la  posición  0 
y el 31 de la posición 2 del arreglo A). 🧑‍💻 1️2️ */