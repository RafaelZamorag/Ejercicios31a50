/* 45.Crear un función que reciba un número real y devuelva un número entero con el
valor: -1 si el número es negativo, 1 si el número es positivo o 0 si es cero.*/

import java.util.Scanner;

public class Ejercicio45 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número real: ");
        double numero = leer.nextDouble();

        int valorDeRetorno;
        if (numero < 0) {
            valorDeRetorno = -1;
        } else if (numero > 0) {
            valorDeRetorno = 1;
        } else {
            valorDeRetorno = 0;
        }
        System.out.println("El valor de retorno de la función es: " + valorDeRetorno);
    }
}