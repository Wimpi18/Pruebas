public class Operaciones {
    public static void main(String args[]) {
        int a = 2, b = 4;
        System.out.println("La suma de " + a + " y " + b + " es: " + sumar(a, b));
        System.out.println("La multiplicacion de " + a + " y " + b + " es: " + multiplicar(a, b));
        System.out.println("La resta de " + a + " y " + b + " es: " + restar(a, b));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a - b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }
}