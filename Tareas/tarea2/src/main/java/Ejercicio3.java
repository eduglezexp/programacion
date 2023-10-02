/**
 * Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10,
 * es decir, 1 + 2 + 3 + …. + 10. Utilia un buble __for__ y un bucle __while__.
 */
public class Ejercicio3 {
    public static void main(String[] args) {

        int suma = 0;
        for (int i = 0; i <= 10; i++) {
            suma += i;
        }
        System.out.println("Suma en bucle for:" +suma);

        int i = 0;
        int suma2 = 0;
        while (i <= 10) {
            suma2 += i;
            i++;
        }
        System.out.println("Suma en bucle while:" +suma2);
    }

}