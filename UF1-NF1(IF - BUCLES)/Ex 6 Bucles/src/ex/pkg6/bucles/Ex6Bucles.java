/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg6.bucles;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Ex6Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont_positiu = 0, cont_negatiu = 0, cont;
        Scanner pantalla = new Scanner (System.in);
        for (cont = 0; cont < 10; cont++) {
        System.out.println("Introduce un numero");
        num = pantalla.nextInt();
        if (num>=0){
        cont_positiu++;}
        else {
        cont_negatiu++;}    
    
        System.out.println("Hay " + cont_negatiu + " numeros negativos");
    }
    
}
}
