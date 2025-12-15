public class ee{
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
     int[] valores=new int[2];
     mostrar(mat);
     pedirN(valores);
     secuencia(mat,valores); 
     mostrar(mat);                
    }
    public static void secuencia(int[][]m,int[]v){
        int fila=v[0];
        int columna=v[1];
        for(int i=0;i<MAXF;i++){
            if(i==fila){
                corrimiento(m[i],columna);
            }
        }
    }
    public static void corrimiento(int[]arry,int pos){
        while(pos<MAXC-1){
            arry[pos]=arry[pos+1];
            pos++;
        }
    }
    public static void pedirN(int[]n){
        System.out.println("ingrese dos posiciones");
        for(int i=0;i<n.length;i++){
            n[i]=Utils.leerInt();
        }
    }
    public static void mostrar(int[][]m){
        for(int i=0;i<MAXF;i++){
            System.out.println();
            for(int j=0;j<MAXC;j++){
                System.out.print("|"+m[i][j]+"|");
            }
        }
    }
}
/*Hacer un programa que dada una matriz de enteros de tamaño
5*10 que se encuentra precargada, solicite al usuario una posición
fila, columna y realice un corrimiento a izquierda.
 */