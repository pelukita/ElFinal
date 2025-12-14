/*Dado dos arreglos de números enteros A y B determinar si
todos los números almacenados en el arreglo A están presentes
en el arreglo B.
 */
public class e11{
    final static int MAX=8;
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,7,6,8};
        int[]B={2,8,4,3,5,6,7,1};
        boolean verdad;
        verdad=contiene(A,B);
        seEncuentra(verdad);
    }
    public static void seEncuentra(boolean a){
        if(!a){
            System.out.println("No todos los numeros se encuentran almacenados");
        }
        else{
            System.out.println("se encuentran todos los numeros");
        }
    }
    public static boolean contiene(int[] A, int[] B) {
    for (int i = 0; i < MAX; i++) {
        boolean encontrado = false;
        for (int j = 0; j < MAX; j++) {
            if (A[i] == B[j]) {
                encontrado = true;
            }
        }
        if (!encontrado) {
            return false;
        }
    }
    return true;
    }
}