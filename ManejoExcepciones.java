import java.util.Scanner;

// Excepción personalizada para números negativos
class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class ManejoExcepciones {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero: ");
            String entrada = sc.nextLine();      // leer como texto

            // Puede lanzar NumberFormatException
            int numero = Integer.parseInt(entrada);

            // Verificar si es negativo → lanzar excepción personalizada
            if (numero < 0) {
                throw new NumeroNegativoException("Error: el numero no puede ser negativo.");
            }

            System.out.println("Numero ingresado correctamente: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar un numero entero válido.");
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        }
    }
}


