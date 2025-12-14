/*Dado un arreglo de caracteres, determinar si en el arreglo existe al
menos una letra repetida.
*/
public class e9{
    final static int MAX=8;
    public static void main(String[] args) {
        char [] letras={'a','b','c','a','b','b','d','g'};
        int canti;
        canti=repetido(letras);
        System.out.println("cantidad de reptidos:"+canti);

    }
    public static int repetido(char[]arr){
        char p=' ';
        int cantidad=0;
        for(int i=0;i<MAX;i++){
            p=arr[i];
            for(int j=i+1;j<MAX;j++){
                if(p==arr[j]){
                    cantidad++;
                }
            }
            
        }
        return cantidad-1;
    }
}