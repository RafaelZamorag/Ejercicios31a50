/*Crear una función que devuelva la primera letra de una cadena de texto. */

import java.util.Scanner;

public class Ejercicio49 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = leer.nextLine();
        char primeraLetra = cadena.charAt(0);
        System.out.println("La primera letra de la cadena de texto es: " + primeraLetra);
    }
}