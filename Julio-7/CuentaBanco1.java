import java.util.Random;

public class CuentaBanco1 {

  private String numeroCuenta; //ok
  private double saldoCuentaCorriente; //ok
  private double saldoCuentaAhorro; //ok
  private static int numeroCuentas = 0; //ok
  private static double saldoTotal = 0; //ok

  public CuentaBanco1() {
    this.numeroCuenta = generarNumeroCuenta();
    numeroCuentas++;
  }

  private String generarNumeroCuenta() {
    StringBuilder numeroCuenta = new StringBuilder();
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      int digito = random.nextInt(10);
      numeroCuenta.append(digito);
    }

    String cuenta = "";
    for (int i = 0; i < 10; i++) {
      //int digito = random.nextInt(10);
      int aleatorio = (int) Math.round((Math.random() * 10)); //numero aleatorio con rango
      // numeroCuenta.append(digito);
      cuenta.concat(Integer.toString(aleatorio));
    }
    return numeroCuenta.toString();
  }

  public double getSaldoCuentaCorriente() {
    return saldoCuentaCorriente;
  }

  public double getSaldoCuentaAhorro() {
    return saldoCuentaAhorro;
  }

  public void depositarCuentaCorriente(double monto) {
    saldoCuentaCorriente += monto;
    saldoTotal += monto;
  }

  public void depositarCuentaAhorro(double monto) {
    saldoCuentaAhorro += monto;
    saldoTotal += monto;
  }

  public void retirarCuentaCorriente(double monto) {
    if (monto <= saldoCuentaCorriente) {
      saldoCuentaCorriente -= monto;
      saldoTotal -= monto;
    } else {
      System.out.println("Fondos insuficientes en la cuenta corriente.");
    }
  }

  public void retirarCuentaAhorro(double monto) {
    if (monto <= saldoCuentaAhorro) {
      saldoCuentaAhorro -= monto;
      saldoTotal -= monto;
    } else {
      System.out.println("Fondos insuficientes en la cuenta de ahorro.");
    }
  }

  public static int getNumeroCuentas() {
    return numeroCuentas;
  }

  public static double getSaldoTotal() {
    return saldoTotal;
  }

  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }
}
