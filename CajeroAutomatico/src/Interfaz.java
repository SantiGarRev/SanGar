import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {

        System.out.println("Por favor introduzca su número de CUIT");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();
        System.out.println("Por favor introduzca su contraseña");
        String contraseña = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(identificador, contraseña); //creo que acá está el error ya que no conecta con clase Interfaz

        int opcionSeleccionada;
        do {
            System.out.println("Elija alguna de las siguientes opciones:  ");
            System.out.println(" Escriba 1 para consultar su saldo");
            System.out.println(" Escriba 2 para Ingresar Dinero");
            System.out.println(" Escriba 3 para Sacar Dinero");
            System.out.println(" Escriba 4 para consultar últimos movimientos");
            System.out.println(" Para salir presione cualquier otro número");

            Scanner scanner = new Scanner(System.in);
            opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada) {
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                default:
                    System.out.println(" Muchas gracias por usar nuestros servicios");
                    break;
            }


        } while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);
    }
}