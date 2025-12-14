public class e24{
    final static int MAX=20;
    public static void main(String[] args) {
        int[] arr = {0, 0, 5, 3, 2, 0, 0, 7, 8, 9, 0, 4, 1, 0, 0, 0, 6, 6, 0, 0};
        int ini=0,suma=0;
        ini=buscari(arr,ini);
        int fin=buscarf(arr,ini);
        suma=sumaSe(arr,ini,fin);
        int totalse=cantidadse(arr,ini,fin)
        System.out.println("la suma se la secuencia es: "suma);
    }
    public static int cantidadse(int[] arr,int ini,int fin){
        int total=0;
        while(ini<fin){
            ini++;
            total++;
        }
    }
    public static int buscari(int[] arr , int pos){
        while(pos<MAX && arr[pos]==0){
            pos++;
        }
        return pos;
    }
    public static int sumaSe(int[] arr,int ini,int fin){
        int total=0;
        while(ini<fin){
            total+=arr[ini];
            ini++;
        }
        return total;
    }
    public static int buscarf(int[] arr, int pos){
        while(pos<MAX-1&&arr[pos]!=0){
            pos++; 
        }
        return pos-1;
    }
}
/*Hacer un programa que devuelva la posición de inicio y fin de la
secuencia de números distintos de ceros cuya suma del contenido
sea mayor. */