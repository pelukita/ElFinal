public class e37{
final static int MAX=10;
    public static void main(String[] args) {
        int[] arr = {10, 8, 45, 68, 25, 10, 31, 40, 56, 72};
        int[] arro=new int[2];
         mostrar(arr);
        ingresar(arro);
        secuencia(arr,arro);
        mostrar(arr);
    }
    public static void mostrar(int[] arr){
        for(int i=0;i<MAX;i++){
            System.out.print(" |"+arr[i] +"| ");
        }
        System.out.println();
    }
    public static void secuencia(int[]arr,int[]arro){
        ordenararro(arro);
        int inicio=arro[0],fin=arro[1];
        Ordenamientob(arr,inicio,fin);

    }
    public static void Ordenamientob(int[] arr , int ini,int fin){
        for(int i=ini;i<fin;i++){
            for(int j=ini;j<fin;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
            }
        }
        }
        
    }
    public static void ordenararro(int[] arro){
        if(arro[0]>arro[1]){
            int temp=arro[0];
            arro[0]=arro[1];
            arro[1]=temp;
        }
    }
    public static void ingresar(int[]arro){
        System.out.println("ingrese dos numeros entre el 1 y el 10");
        for(int i=0;i<arro.length;i++){
            arro[i]=Utils.leerInt();
        }
    }
}
/*Hacer un programa que dado un arreglo de enteros de tamaño
10 que se encuentra precargado, solicite al usuario el ingreso de
dos números enteros (posiciones del arreglo) y ordene de forma
creciente el arreglo entre dos posiciones correspondientes a los
números ingresados.
 */