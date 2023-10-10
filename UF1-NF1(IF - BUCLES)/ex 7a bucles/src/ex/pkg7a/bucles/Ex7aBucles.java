/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg7a.bucles;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Ex7aBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pantalla = new Scanner (System.in);
        int num, suma=0;
        do {
            System.out.println("Introducen el numero");
            num = pantalla.nextInt();
        if(num!=-1){    
            suma = suma + num;}
            System.out.println(""+suma);}
        while (num!=-1);
            System.out.println("La suma es " + suma);
            
        }
    }

