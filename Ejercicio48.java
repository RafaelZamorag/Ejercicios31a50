/*Facilite el ingreso de dos números enteros y/o reales, muestre su suma, resta,
multiplicación, división y el resto (módulo) de la división. */

import java.util.Scanner;

public class Ejercicio48 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = leer.nextDouble();
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double resto = numero1 % numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El resto de la división es: " + resto);
    }
}