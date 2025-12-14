public class e17{
   final static int MAX=10;
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println("ingrese un numero: ");
        int pos=Utils.leerInt();
        System.out.println();
        mostrar(arr);
        meterN(arr,pos);
        System.out.println();
        mostrar(arr);
    }
    public static void meterN(int[]arr, int n){
        int fin=MAX-1;
        int ini=0;
        while(ini<fin){
            arr[fin]=arr[fin-1];
            fin--;
        }
        arr[ini]=n;
    }
    public static void mostrar(int[] a){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+a[i] +"| ");
        }
    }
}
/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra cargado, solicite al usuario un número entero
y lo agregue al principio del arreglo (posición 0). Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del
arreglo) y colocar el número en el arreglo en la posición indicada. */