/**
 * @author eduglezexp
 * Ejercicio numero 3
 */
import java.util.Scanner;
public class Ejercicio2 {

    /**
     * Descripcion del algoritmo
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valueN = 0;
        int suma = 0;

        while (valueN < 10) {
            valueN = valueN + 1;
            suma = suma + valueN;
        }
        System.out.println("the sum is: " + suma);
    }
}



