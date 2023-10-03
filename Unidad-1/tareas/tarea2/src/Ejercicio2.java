package ies.iespuerto;
/**
 * @author eduglezexp
 * Ejercicio numero 2
 */
import java.util.Scanner;

/**
 Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.
 El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que los tres valores
 introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de que se detecte
 la introducción de valores iguales.
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valueA;
        int valueB;
        int valueC;

        System.out.println("Introduce a value A: ");
        valueA = scanner.nextInt();

        System.out.println("Introduce a value B: ");
        valueB = scanner.nextInt();

        System.out.println("Introduce a value C: ");
        valueC = scanner.nextInt();

        if (valueA == valueB || valueA == valueC || valueB == valueC) {
            System.out.println("is the same value");
        } else {

            int mayor = valueA;
            int menor = valueA;

            if (valueB > mayor) {
                mayor = valueB;
            } else if (valueB < menor) {
                menor = valueB;
            }

            if (valueC > mayor) {
                mayor = valueC;
            } else if (valueC < menor) {
                menor = valueC;
            }

            System.out.println("el mayor es:"+mayor);
            System.out.println("el menor es:"+menor);
        }
    }
}