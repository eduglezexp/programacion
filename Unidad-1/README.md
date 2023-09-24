<div align="justify">

# Ejercicios

- [Ejercicio 1](#ejercicio1)
- [Ejercicio 2](#ejercicio2)

## Ejercicio 1 <a name="ejercicio1"></a>

Desarrolle un algoritmo que permita leer dos valores distintos, determinar cual de los dos valores es el mayor y escribirlo.

### Diagrama de Flujo

<img src="images/Diagrama-flujo.drawio.png" />

### Pseudocódigo

Pasos:

 - Inicio
 - Inicializar variables: __A = 0, B = 0__
 - Solicitar la introducción de dos valores distintos
 - Leer los dos valores
 - Asignarlos a las variables __A y B__
 - Si __A = B__ Entonces vuelve a 3 porque los valores deben ser distintos
 - Si __A > B__ Entonces Escribir __A, “Es el mayor”__
 - De lo contrario: Escribir __B, “Es el mayor”__
 - Fin_Si
 - Fin

## Ejercicio 2 <a name="ejercicio2"></a>

Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C
respectivamente. El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que
los tres valores introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de
que se detecte la introducción de valores iguales.

### Diagrama de Flujo

<img src="images/diagrama-flujo-ej2.drawio.png" />

### Pseudocódigo

Pasos:

 - Inicio
 - Inicializar las variables __A, B y C__
 - Leer los tres valores
 - Almacenar en las variables __A, B y C__
 - Si __A > B y A > C__ Entonces
 - Escribir __A “Es el mayor”__
 - Sino
 - Si __B > A y B > C__ Entonces
 - Escribir __B “Es el mayor”__
 - Sino
 - Escribir __C “Es el mayor”__
 - Fin_Si
 - Fin

## Ejercicio 3 <a name="ejercicio3"></a>

Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10,
es decir, 1 + 2 + 3 + …. + 10.

### Diagrama de Flujo

<img src="images/diagrama-flujo-ej3.drawio.png" />

### Pseudocódigo

Pasos:

 - Inicio
 - Declaración de variables:
   __N= 0, Suma = 0__
 - Asignación Contador :
   __N = N + 1__
 - Asignación Acumulador:
   __Suma = Suma + N__
 - Si __N = 10__ Entonces
 - Escribir Suma
 - De lo contrario, Repetir desde el paso 3
 - Fin_Si
 - Fin

</div>