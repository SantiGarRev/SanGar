import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico public class CajeroAutomatico {
    CuentaBancaria cuentaBancariaActual;

    CajeroAutomatico(String identificador; String contraseña){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,1000000);
        cuentaBancariaActual = new CuentaBancaria() {"nombre cualquiera",cantidadAleatoria);
        }
        protected void mostrarSaldo()  {
            System.out.println("Su saldo es " + this.cuentaBancariaActual.obtenerSaldo());

            protected void ingresarDinero() {
                System.out.println("¿Cuánto dinero quiere ingresar?");
                Scanner scanner = new Scanner(System.in);
                double cantidad = scanner.nextDouble();
                this.cuentaBancariaActual.ingresarDinero(cantidad);
            }

            protected void sacarDinero() {
                System.out.println("¿Cuánto dinero quiere sacar?");
                Scanner scanner = new Scanner(System.in);
                double cantidad = scanner.nextDouble();
                this.cuentaBancariaActual.sacarDinero(cantidad);
            }

            protected void consultarUltimosMovimientos() {
             /*   GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
                System.out.println("¿Cuántos movimientos quiere consultar?");
                Scanner scanner = new Scanner(System.in);
                int numeroDeMovimientos = scanner.nextInt();
                ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "euros");
                this.mostrarMovimientos(movimientos);
            }

            private void mostrarMovimientos(ArrayList<String> movimientos) {
                Iterator var2 = movimientos.iterator();

                while(var2.hasNext()) {
                    String movimiento = (String)var2.next();
                    System.out.println(movimiento);
                }

            }

            protected void mostrarCondicionesLegales() {
                this.cuentaBancariaActual.informarSobreCondicionesLegales();
            }
*/
                protected void salir() {
                    System.out.println("Muchas gracias por utilizar nuestros servicios");
                }   }
        }

    }{
}
