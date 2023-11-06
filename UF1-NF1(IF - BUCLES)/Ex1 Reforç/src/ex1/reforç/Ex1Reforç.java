/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1.reforç;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Ex1Reforç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_usuari;
        do{
            System.out.println("Pon un numero, el 0 para finalizar");
            num_usuari = sc.nextInt();
            if (num_usuari>0){
                System.out.println("Numero positivo");}
            else if (num_usuari<0){
                System.out.println("Numero negativo");} }
        while (num_usuari !=0);{      
                System.out.println("Programa finalizado");}      
}      
    }


