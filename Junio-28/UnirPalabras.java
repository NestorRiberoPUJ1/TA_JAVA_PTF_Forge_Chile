public class UnirPalabras {

  public static String recortarUnir(String palabra1, String palabra2) {
    /* Eliminar excesos o reemplazar espacios */
    String result = "";
    String resultP1 = palabra1.replace(" ", "");
    String resultP2 = palabra2.replace(" ", "");
    /* Unir */
    result = result.concat(resultP1).concat(resultP2);

    return result;
  }
}
