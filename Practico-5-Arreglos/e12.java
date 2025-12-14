public class e12 {
    final static int MAXA = 4;

    public static void main(String[] args) {
        int[] A = new int[MAXA];
        int[] B = new int[MAXA - 1];
        cargar_arreglos(A, B);
    }

    public static void cargar_arreglos(int[] A, int[] B) {
        int total;

        System.out.println("Ingrese la carga de los valores para arreglo A");
        for (int i = 0; i < MAXA; i++) {
            A[i] = Utils.leerInt();
        }

        System.out.println("Ingrese las posiciones entre 0 y " + (MAXA - 1));
        for (int j = 0; j < B.length; j++) {
            int valor2 = Utils.leerInt();
            if (valor2 >= 0 && valor2 < MAXA) {
                B[j] = valor2;
            } else {
                System.out.println("Posición inválida, ingrese nuevamente");
                j--; // no avanzo si es inválida

            }
        }

        total = suma_pos(A, B);
        System.out.println("La suma de las posiciones es: " + total);
    }

    public static int suma_pos(int[] A, int[] B) {
        int suma = 0;
        for (int i = 0; i < B.length; i++) {
            suma += A[B[i]];
        }
        return suma;
    }
}
/*Dado dos arreglos de números enteros: un arreglo A de tamaño
MAXA y un arreglo B de tamaño MAXB con números entre 0 y
MAXA-1, determinar la suma de los elementos del arreglo A cuyas
posiciones son indicadas por el arreglo B. Por ejemplo, dado
A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
y el 31 de la posición 2 del arreglo A).
 */