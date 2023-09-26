/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg3;

import java.util.Scanner;
/**
 *
 * @author alto6500
 */
public class Exercici3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lado;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Introduce lado del cuadrado");
        lado = pantalla.nextInt();
        int area;
        area = lado * lado;
        System.out.println("El area del cuadrado es " + area);
        
    }
    
}
