/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg15;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        num1 = pantalla.nextInt();
        System.out.println("Dime el segundo numero");
        num2 = pantalla.nextInt();
        System.out.println("Dime el tercer numero");
        num3 = pantalla.nextInt();
        if (num1>=num2 && num1>=num3){
        System.out.println("El numero mayor es el " +num1); }
        else if (num2>=num3 && num2>=num1){
        System.out.println("El numero mayor es el " +num2);}
        else {
        System.out.println("El numero mayor es el " +num3);}
        }
    }
    

