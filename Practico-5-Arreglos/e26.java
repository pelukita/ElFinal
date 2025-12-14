import java.lang.reflect.Array;
import java.util.ArrayList;

public class e26 {
  // Sequence lenght = 20.
    public static void main(String[] args) {
    int[] sequence = {0, 0, 5, 3, 2, 0, 0, 7, 8, 9, 2, 0, 1, 0, 0, 0, 6, 6, 0, 0};
    int count = 0;
    int amountOfSequences = 0;
    int[] listOfSequences = new int[20];
    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] != 0) {
        count++;
      } else {
        listOfSequences[amountOfSequences] = count;
        amountOfSequences++;
        count = 0;
      }
    }
    //0 | 0 | 3 | 0 | 4 | 1 | 0 | 0 | 2 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 
    //significa que estás intentando acceder a un arreglo que tiene longitud 0 (está vacío) en la posición 0.
    for (int i = 0; i < listOfSequences.length; i++) {
      System.out.print(listOfSequences[i] + " | ");
    }
  }
}
/* 📝 Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño. 
*/