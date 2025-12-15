public class e2{
    final static int MAXF=5;
    final static int MAXC=10;
    public static void main(String[] args) {
        int[][] mat = {
                        {1,  2,  3,  4,  5,  6,  7,  8,  9, 10},
                        {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                        {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                        {41, 42, 43, 44, 45, 46, 47, 48, 49, 50}
                        };
        mostrar(mat);
        System.out.println();
        secuencia(mat);
        
    }
    public static void secuencia(int[][]m ){
        int cantP=0;
        for(int i=0;i<MAXF;i++){
           cantP+=buscarPar(m[i]);
        }
        System.out.println("la cantidad de numeros pares en la matriz es: "+cantP);
    }
    public static int buscarPar(int []arr){
        int total=0;
        for(int i=0;i<MAXC;i++){
            if(arr[i]%2==0){
                total++;
            }
        }
        return total;
    }
    public static void mostrar(int[][] m ){
        for(int i =0;i<MAXF;i++){
            for(int j =0;j<MAXC;j++){
                System.out.print("|"+m[i][j]+"|");
            }
        }
    }
}
/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, obtenga la cantidad de
números pares que tiene y la imprima.
 */