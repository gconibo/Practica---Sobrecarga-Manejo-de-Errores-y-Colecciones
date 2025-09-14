package calculadora;

// Clase principal
public class Calculadora {

    // Metodo sumar que recibe dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Metodo sumar que recibe tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Metodo sumar que recibe dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Metodo main para probar los metodos sobrecargados
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Llamada al metodo que suma dos enteros
        int resultado1 = calc.sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado1);

        // Llamada al método que suma tres enteros
        int resultado2 = calc.sumar(3, 4, 8);
        System.out.println("La suma de 3, 4 y 8 es: " + resultado2);

        // Llamada al método que suma dos números decimales
        double resultado3 = calc.sumar(4.5, 2.3);
        System.out.println("La suma de 4.5 y 2.3 es: " + resultado3);
    }
}

