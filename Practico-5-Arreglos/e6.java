public class e6{
    final static int MAX=10;
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        
        mostrarcantidadPar(arr);

    }
    public static void mostrarcantidadPar(int[] arr){
        int cantidad=0;
        for (int i=0;i<MAX;i++){
            if(arr[i]%2==0){
                cantidad++;
            }
        }
        System.out.println("Cantidad de numero pares en el arreglo es :"+cantidad);
    }
}