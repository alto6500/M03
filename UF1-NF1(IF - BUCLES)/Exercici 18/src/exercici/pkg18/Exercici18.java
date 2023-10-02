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
        int horas, salario, salarioextra, salarionormal, salariototal, tarifanormal, tarifaextra;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("¿Cuantas horas trabajas a la semana?");
        horas = pantalla.nextInt();
        if (horas <= 35){
        salario = horas * 20;
        System.out.println("Tu salario neto a la semana es " + salario);}
        else if (horas > 35){
        tarifanormal = 20;
        tarifaextra = (int) (20 * 1.5);
        salarioextra = (horas - 35)* tarifaextra ;
        salarionormal =(35 * tarifanormal);
        salariototal = salarionormal + salarioextra;
        System.out.println("Tu salario neto a la semana es " + salariototal);}
        
        
        
                
    }
    
}
