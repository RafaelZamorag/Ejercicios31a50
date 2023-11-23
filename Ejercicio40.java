/*Construir una calculadora minera, la cual permita saber a cuántos pesos equivalen
los kilos de oro ingresados. El usuario deberá ingresar tanto los kilos a convertir
como el precio en pesos por onza de oro. Recordemos que una onza equivale a
28.3495 gramos y que 1000 gramos son un kilo. */

import java.util.Scanner;

public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese los kilos de oro: ");
        double kilosDeOro = leer.nextDouble();
        System.out.print("Ingrese el precio del oro en pesos por onza: ");
        double precioDelOro = leer.nextDouble();
        double precioDelOroPorKilo = precioDelOro * 28.3495 / 1000;

        double precioTotal = precioDelOroPorKilo * kilosDeOro;

        System.out.println("El precio total del oro es: " + precioTotal + " pesos");
    }
}
