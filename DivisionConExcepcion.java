package divisionconexcepcion;

import java.util.Scanner;

public class DivisionConExcepcion {

    public static void main(String[] args) {
        // Pedir al usuario los dos números
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el dividendo (entero): ");
            int dividendo = sc.nextInt();

            System.out.print("Ingrese el divisor (entero): ");
            int divisor = sc.nextInt();
            // Intentar realizar la división
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: división entre cero no permitida");
        } catch (Exception e) {
            System.out.println("Error: entrada no válida");
        }
    }
}
