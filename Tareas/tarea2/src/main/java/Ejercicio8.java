import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita calcular Promedio de Notas; finaliza cuando N = 0.
 */
public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int suma = 0;    // Suma de las notas
        int cantidad = 0;  // Cantidad de notas ingresadas
        int nota;

        while (true) {
            System.out.print("Ingrese una nota (0 para terminar): ");
            nota = scanner.nextInt();

            if (nota == 0) {
                break;
            }

            suma += nota;
            cantidad++;
        }

        if (cantidad == 0) {
            System.out.println("No se ingresaron notas.");
        } else {
            double promedio = (double) suma / cantidad;
            System.out.println("El promedio de notas es: " + promedio);
        }
    }
}