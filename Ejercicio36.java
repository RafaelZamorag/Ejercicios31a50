/*En un estacionamiento cobran $15.00 por hora o fracción. Diseñe un algoritmo que
determine cuánto debe pagar un cliente por el estacionamiento de su vehículo,
conociendo el tiempo de estacionamiento en horas y minutos. */

import java.util.Scanner;

public class Ejercicio36 {
public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese el tiempo de estacionamiento en horas: ");
    int horas = leer.nextInt();
    System.out.println("Ingrese el tiempo de estacionamiento en minutos: ");
    int minutos = leer.nextInt();
    int tiempo = horas * 60 + minutos;
    double tarifa;
    if (tiempo<=60) {
        tarifa = 15.00;
    } else if(tiempo <= 120 ) {
        tarifa = 12.00;
    }else if(tiempo <= 180) {
        tarifa = 9.00;
    }else {
        tarifa = 6.00;        
    }
    System.out.println("El cliente debe pagar: " + tarifa);

}
    
}
