public class ejer16Elias {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    System.out.println("arreglo ORIGINAL");
    mostrar_arr(arr);
    corrimiento_derecha_while(arr);
    System.out.println("corrimiento DERECHA WHILE");
    mostrar_arr(arr);
    corrimiento_derecha_for(arr);
    System.out.println("corrimiento DERECHA FOR");
    mostrar_arr(arr);
  }
  //con WHILE
  public static void corrimiento_derecha_while(int[] arr) {
    int posicion = 3;
    int pos = MAX - 1;
    while (posicion <= pos) {
      arr[pos] = arr[pos - 1];
      pos--;
    }
  }
  
  public static void corrimiento_derecha_for(int[] arr) {
    int posicion = 6;
    for (int pos = MAX - 1; pos >= posicion; pos--) {
      arr[pos]=arr[pos-1];
    }
  }

  public static void mostrar_arr(int[] arr) {
    int pos = 0;
    while (pos < MAX) {
      System.out.print(arr[pos] + " | ");
      pos++;
    }
    System.out.println();
  }
}
/*15.  Implementar  un  método  que  realice  un  corrimiento  a  derecha 
en  un  arreglo  ordenado  de  tamaño  MAX=10  a  partir  de  una 
posición. 
16.  Implementar  un  método  que  realice  un  corrimiento  a  izquierda 
en  un  arreglo  ordenado  de  tamaño  MAX=10  a  partir  de  una 
posición. 
17.  Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño 
10  que  se  encuentra  cargado,  solicite  al  usuario  un  número  entero 
y  lo  agregue  al  principio  del  arreglo  (posición  0).  Para  ello  tendrá 
que  realizar  un  corrimiento  a  derecha  (se  pierde  el  último  valor  del 
arreglo) y colocar el número en el arreglo en la posición indicada. 
18.  Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño 
10  que  se  encuentra  precargado,  solicite  al  usuario  un  número 
entero  y  elimine  la  primera  ocurrencia  del  número  (un  número 
igual)  en  el  arreglo  (si  existe).  Para  ello  tendrá  que  buscar  la 
posición  y  si  está,  realizar  un  corrimiento  a  izquierda  (queda  una 
copia de la última posición del arreglo en la anteúltima posición). 
19.  Hacer  un  programa  que  dado  un  arreglo  de  enteros  de  tamaño 
10  que  se  encuentra  precargado,  solicite  al  usuario  un  número 
entero  y  elimine  todas  las  ocurrencia  de  número  en  el  arreglo. 
Mientras  exista  (en  cada  iteración  tiene  que  buscar  la  posición 
dentro  del  arreglo)  tendrá  que  usar  la  posición  para  realizar  un 
corrimiento  a  izquierda  (quedarán  tantas  copias  de  la  última 
posición del arreglo como cantidad de ocurrencias del número). 
20.  Suponer  a  partir  de  lo  resuelto  en  el  ejercicio  anterior  (11)  que 
el  elemento  a  eliminar  coincide  con  el  último  que  hay  en  el  arreglo. 
¿Qué pasa en este caso? ¿Cómo daría una solución al problema? 
21.  Hacer  un  programa  que  inserte  un  elemento  en  un  arreglo 
(ordenado decrecientemente) de tamaño MAX=10. 
22.  Hacer  un  programa  que  elimine  los  valores  pares  en  un  arreglo 
de tamaño MAX=10. */