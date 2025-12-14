public class ejer10Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 4, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    mostrar_arr(arr);
    int n = pedir_n();
    int numero = cantidad_n(arr, n);
    System.out.println("la cantidad de numeros primos es: " + numero);
  }

  public static int cantidad_n(int[] arr, int n) {
    int pos = 0;
    int contador = 0;
    while (pos<MAX) {
      if (arr[pos] / arr[pos] == 1 && arr[pos] % 2 !=0) {
        contador++;
      }
      pos++;
    }
    return contador;
    // waiting for she to return to me
    // she missed with another guy
  }
  
  public static int pedir_n() {
    System.out.println("Ingrese un numero entero señor morfeo.");
    int valor = Utils.leerInt();
    return valor;
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
/*Hacer un programa que verifique en un arreglo si tiene al
menos N números primos. N debe ser ingresado por el usuario.
Reutilizar los métodos ya desarrollados.

int userNumber = java.util.Scanner(System.in).nextInt();
int[] array = {1, 10, 11, 12, 20, 23, 31}
for (int i = 0; i < array.length; i++) {
    if (userNumber == array[i] %  )

hola que tal?
}

 */