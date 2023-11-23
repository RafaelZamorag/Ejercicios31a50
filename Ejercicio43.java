/*43.Crear una función que calcule cual es el número menor de dos números enteros */
import java.util.Scanner;

public class Ejercicio43 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = leer.nextInt();
        int menor = Math.min(numero1, numero2);
        System.out.println("El menor de los dos números es: " + menor);
    }
}