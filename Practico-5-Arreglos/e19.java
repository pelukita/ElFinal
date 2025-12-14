public class e19{
        final static int MAX=10;
    public static void main(String[] args) {
        int []arr={0,1,5,3,4,5,6,5,8,9};
        System.out.println("ingrese un numero: ");
        int pos=Utils.leerInt();
        System.out.println();
        mostrar(arr);
        eliminarOcurrencias(arr,pos);
        System.out.println();
        mostrar(arr);
    }
    public static void eliminarOcurrencias(int[] arr , int n){
        int pos;
        while((pos=BuscarPos(arr,n))!=-1){
            corrimientoI(arr,pos);
        }
    }
    public static void corrimientoI(int[] arr,int pos){
        while(pos<MAX-1){
            arr[pos]=arr[pos+1];
            pos++;
        }
    }
    public static int BuscarPos(int[]arr , int n){
        for(int i=0;i<MAX;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void mostrar(int[] a){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+a[i] +"| ");
        }
    }

}