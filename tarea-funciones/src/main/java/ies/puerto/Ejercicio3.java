package ies.puerto;

public class Ejercicio3 {

    /**
     * Funcion que realiza el area de un cuadrado
     * @param a lado del cuadrado
     * @return resultado de la operacion realizada
     */
    public int areaCuadrado(int a) {
        return areaRectangulo(a, a);
    }

    /**
     * Funcion que realiza el area de un rectangulo
     * @param a largo del rectangulo
     * @param b ancho del rectangulo
     * @return resultado de la operacion realizada
     */
    public int areaRectangulo(int a, int b) {
        int resultado = 0;
        resultado = a*b;
        return resultado;
    }
}