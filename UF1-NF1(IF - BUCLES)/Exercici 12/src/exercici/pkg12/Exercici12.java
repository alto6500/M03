/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg12;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Exercici12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Dime un numero");
        num1 = pantalla.nextInt();
        if (num1>-1)
        System.out.println("Tu numero es positivo");
        else
        System.out.println("Tu numero es negativo");
    }
    
}
