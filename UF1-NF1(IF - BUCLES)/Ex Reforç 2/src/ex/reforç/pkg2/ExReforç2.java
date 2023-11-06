/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.reforç.pkg2;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class ExReforç2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_usuari, intentos = 0, suma_intentos = 0;
        do{
            System.out.println("Pon un numero, el 0 para finalizar");
            num_usuari = sc.nextInt();
            intentos++;
            suma_intentos=num_usuari + suma_intentos;
            if (num_usuari>0){
                System.out.println("Numero positivo");}
            else if (num_usuari<0){
                System.out.println("Numero negativo");} }
        while (num_usuari !=0);{      
                System.out.println("Programa finalizado");} 
                System.out.println("Se han realizado " +intentos + " intentos");
                System.out.println("Suma total de los intentos = " + suma_intentos);
}      
    }
    
