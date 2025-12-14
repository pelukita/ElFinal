public class e23 {
    final static int MAX=20;

    public static void main(String[] args) {
      int[] arr = {0, 0, 5, 3, 2, 0, 0, 7, 8, 9, 0, 4, 1, 0, 0, 0, 6, 6, 0, 0};
      
      int ini=0;
      ini=buscarIni(arr,ini);
      int fin=buscarFin(arr,ini);
      System.out.println("inicio "+ini);
        System.out.println("fin "+fin);
    }
    public static int buscarIni(int[] arr,int pos){
        while(pos < MAX && arr[pos] == 0){
            pos++;
        }
        return pos;
    }
    public static int buscarFin(int[] arr , int pos){
        while(pos < MAX && arr[pos] != 0){
            pos++;
        }
        return pos-1;
    }
 

}
/*Dado un arreglo de tamaño de arreglo MAX=20 de secuencias. En
el caso de eliminar secuencias se debe hacer corrimiento.
23. Hacer un programa que devuelva la posición de inicio y fin de la
primera secuencia de números distinta de ceros */