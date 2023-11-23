/*Una persona por cada año de vida debe consumir 8 kilogramos de fruta. Dada la
edad de una persona, imprimir cuántos gramos de fruta ha consumido y
adicionalmente si una manzana pesa en promedio 4 gramos, determinar cuántas
manzanas ha consumido.*/

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su edad: ");
        int edad=leer.nextInt();
        int consumoDeFruta = edad * 8 * 1000;
        int numeroDeManzanas = consumoDeFruta / 4;
        System.out.println("Usted a consumido " + consumoDeFruta + " Gramos de fruta.");
        System.out.println("Usted a consumido " + numeroDeManzanas + " Manzanas.");

    }
    
}
