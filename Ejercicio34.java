/*Dado el monto de una compra calcular el descuento considerado -descuento es
10% si el monto es mayor a 1000 pesos -descuento es 20% si el monto es mayor a
500 pesos y menor o igual a 1000 pesos -no hay descuento si el monto es mayor o
igual a 500 pesos.*/

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el monto de la compra: ");
        double monto=leer.nextDouble();
        double descuento = 0;
        if (monto >=1000) {
            descuento = monto * 0.1;
            
        } else if(monto >= 500) {
            descuento = monto * 0.2;
            
        }
        System.out.println("El descuento es: " + descuento);
    }   
        
    
}
