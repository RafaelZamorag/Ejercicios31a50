/*Facilite el ingreso de tres números enteros y/o reales, muestre su respectiva suma
y multiplicación */

import java.util.Scanner;

public class Ejercicio50 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = leer.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = leer.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double numero3 = leer.nextDouble();

        double suma = numero1 + numero2 + numero3;
        double multiplicacion = numero1 * numero2 * numero3;

        System.out.println("La suma de los tres números es: " + suma);
        System.out.println("La multiplicación de los tres números es: " + multiplicacion);
    }
}