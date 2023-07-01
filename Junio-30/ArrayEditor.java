import java.util.ArrayList;

public class ArrayEditor {

  public int[] cambiarValores(int[] array) {
    for (int idx = 0; idx < array.length - 1; idx++) {
      array[idx] = array[idx + 1];
    }
    array[array.length - 1] = 0;
    return array;
  }

  public ArrayList<Integer> cambiarValores2(ArrayList<Integer> array) {
    array.remove(0);
    array.add(0);
    return array;
  }

  public void showArray(String[] nombres) {

    /* Bucle for modificado para acceder directo a  los valores */
    for (String nombre : nombres) {
      System.out.println(nombre);
    }
  }
}
