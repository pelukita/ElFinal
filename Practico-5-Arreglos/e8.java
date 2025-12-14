public class e8{
   
    public static void main(String[] args) {
        int[] arr={1,2,5,4,5};
        boolean loes;
        loes=esAscendente(arr);
        mostrarverdad(loes);
    }
    public static void mostrarverdad(boolean loes){
        if(loes){
            System.out.println("el arreglo se encuentra ascendente");
        }
        else{
            System.out.println("el arreglo no es ascendente");
        }
    }
    public static boolean esAscendente(int[]arr){
        boolean verdad=true;
        for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] < arr[i + 1]) {
            verdad=true;
        }
        else{
            return false;
        }
    }
    return verdad;
    }
}
/*Hacer un programa que determine si los valores almacenados en
un arreglo de enteros se encuentran en orden ascendente.
*/