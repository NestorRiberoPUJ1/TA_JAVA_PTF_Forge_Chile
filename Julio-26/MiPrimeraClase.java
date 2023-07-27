public class MiPrimeraClase {

  /*Atributos de instancia */
  private String tema;
  private int duracion;
  private String profesor;

  /* Constructores */
  public MiPrimeraClase(String tema, int duracion, String profesor) {
    this.tema = tema;
    this.duracion = duracion;
    this.profesor = profesor;
  }

  public MiPrimeraClase(String tema, String profesor) {
    this.tema = tema;
    this.profesor = profesor;
    this.duracion = 60;
  }

  public MiPrimeraClase() {}

  /*Métodos de instancia */
  public void ensenarClase() {
    System.out.println(profesor + " ESTA ENSEÑANDO " + tema);
  }

  /*Getters y Setters de instancia */
  public String getTema() { //Retorna el valor de tema para leerlo en otra clase
    return tema;
  }

  public void setTema(String tema) { //Modifica el valor de tema desde otra clase
    this.tema = tema;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public String getProfesor() {
    return profesor;
  }

  public void setProfesor(String profesor) {
    this.profesor = profesor;
  }
}
