public class e35{
    final static int MAX=10;
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 13, 18, 24, 31, 40, 56, 72};
        int n=0;
        n=pedirN(n);
        mostrar(arr);
        insertar
    }
    public static void mostrar(int[] arr){
        for(int i=0;i<MAX;i++){
            System.out.println(" |"+arr[i] +"| ");
        }
    }
    public static int pedirN(int n){
        System.out.println("ingrese el numero a insertar en el arreglo: ");
        n=Utils.leerInt();
        return n;
    }
}
/*Hacer un programa que dado un arreglo ordenado creciente de
enteros de tamaño 10 que se encuentra precargado, solicite al
usuario un número entero y lo inserte en el arreglo manteniendo
su orden. Para ello tendrá que realizar un corrimiento a derecha
(se pierde el último valor del arreglo) y colocar el número en el
arreglo en la posición indicada. */