/*Una naranja tiene la capacidad de producir 0.05 voltios. Si un sistema de
iluminación requiere de x kilovoltios para su funcionamiento. Cuántas naranjas
realizan el trabajo deseado. Adicionalmente, si cada naranja pesa en promedio 6
gramos. ¿Cuántas toneladas son necesarias?*/

import java.util.Scanner;

public class Ejercicio42 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el voltaje requerido por el sistema de iluminación en kilovoltios: ");
        double voltajeRequerido = leer.nextDouble();
        double naranjasNecesarias = voltajeRequerido * 1000 / 0.05;
        double pesoTotal = naranjasNecesarias * 6 / 1000;
        System.out.println("Se necesitan " + naranjasNecesarias + " naranjas para producir " + voltajeRequerido + " kilovoltios.");
        System.out.println("El peso total de las naranjas es de " + pesoTotal + " toneladas.");
    }
}