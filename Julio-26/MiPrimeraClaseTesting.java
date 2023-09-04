public class MiPrimeraClaseTesting {

  public static void main(String[] args) {
    System.out.println(MiPrimeraClase.getNumClases());
    System.out.println(MiPrimeraClase.getListaClases());
    
    MiPrimeraClase ayudantia = new MiPrimeraClase();
    MiPrimeraClase ayudantia2 = new MiPrimeraClase("JAVA", 55, "Nestor");
    MiPrimeraClase ayudantia3 = new MiPrimeraClase("REFORZAMIENTO", "JORGE");

    System.out.println(MiPrimeraClase.getNumClases());

    String perro = new String("PLUTO");

    System.out.println(perro);
    System.out.println(ayudantia.getDuracion()); //0
    System.out.println(ayudantia2.getDuracion()); //55
    System.out.println(ayudantia3.getDuracion()); //60

    ayudantia.ensenarClase(); //
    ayudantia2.ensenarClase(); //Nestor esta enseñando
    ayudantia3.ensenarClase(); //Jorge esta enseñando

    ayudantia.setProfesor("Jorge");
    ayudantia.setTema("HTML");
    ayudantia.ensenarClase(); //Jorge esta enseñando
    MiPrimeraClase.getListaClases().get(0).ensenarClase();
  }
}
