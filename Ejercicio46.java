/*Que permita leer el valor correspondiente a una distancia en millas y las visualice
expresadas en metros. Sabiendo que 1 milla marina equivale a 1852 metros.*/

import java.util.Scanner;

public class Ejercicio46 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la distancia en millas: ");
        double millas = leer.nextDouble();
        
        double metros = millas * 1852;

        System.out.println("La distancia en metros es: " + metros);
    }
}