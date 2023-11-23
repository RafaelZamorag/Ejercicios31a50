/*Hacer lo mismo que el ejercicio anterior pero ahora suponer que después de una
hora de estacionamiento si los minutos no excedan los 10, no se le cobra la hora;
es decir, si el cliente ocupa el estacionamiento una hora 8 minutos, se le cobra sólo
una hora, otro ejemplo sería si el cliente ocupa el estacionamiento 2 horas 15
minutos, se le cobra 3 horas de estacionamiento*/


import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el tiempo de estacionamiento en horas: ");
        int horas = leer.nextInt();

        System.out.print("Ingrese el tiempo de estacionamiento en minutos: ");
        int minutos = leer.nextInt();

        int tiempo = horas * 60 + minutos;

        double tarifa;

        if (tiempo <= 60) {
            tarifa = 15.00;
        } else if (tiempo <= 70) {
            tarifa = 15.00;
        } else if (tiempo <= 130) {
            tarifa = 12.00;
        } else if (tiempo <= 140) {
            tarifa = 12.00;
        } else if (tiempo <= 190) {
            tarifa = 9.00;
        } else if (tiempo <= 200) {
            tarifa = 9.00;
        } else {
            tarifa = 6.00;
        }

        System.out.println("El cliente debe pagar: " + tarifa);
    }
}