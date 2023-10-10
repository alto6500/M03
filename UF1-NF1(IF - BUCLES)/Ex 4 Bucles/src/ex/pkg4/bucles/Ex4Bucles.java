/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg4.bucles;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Ex4Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1;
        int num;
        Scanner pantalla = new Scanner (System.in);
        System.out.println("Dime un numero");
        num = pantalla.nextInt();
        while (cont<=num){
            System.out.println("Numero " + cont);
            cont = ++cont;
        }
        
    }
    
}
