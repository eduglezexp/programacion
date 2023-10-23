package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4;

    @BeforeEach
    public void before() {
        ejercicio4 = new Ejercicio4();
    }

    @Test
    public void calculoNumeroMaxDosNumerosTest() {
        int a = 3;
        int b = 4;
        double resultadoOk = 4;
        double resultado = ejercicio4.calculoMaximoDosNumeros(a, b);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void calculoMaximoTresNumerosTest() {
        int a = 3;
        int b = 4;
        int c = 5;
        double resultadoOk = 5;
        double resultado = ejercicio4.calculoMaximoTresNumeros(a, b, c);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}