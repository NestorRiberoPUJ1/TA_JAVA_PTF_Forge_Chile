public class Reforzamiento extends MiPrimeraClase {

  private String unidad;

  public Reforzamiento(
    String tema,
    int duracion,
    String profesor,
    String unidad
  ) {
    super(tema, duracion, profesor);
    this.unidad = unidad;
  }

  public Reforzamiento() {
    super();
  }

  public String getUnidad() {
    return unidad;
  }

  public void setUnidad(String unidad) {
    this.unidad = unidad;
  }

  @Override
  public void ensenarClase() {
    super.ensenarClase();
    System.out.println("La unidad: " + unidad+ " por "+ super.getDuracion() +" minutos");
  }
}
