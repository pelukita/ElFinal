public class e13{
    final static int MAX=5;
    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c', 'd', 'e'};
        char[] consonantes = new char[MAX];
        char[] vocales = new char[MAX];
        mostrar(letras);
        separador(consonantes,vocales,letras);
        System.out.println();
        mostrar(consonantes);
        System.out.println();
        mostrar(vocales);
    }
    public static void separador(char[]c,char[]v,char[]l){
    int iv = 0; // índice vocales
    int ic = 0; // índice consonantes
    for (int i = 0; i < MAX; i++) {
        if (l[i] == 'a' || l[i] == 'e' || l[i] == 'i'
                || l[i] == 'o' || l[i] == 'u') {

            v[iv] = l[i];
            iv++;

        } else {

            c[ic] = l[i];
            ic++;
        }
    }
    }
    public static void mostrar(char[]a){
        for(int i=0;i<MAX;i++){
            System.out.print("|"+a[i]+"| ");
        }
    } // 💻
}
/* 🌟 Dado un arreglo de caracteres de tamaño MAX, hacer un
programa que implemente métodos tal que devuelva al main dos
arreglos: un arreglo con los caracteres que son letras vocales y
otro con los que son consonantes.🎶 */