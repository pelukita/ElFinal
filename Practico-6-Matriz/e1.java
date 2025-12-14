public class e1{
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
        invertirmatriz(mat);
        mostrar(mat);
    }
    public static void invertirmatriz(int[][]matriz){
        for(int i=0;i<MAXC;i++){
            invertirArreglo(matriz[i]);
        }
    }
    public static void invertirArreglo(int[] arr){
        int ini=0,fin=(MAXF-1)/2;
        while (ini<fin) {
            int temp=arr[ini];
            arr[ini]=arr[fin];
            arr[fin]=temp;
            ini++;
        }
    }
    public static void mostrar(int[][] mat){
        for(int i=0;i<MAXF;i++){
            for(int j=0;j<MAXC;j++){
                System.out.print("["+mat[i][j] +"]");
            }
            System.out.println();
        }
    }
}
/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, invierta el orden del contenido
por fila. Este intercambio no se debe realizar de manera explícita,
hay que hacer un método que incluya una iteración de
intercambio.
 */