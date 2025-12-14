/*Hacer un programa que dado un arreglo de enteros y un número
N, genere un arreglo con las posiciones donde se encuentra dicho
número. A continuación, multiplicar por un número M todas las
ocurrencias del número N en el arreglo original.
*/
public class e7{
    final static int MAX=5;
    public static void main(String[] args){
        int[] arr=new int[MAX];
        int[] arr2=new int[MAX];
        System.out.println("ingrese " + MAX + "valores: ");
        cargar_arreglo(arr);
        mostrar(arr);
        System.out.println();
        int n= cargar_n();
        buscar_numero(n,arr,arr2);
        System.out.println("arreglo modificado");
        mostrar(arr2);
    }
    public static void mostrar(int[] arr){
        for(int i=0;i<MAX;i++){
            System.out.print("["+arr[i]+"]");
        }
    }

    public static void buscar_numero(int n , int []arr, int[]arr2){
        int pos=0,M=0;
        for(int i=0;i<MAX;i++){
            if (arr[i] == n){
                arr2[pos]=i;
                pos++;
                M++;
            }
        }
        mostrar(arr2);
        multiplicar_ocurrencia(M,arr2);

    }
 
    public static void multiplicar_ocurrencia(int M,int[]arr){
        for(int i=0;i<MAX;i++){
            arr[i]=(arr[i]*M);
        }
    }
    public static void cargar_arreglo(int[] arr){
        for(int i=0;i<MAX;i++){
            arr[i]=Utils.leerInt();
        }
    }
    public static int cargar_n(){
        System.out.println("Ingrese el numero a buscar en el arreglo lugo se devolvera el arreglo de las posiciones donde se encuentre el numero: ");
        int n=Utils.leerInt();
        return n;
    }
}