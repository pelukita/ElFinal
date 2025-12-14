import java.lang.reflect.Array;
import java.util.ArrayList;

public class e26 {
    // Sequence lenght = 20.
    public static void main(String[] args) {
    // 7\10
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
    int buffer = 0;
    for (int i = 0; i < listOfSequences.length; i++) {
        if (listOfSequences[i] < buffer) {
            buffer = listOfSequences[i];
        }
    }
    for (int i = 0; i < sequence.length - buffer; i++) {
        if (sequence[i] != 0 && sequence[i + buffer] != 0) {
            
        }
    }
    // pene 🗿
    //puto 🏳‍🌈 (°v°)
    //0 | 0 | 3 | 0 | 4 | 1 | 0 | 0 | 2 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 
    //0 | 0 | 3 | 0 | 4 | 1 | 0 | 0 | 2 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
    //significa que estás intentando acceder a un arreglo que tiene longitud 0 (está vacío) en la posición 0.
  }
}
/* 📝 Hacer un programa que devuelva la posición de inicio y de fin
de la secuencia de mayor tamaño. 
*/


/*
Posicion donde comienza la secuencia mas larga: 5
Posicion donde termina la secuencia mas larga: 5
Posicion donde comienza la secuencia mas larga: 3
Posicion donde termina la secuencia mas larga: 3
Posicion donde comienza la secuencia mas larga: 2
Posicion donde termina la secuencia mas larga: 2
Posicion donde comienza la secuencia mas larga: 7
Posicion donde termina la secuencia mas larga: 7
Posicion donde comienza la secuencia mas larga: 8
Posicion donde termina la secuencia mas larga: 8
Posicion donde comienza la secuencia mas larga: 9
Posicion donde termina la secuencia mas larga: 9
Posicion donde comienza la secuencia mas larga: 2
Posicion donde termina la secuencia mas larga: 2
Posicion donde comienza la secuencia mas larga: 1
Posicion donde termina la secuencia mas larga: 1
Posicion donde comienza la secuencia mas larga: 6
Posicion donde termina la secuencia mas larga: 6
Posicion donde comienza la secuencia mas larga: 6
Posicion donde termina la secuencia mas larga: 6
0 | 0 | 3 | 0 | 4 | 1 | 0 | 0 | 2 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
*/