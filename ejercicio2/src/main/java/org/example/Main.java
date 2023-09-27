package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valueA;
        int valueB;
        int valueC;

        System.out.println("Introduce a value A: ");
        valueA = scanner.nextInt();

        System.out.println("Introduce a value B: ");
        valueB = scanner.nextInt();

        System.out.println("Introduce a value C: ");
        valueC = scanner.nextInt();

        if (valueA == valueB || valueA == valueC || valueB == valueC) {
            System.out.println("is the same value");
        } else {

            int mayor = valueA;
            int menor = valueA;

            if (valueB > mayor) {
                mayor = valueB;
            } else if (valueB < menor) {
                menor = valueB;
            }

            if (valueC > mayor) {
                mayor = valueC;
            } else if (valueC < menor) {
                menor = valueC;
            }

            System.out.println("el mayor es:"+mayor);
            System.out.println("el menor es:"+menor);
        }
    }
}
