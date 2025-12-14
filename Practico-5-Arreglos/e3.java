public class e3 {
    final static int MAX=10;
  public static void main(String [] args){
    int[] arr=new int[MAX];
    double promedio=0;
    int valor;
    cargar_arreglo(arr);
    promedio=calcular_promedio(arr);
    mostrarPromedio(promedio);
    valor=porEncima(arr,promedio);
    mostrarporEncima(valor);
  }
  public static void mostrarPromedio(double promedio){
    System.out.println("El promedio del arreglo es: "+promedio);
  }
  public static void mostrarporEncima(int valor){
    System.out.println("La cantidad de elementos que esta por encima del promedio son: "+valor);
  }
  public static void cargar_arreglo(int[]arr){
    System.out.println("Insertar Valores");
    for(int i=0;i<MAX;i++){
        arr[i]=Utils.leerInt();
    }
  }
  public static double calcular_promedio(int[]arr){
    int cantidad=0;
    int total=0;
    double devolver;
    for(int i=0;i<MAX;i++){
        total+=arr[i];
        cantidad++;
    }
    return devolver=(total/cantidad);
  }
  public static int porEncima(int[]arr, double p){
    int total=0;
    for(int i=0;i<MAX;i++){
        if(arr[i]>p){
            total++;
        }
    }
    return total;
  }

}
