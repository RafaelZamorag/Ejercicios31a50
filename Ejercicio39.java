/*Una persona pasa el 34 por ciento de su vida durmiendo. Dado el año de
nacimiento, el año actual y el nombre de una persona, imprimir cuántos días ha
dormido. */


import java.util.Scanner;

public class Ejercicio39{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese su año de nacimiento: ");
        int añoDeNacimiento = leer.nextInt();
        System.out.print("Ingrese el año actual: ");
        int añoActual = leer.nextInt();
        int edad = añoActual - añoDeNacimiento;
        double tiempoDurmiendo = edad * 365 * 0.34;
        System.out.println(nombre + " ha pasado " + tiempoDurmiendo + " días durmiendo.");
    }
}