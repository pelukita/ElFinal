public class e15{
    final static int MAX=10;
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println("ingrese la posicion a correr: ");
        int pos=Utils.leerInt();
        mostrar(arr);
        corrimientod(arr,pos);
        System.out.println();
        mostrar(arr);
    }
    public static void corrimientod(int[]a,int pos){
         int fin = MAX - 1;
        while (pos < fin) {
            a[fin] = a[fin - 1];
            fin--;
    }
    }
    public static void mostrar(int[] a){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+a[i] +"| ");
        }
    }

}
/*Implementar un método que realice un corrimiento a derecha
en un arreglo ordenado de tamaño MAX=10 a partir de una
posición */