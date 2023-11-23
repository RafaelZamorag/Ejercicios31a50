/*Construir un programa que permita calcular el área de un rectángulo, los datos se
ingresan en metros y se espera ver los resultados en metros, centímetros y
milímetros cuadrados. */

import java.util.Scanner;

public class Ejercicio32{
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la base del triangulo: ");
        double base=leer.nextDouble();
        System.out.println("Ingrese la altura del triangulo: ");
        double altura=leer.nextDouble();
        /*Area del rectangulo */
        double area=(base*altura)/2 ;
        System.out.println("El area del triangulo es: " + base / 1000000 + "Metros.");
        System.out.println("La altura del triangulo es: " + base / 100 + "Centimetros.");
        System.out.println("El lado del triangulo es: "+ area / 5 + "Milimetros.");


    }
}