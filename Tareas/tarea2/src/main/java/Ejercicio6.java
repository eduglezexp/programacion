import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no.
 */
public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        boolean primo = true;
        int i = 2;

        System.out.println("Introduce un numero entero positivo: ");
        numero = scanner.nextInt();

        if (numero < 2) {
            primo = false;
        }

        while (i < numero) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
            i++;
        }

        if (primo)
            System.out.println("El numero es primo");
        else {
            System.out.println("El numero no es primo");
        }
    }
}