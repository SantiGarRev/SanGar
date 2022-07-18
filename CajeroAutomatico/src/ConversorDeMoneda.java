import java.math.BigDecimal;
import java.util.Scanner;

public class ConversorDeMoneda {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("Por favor, introduzca un monto en pesos y el sistem le devolvera el equivalente en dolar");
        Scanner scanner = new Scanner(System.in);
        double pesos = scanner.nextDouble();

        double dolares = 0.079 * pesos ;
        double impPais = dolares * 0.30;
        double percepcionGanancias = impPais * 0.35;
        double costoTotal= dolares - impPais - percepcionGanancias;

        System.out.println(pesos + " pesos equivalen a " + costoTotal + "U$D. Sobre dicho monto rige el 30% de impuesto PAIS que es " + impPais
        + " y el 35% en concepto de percepción por Ganancias que es "+ percepcionGanancias )
        ;
        String dolaresString = Double.toString(dolares);
    }
}
