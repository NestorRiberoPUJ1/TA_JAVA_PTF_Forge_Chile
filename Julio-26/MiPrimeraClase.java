import java.util.ArrayList;

public class MiPrimeraClase {

  private static int numClases = 0;
  private static ArrayList<MiPrimeraClase> listaClases = new ArrayList<MiPrimeraClase>();

  /*Atributos de instancia */
  private String tema;
  private int duracion;
  private String profesor;

  /* Constructores */
  public MiPrimeraClase(String tema, int duracion, String profesor) {
    this.tema = tema;
    this.duracion = duracion;
    this.profesor = profesor;

    numClases++;
    listaClases.add(this);
  }

  public MiPrimeraClase(String tema, String profesor) {
    this.tema = tema;
    this.profesor = profesor;
    this.duracion = 60;

    numClases++;
    listaClases.add(this);
  }

  public MiPrimeraClase() {
    numClases++;
    listaClases.add(this);
  }

  /*Getters y Setters de Clase */
  public static int getNumClases() {
    return numClases;
  }

  public static void setNumClases(int numClases) {
    MiPrimeraClase.numClases = numClases;
  }

  public static ArrayList<MiPrimeraClase> getListaClases() {
    return listaClases;
  }

  public static void setListaClases(ArrayList<MiPrimeraClase> listaClases) {
    MiPrimeraClase.listaClases = listaClases;
  }

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
