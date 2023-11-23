/*Que escriba el porcentaje descontado en una compra, introduciendo la cantidad
comprada, el precio (valor) de la compra y el precio (valor) pagado. */

import java.util.Scanner;

public class Ejercicio47 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad comprada: ");
        double cantidadComprada = leer.nextDouble();

        System.out.print("Ingrese el precio de la compra: ");
        double precioCompra = leer.nextDouble();

        System.out.print("Ingrese el precio pagado por la compra: ");
        double precioPagado = leer.nextDouble();

        double descuento = (precioCompra - precioPagado) / precioCompra * 100;
        System.out.println("El descuento es: " + descuento + "%");
    }
}