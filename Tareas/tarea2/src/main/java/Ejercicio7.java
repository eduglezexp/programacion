import java.util.Scanner;

/**
 * Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil,
 * expresada en kilómetros por hora, proporcione la velocidad en metros por segundo.
 */
public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double velocidad;

        System.out.println("Introduce la velocidad en km/h: ");
        velocidad = scanner.nextInt();

        double resultado = (velocidad * 1000) / 3600;

        System.out.println("La velocidad en metros por segundo es: " + resultado + " m/s");

    }
}