public class PadelPlayerTesting {

  public static void main(String[] args) {


    PadelPlayer pete = new PadelPlayer("Pete");

    System.out.println(pete.getName());
    pete.serve("Abierto al muro");
    pete.train();
    pete.exercise();
  }
}
