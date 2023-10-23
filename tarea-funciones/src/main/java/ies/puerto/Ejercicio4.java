package ies.puerto;

/**
 * Crea una función que tome dos parámetros numéricos y calcule el máximo de los dos números.
 * Crear una nueva función con el mismo nombre, que tome tres parámetros,
 * y calcule el máximo de los tres números. Esta segunda función debe hacer uso de la primera.
 */
public class Ejercicio4 {

    /**
     * Funcion que calcula el numero mayor entre dos numeros
     * @param a un numero
     * @param b un numero
     * @return el numero mayor
     */
    public int calculoMaximoDosNumeros(int a, int b) {
        int resultado = a;
        if (a < b) {
            resultado = b;
        }
        return resultado;
    }

    /**
     * Funcion que calculan el numero mayor entre tres numeros
     * @param a un numero
     * @param b un numero
     * @param c un numero
     * @return el numero mayor
     */
    public int calculoMaximoTresNumeros(int a, int b, int c) {

        int maxDos = calculoMaximoDosNumeros(a, b);
        int maxTres = calculoMaximoDosNumeros(maxDos, c);

        return maxTres;
    }
}