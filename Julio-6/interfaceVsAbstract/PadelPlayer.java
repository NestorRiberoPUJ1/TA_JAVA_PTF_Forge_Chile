public class PadelPlayer extends Sportman implements RaquetPlay {

  public PadelPlayer(String name) {
    super(name);
  }

  /* Abstracto de la clase abstracta */
  public void train() {
    System.out.println("Hitting some swings");
  }

  /*Abstractos de la interfaz */
  public void drive(String driveType) {
    System.out.println(driveType);
  }

  public void backhand(String backhandType) {
    System.out.println(backhandType);
  }

  public void serve(String serveType) {
    System.out.println(serveType);
  }

}
