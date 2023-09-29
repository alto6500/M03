/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg13;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        num1 = pantalla.nextInt();
        System.out.println("Dime el segundo numero");
        num2 = pantalla.nextInt();
        if (num1 > num2){
        System.out.println("Numero " + num2);
        System.out.println("Numero " + num1);}
        else {
        System.out.println("Numero " + num1);
        System.out.println("Numero " + num2);}
    }
    
}
