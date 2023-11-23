/* Construir un programa que permita calcular el área de un triángulo. El usuario
ingresará la base y la altura en milímetros y el sistema mostrará los resultados en
milímetros, centímetros y metros cuadrados respectivamente.*/

import java.util.Scanner;

public class Ejercicio31{
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese la Base: ");
        double base=leer.nextDouble();
        System.out.println("Ingrese la Altura: ");
        double altura=leer.nextDouble();
        /*calcular el area por el triangulo */
        double area=1/2 * base * altura;//area del Triangulo
        /*Imprimir el area del triangulo en milimetros */
        System.out.println("El area del el triangulo es: " + area + "milimetros cuadrados. ");
        System.out.println("El area del el triangulo es: " + area / 100 + "Centimetros cuadrados. ");
        System.out.println("El area del el triangulo es: " + area / 1000000 + "Mtros cuadrados. ");
    }    
        
}