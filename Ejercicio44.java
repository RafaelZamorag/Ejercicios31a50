/*44.Realiza un programa que calcule las potencias de la 2 a la 10 del número PI y la
raíz cuadrada de dicha potencia. Para ello construye una función que calcule la
potencia n-ésima de un número cualquiera y utiliza después la función sqrt de la
librería matemática de C. */

import java.util.Scanner;

public class Ejercicio44 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Obtener el número del usuario
        System.out.print("Ingrese un número: ");
        double numero = leer.nextDouble();

        // Calcular la potencia n-ésima del número
        double potencia = Math.pow(numero, 10);

        // Calcular la raíz cuadrada de la potencia
        double raizCuadrada = Math.sqrt(potencia);

        // Imprimir los resultados
        System.out.println("La potencia n-ésima del número es: " + potencia);
        System.out.println("La raíz cuadrada de la potencia es: " + raizCuadrada);
    }
}