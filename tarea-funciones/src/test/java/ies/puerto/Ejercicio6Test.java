package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6;

    @BeforeEach
    public void before() {
        ejercicio6 = new Ejercicio6();
    }

    @Test
    public void fahrenheitACelsiusTest() {
        int fahrenheit = 100;
        double resultadoOk = 37.77777777777778;
        double resultado = ejercicio6.fahrenheitACelsius(fahrenheit);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}