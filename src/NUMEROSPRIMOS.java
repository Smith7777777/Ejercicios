
import java.util.Scanner;
public class NUMEROSPRIMOS {

    // Función para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para mostrar los números primos menores o iguales a n y calcular su suma
    public static int mostrarPrimosYSuma(int n) {
        int suma = 0;
        System.out.println("Números primos menores o iguales a " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " "); // Mostrar el número primo
                suma += i; // Sumar el número primo
            }
        }
        System.out.println(); // Salto de línea después de mostrar los primos
        return suma;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        // Verificar que n sea un número positivo
        if (n <= 0) {
            System.out.println("El número debe ser un entero positivo.");
        } else {
            // Mostrar los números primos y calcular su suma
            int suma = mostrarPrimosYSuma(n);

            // Imprimir el resultado de la suma
            System.out.println("La suma de todos los números primos menores o iguales a " + n + " es: " + suma);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
