/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg16;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Exercici16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        Scanner pantalla = new Scanner(System.in);
            System.out.println("Dime tu nota");
        num1 = pantalla.nextDouble();
        if (num1<0 || num1>10)
            System.out.println("Nota NO valida");
        else{
        if (num1>=0 && num1<3){
            System.out.println("Nota muy deficiente "+num1);}
        else if (num1>=3 && num1<5){
            System.out.println("Nota insuficiente "+num1);}
        else if (num1>=5 && num1<6){
            System.out.println("Nota bien "+num1);}
        else if (num1>=6 && num1<9){
            System.out.println("Nota notable "+num1);}
        else if (num1>=9 && num1<=10){
            System.out.println("Nota excelente "+num1);}
        }
        }
    }
    

