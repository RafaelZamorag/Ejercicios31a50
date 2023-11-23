/*A un profesor le pagan según sus horas y una tarifa de pago por horas. Si la
cantidad de horas trabajadas es mayor a 40 horas, la tarifa se incrementa en un
50 % para las horas extras. Calcular el salario del profesor dadas las horas
trabajadas y la tarifa.*/

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de horas trabajadas: ");
        int horas = leer.nextInt();
        System.out.println("Ingrese la tarifa por hora: ");
        double tarifa = leer.nextDouble();
        double salario;
        if (horas>40) {
            salario = (horas - 40) * (tarifa * 1.5) + 40 * tarifa;

        } else {
            salario = horas * tarifa;   
        }
        System.out.println("El salario del profesor es:" + salario);
    }
    
}
