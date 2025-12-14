public class e36{
    final static int MAX=10;
    public static void main(String[] args) {
     int[] arr = {2, 5, 9, 13, 18, 24, 31, 40, 56, 72};
     int n=0;
        n=pedirN(n);
        mostrar(arr);
        buscar(arr,n);
        mostrar(arr);
    }
    public static void buscar(int[]arr,int n){
    boolean encontrado = false;

    for (int i = 0; i < MAX && !encontrado; i++) {
        if (arr[i] == n) {
            eliminar(arr, i);
            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("no se encontro el numero");
    }
        
    }
    public static void eliminar(int [] arr , int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
    }
     public static int pedirN(int n){
        System.out.println("ingrese el numero a insertar en el arreglo: ");
        n=Utils.leerInt();
        return n;
    }
     public static void mostrar(int[] arr){
        for(int i=0;i<MAX;i++){
            System.out.print(" |"+arr[i] +"| ");
        }
        System.out.println();
    }
}
/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y elimine la primera ocurrencia de
número (un número igual) en el arreglo (si existe). Informar si no
existe en el arreglo.
 */