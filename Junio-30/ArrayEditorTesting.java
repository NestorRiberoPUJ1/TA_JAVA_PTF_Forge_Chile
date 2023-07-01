import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEditorTesting {

  public static void main(String[] args) {
    ArrayEditor editor = new ArrayEditor();
    int[] lista = { 1, 2, 3, 4, 5, 6, 7 };
    int[] resultado = editor.cambiarValores(lista);
    System.out.println(Arrays.toString(resultado)); // Se utiliza Arrays.toString para poderlo leer como humanos

    ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ArrayList<Integer> resultado2 = editor.cambiarValores2(lista2);
    System.out.println(resultado2);

    String[] nombres = { "Nestor", "Pablo", "Sergio" };
    editor.showArray(nombres);
  }
}
