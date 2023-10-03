/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg18;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Exercici18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, salario, salarioextra, salarionormal, tarifanormal, tarifaextra;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("¿Cuantas horas trabajas a la semana?");
        horas = pantalla.nextInt();
        if (horas <= 35){
            salario = horas * 20;
            System.out.println("Tu salario es " + salario+"€" );}
        else if (horas > 35){
            tarifanormal = 20;
            tarifaextra = (int) (20 * 1.5);
            salarioextra = (horas - 35)* tarifaextra ;
            salarionormal =(35 * tarifanormal);
            salario = salarionormal + salarioextra;
         
        if (salario>500){
            double salario2, salario3, salario4, salariolimpio;
            salario2 = salario - 500;
            salario3 = (salario2 * 25)/100;
            salario4 = salario2 - salario3;
            salariolimpio = salario4 + 500;
            System.out.println("Tu salario bruto a la semana es " + salario+"€");
            System.out.println("Los impuestos son de " + salario3+"€");
            System.out.println("Tu salario neto a la semana es " + salariolimpio+"€");}
        else
            System.out.println("Tu salario neto a la semana es " + salario+"€");
        }
    }
}
    


