package ies.puerto;

/**
 * Crea una función que tome como parámetro un número e indique si es primo o no.
 */
public class Ejercicio5 {

    /**
     * Funcion que determina si un numero es primo
     * @param numero primo o no.
     * @return si el numero es primo o no
     */
    public boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= numero/2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}