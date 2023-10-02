/**
 * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 * Haz el mismo ejercicio anterior con un bucle for.
 */
public class Ejercicio9 {
    public static void main(String[] args) {

        int i = 1;

        while (i < 101) {
            System.out.println(i);
            i++;
        }

        for (int u = 1; u < 101; u++) {
            System.out.println(u);
        }
    }
}