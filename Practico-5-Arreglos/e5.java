public class e5{
    final static int MAX=10;
    public static void main(String[]args ){
        int []arr=new int[MAX]; 
        cargar_arreglo(arr);
        mostar_arreglo(arr);
        System.out.println();
        invertir_arreglo(arr);
    }
    public static void mostar_arreglo(int[] arr){
        int pos=0;
        while(pos<MAX){
            System.out.print("["+arr[pos]+"]");
            pos++;
        }
    }
    public static void cargar_arreglo(int[]arr){
        System.out.println("carga el arreglo con entero");
        for(int i=0;i<MAX;i++){
            arr[i]=Utils.leerInt();
        }
    }
    public static void invertir_arreglo(int[] arr){
        for(int i=MAX-1;0<=i;i--){
            System.out.print("["+arr[i]+"]");
        }
    }
}