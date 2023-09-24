package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

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
    }
}
