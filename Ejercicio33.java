/*33.Una empresa almacena los datos de N empleados, para esto, en un proceso
repetitivo se ingresa el sexo y el salario de cada empleado. Se pide calcular:
a) La cantidad de personas que ganan más de 700 al mes.
b) El promedio de salarios.
c) El porcentaje de mujeres que trabajan en esa empresa
d) El porcentaje de varones que trabajan en esa empresa */

import java.util.Scanner;

public class Ejercicio33{
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        /*Declaramos las variables */
        int cantidadDeEmpleados;
        int cantidadDeMujeres;
        int cantidadDeHombres;
        int salarioDeMujeres;
        int salarioDeHombres;
        int salarioTotal;
        int salarioPromedio;
        /*Ingresamos la cantidad de empleados */
        System.out.println("Ingrese la cantidad de empleados: ");
        cantidadDeEmpleados= leer.nextInt();
        /*Inicializamos las variables */
        cantidadDeMujeres = 0;
        cantidadDeHombres = 0;
        salarioDeMujeres = 0;
        salarioDeHombres = 0;
        salarioTotal = 0;
        for (int i =1 ;i<= cantidadDeEmpleados; ++i ){
            /*Ingresamos sexo del empleado */
            System.out.println("Ingrese el sexo del empleado: ");
            char sexo = leer.next().charAt(0);
            /*Ingresamos el salario del empleado */
            System.out.println("Salario del empleado: ");
            int salario = leer.nextInt();
            /*Sumamos el salario total */
            salarioTotal += salario;
             if (sexo == 'M') {
                cantidadDeMujeres++;
                salarioDeMujeres += salario;
                
             } else {
                cantidadDeHombres ++;
                salarioDeHombres += salario;
                
             }
             /*Calculamos el promedio de salarios */
             salarioPromedio = salarioTotal / cantidadDeEmpleados;
             /*Calculamos el porcentaje de mujeres */
             double porcentajeDeMujeres = (cantidadDeMujeres * 100) / cantidadDeEmpleados;
             /*Calculamos el porcentaje de hombres */
             double porcentajeDeHombres = (cantidadDeHombres *  100) / cantidadDeEmpleados;
            }

    }    

}