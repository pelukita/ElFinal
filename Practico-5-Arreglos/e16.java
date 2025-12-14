public class e16{
    final static int MAX=10;
    public static void main(String[] args) {
        int []arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println("ingrese la posicion a correr: ");
        int pos=Utils.leerInt();
        mostrar(arr);
        corrimientoi(arr,pos);
        System.out.println();
        mostrar(arr);
    }
    public static void corrimientoi(int[]a,int pos){
        int ini=pos;
        while(ini<=MAX-1){
            a[ini]=a[ini+1];
            ini++;
        }
    }
    public static void mostrar(int[] a){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+a[i] +"| ");
        }
    }

}
