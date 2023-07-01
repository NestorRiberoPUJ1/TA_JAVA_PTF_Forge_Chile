public class CondicionalesTesting {

  public static void main(String[] args) {
    Condicionales cd = new Condicionales();

    System.out.println(cd.getSqrt(9.0));
    System.out.println(cd.getSqrt(-9.0));

    System.out.println(cd.getSqrt(-9.0, true));
  }
}
