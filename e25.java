public class e25{
   final static int MAX = 20;

    public static void main(String[] args) {
        int[] arr = {0, 0, 5, 3, 2, 0, 0, 7, 8, 9, 0, 4, 1, 0, 0, 0, 6, 6, 0, 0};

        secuencia(arr);
    }

    public static void secuencia(int[] arr) {
        int pos = MAX - 1;
        int contador = 0;

        while (pos >= 0) {
            pos = buscarFin(arr, pos);
            if (pos >= 0) {
                int fin = pos;
                pos = buscarIni(arr, pos);
                int ini = pos;
                contador++;

                if (contador == 2) {
                    System.out.println("Inicio: " + ini);
                    System.out.println("Fin: " + fin);
                    return;
                }
            }
        }
    }

    public static int buscarFin(int[] arr, int pos) {
        while (pos >= 0 && arr[pos] == 0) {
            pos--;
        }
        return pos;
    }

    public static int buscarIni(int[] arr, int pos) {
        while (pos >= 0 && arr[pos] != 0) {
            pos--;
        }
        return pos + 1;
    }
}
/*Hacer un programa que devuelva la posición de inicio y fin de la
anteúltima secuencia de números distintos de ceros.
 */