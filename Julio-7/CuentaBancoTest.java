public class CuentaBancoTest {
    public static void main(String[] args) {
        CuentaBanco1 cuenta1 = new CuentaBanco1();
        CuentaBanco1 cuenta2 = new CuentaBanco1();
        
        System.out.println("Número de cuenta de cuenta1: " + cuenta1.getNumeroCuenta());
        System.out.println("Número de cuenta de cuenta2: " + cuenta2.getNumeroCuenta());
        
        cuenta1.depositarCuentaCorriente(500.0);
        cuenta1.depositarCuentaAhorro(1000.0);
        cuenta2.depositarCuentaCorriente(1000.0);

        System.out.println("Saldo de cuenta corriente de cuenta1: " + cuenta1.getSaldoCuentaCorriente());
        System.out.println("Saldo de cuenta de ahorro de cuenta1: " + cuenta1.getSaldoCuentaAhorro());
        System.out.println("Saldo de cuenta corriente de cuenta2: " + cuenta2.getSaldoCuentaCorriente());
        System.out.println("Saldo de cuenta de ahorro de cuenta2: " + cuenta2.getSaldoCuentaAhorro());

        cuenta1.retirarCuentaCorriente(200.0);
        cuenta1.retirarCuentaAhorro(500.0);
        cuenta2.retirarCuentaCorriente(1500.0);

        System.out.println("Saldo de cuenta corriente de cuenta1 después del retiro: " + cuenta1.getSaldoCuentaCorriente());
        System.out.println("Saldo de cuenta de ahorro de cuenta1 después del retiro: " + cuenta1.getSaldoCuentaAhorro());
        System.out.println("Saldo de cuenta corriente de cuenta2 después del retiro: " + cuenta2.getSaldoCuentaCorriente());
        System.out.println("Saldo de cuenta de ahorro de cuenta2 después del retiro: " + cuenta2.getSaldoCuentaAhorro());

        System.out.println("Saldo total de la cuenta 1: " + (cuenta1.getSaldoCuentaCorriente() + cuenta1.getSaldoCuentaAhorro()));
        System.out.println("Saldo total de la cuenta 2: " + (cuenta2.getSaldoCuentaCorriente() + cuenta2.getSaldoCuentaAhorro()));
    }
}