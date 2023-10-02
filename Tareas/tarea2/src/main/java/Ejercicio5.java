import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita leer dos números y ordenarlos de menor a mayor, si es el caso.
 */
public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroA;
        int numeroB;

        System.out.println("Ingrese el numero A: ");
        numeroA = scanner.nextInt();
        System.out.println("El valor de A es: "+numeroA);

        System.out.println("Ingrese el numero B: ");
        numeroB = scanner.nextInt();
        System.out.println("El valor de A es: "+numeroB);

        if (numeroA == numeroB) {
            System.out.println("Son iguales");
        } else if (numeroA > numeroB) {
            System.out.println("El número A es mayor");
            System.out.println("El número B es menor");
        } else {
            System.out.println("El número B es mayor");
            System.out.println("El número A es menor");
        }
    }
}