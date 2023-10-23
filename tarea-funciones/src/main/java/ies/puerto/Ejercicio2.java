package ies.puerto;

public class Ejercicio2 {

    /**
     * Función que realiza el cálculo del área en circulo.
     * @param radio del circulo
     * @return resultado de la opracion
     */
    public double areaCirculo(int radio) {
        double resultado;
        double pi = Math.PI;

        resultado = Math.pow(radio,2)*pi;

        return resultado;
    }
}