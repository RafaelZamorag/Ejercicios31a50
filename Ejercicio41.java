/*El cabello de los seres humanos crece en promedio medio centímetros por mes. Si
una persona no cortará nunca su cabello desde su nacimiento determinar según la
edad ingresada cuántos metros mide la caballera?. */

import java.util.Scanner;

public class Ejercicio41 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su edad en años: ");
        int edad = leer.nextInt();
        double crecimientoTotal = edad * 12 * 0.5 / 100;
        System.out.println("El crecimiento total de su cabello es de " + crecimientoTotal + " metros.");
    }
}
