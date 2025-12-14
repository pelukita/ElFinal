public class e4{
    final static int MAX=10;
    public static void main(String[] args){
        char [] arr={'a','b','c','d','e','f','g','h','i','j'};
        System.out.println("ingresa el caracter a buscar: ");
        char buscar=Utils.leerChar();
        buscar_palabra(buscar,arr);
        
    }
    
    public static void buscar_palabra(char b,char[]arr){
        int pos=0;
        for(int i=0;i<MAX;i++){
            if(arr[i]==b){
                mostrar_pos(i);
            }
            else{
                System.out.println("el caracter no se encontro: ");
            }

        }
    }
    public static void mostrar_pos(int pos){
    
        System.out.println("el caracter se encuentra en la posicion: "+pos);
    
    }
}