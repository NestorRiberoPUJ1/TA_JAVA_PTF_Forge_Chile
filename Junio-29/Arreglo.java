import java.util.ArrayList;

public class Arreglo {

  public static void main(String[] args) {
    int[] myArray; //Declaración
    myArray = new int[5];
    int[] arreglo2 = { 8, 8, 5, 9, 0 };
    System.out.println(myArray);
    System.out.println(arreglo2);

    System.out.println(arreglo2[3]);
    String[] palabras = { "Hola", "Estamos", "Aprendiendo", "Listas" };

    System.out.println(palabras[2]);

    ArrayList<Integer> ListaArreglo = new ArrayList<Integer>();
    System.out.println(ListaArreglo);
  }

  public Double average(Double[] list_num) {
    Double suma = 0.0;

    for (int x = 0; x < list_num.length; x++) {
        suma+=list_num[x];
    }

    return suma/list_num.length;
  }
}
