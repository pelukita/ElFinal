public class e18{
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
        for(int i=0;i<MAX;i++){
            if(arr[i]==n){
                eliminar(arr,arr[i],n);
            }
        }
    }
    public static void eliminar(int[]arr,int ini,int n){
        while(ini<MAX-1){
            arr[ini]=arr[ini+1];
            ini++;
        }
    }
    public static void mostrar(int[] a){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+a[i] +"| ");
        }
    }
}

/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario un número
entero y elimine la primera ocurrencia del número (un número
igual) en el arreglo (si existe). Para ello tendrá que buscar la
posición y si está, realizar un corrimiento a izquierda (queda una
copia de la última posición del arreglo en la anteúltima posición) */