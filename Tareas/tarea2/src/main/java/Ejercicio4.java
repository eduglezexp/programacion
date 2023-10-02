import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita leer un valor cualquiera N y escriba si dicho número es par o impar.
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorN;

        System.out.println("Ingrese el valor N: ");
        valorN = scanner.nextInt();

        if (valorN % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}