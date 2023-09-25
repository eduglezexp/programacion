package ies.iespuerto;

import java.util.Scanner;

/**
 * Clase que realiza ejercicio numero 1 de las tareas
 */
public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        //Bloque 1: pide por pantalla y asigna valor


        //Bloque 2: Verifica si los valores son iguales

        int valorA;
        int valorB;

        do {
            System.out.println("Ingrese el numero A: ");
            valorA = lectura.nextInt();
            System.out.println("El valor de A es: "+valorA);

            System.out.println("Ingrese el numero B: ");
            valorB = lectura.nextInt();
            System.out.println("El valor de B es: "+valorB);

            if(valorA == valorB){
                System.out.println("El valor A y B son iguales");
            }

        } while(valorA == valorB);
        if(valorA > valorB){
                System.out.println("El valor mayor es A");
        } else{
                System.out.println("El valor mayor es B");
        }
        //Bloque 3: verifica si A > B

        //Bloque 4: muestra por pantalla el valor mayor
    }
}
