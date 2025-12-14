public class ejer4Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    char[] arr = { 'a', 'c', 's', 'f', 'f', 's', 'g', 'f', 'j', 'h' };

    char caracter = ' '; 
    caracter = pedir_caracter(caracter);
    mostrar_arr(arr);
    buscar_caracter(arr, caracter);
  }

  public static char pedir_caracter(char caracter) {
    System.out.println("eu morfi, dame un caracter.");
    caracter = Utils.leerChar();
    return caracter;
  }

  public static void mostrar_arr(char[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }

  public static void buscar_caracter(char[] arr, char caracter) {
    for (int pos = 0; pos < MAX;pos++){
      if (arr[pos] == caracter) {
        System.out.println(caracter + " esta en la pos: " + pos + " | ");
      } else {
        System.out.println(caracter + " no esta en la pos: " + pos + " | ");
      }
    }
  }
}
/* Buscar  un  elemento  en  un  arreglo  de  caracteres  ya  cargado  de 
tamaño  10  y  mostrar  la/s  posición/es  del  elemento,  en  caso  de  no 
estar indicarlo también.  */