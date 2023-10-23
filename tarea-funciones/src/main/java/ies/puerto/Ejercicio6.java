package ies.puerto;

/**
 * Crear una función que convierte de grados Fahrenheit a Celsius.
 */
public class Ejercicio6 {

    /**
     * Funcion que convierte los grados Fahrenheit a Celsius
     * @param fahrenheit grados
     * @return grados celsius
     */
    public double fahrenheitACelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}