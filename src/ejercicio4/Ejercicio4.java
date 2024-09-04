/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author SERGIO CUERVO 20241222272
 */
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

//Un obrero necesita calcular su salario semanal
//si trabaja 40 horas o menos se le pagan $5000 por hora 
//si trabaja mas de 40 horas se le paga $5000 por cada una de las primeras 40 horas y aumenta el 20% por cada hora extra
        int Horas;
        int Salario;
        double Salariototal;
        Scanner trabajador = new Scanner(System.in);
        System.out.println("Cuantas horas trabaja a la semana?: ");
        Horas = trabajador.nextInt();

        if (Horas <= 40) {
            Salario = (5000*Horas); 
            System.out.println("Su salario en la semana es de :" + Salario);
        } else if (Horas > 40) {
            Salario = (5000*Horas );
            Salariototal = (Salario + (Salario * 0.20));
            System.out.println("Su salario con horas extra incluidas es de: " + Salariototal);
        }
    }
}
