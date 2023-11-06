/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg5.reforç;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Ex5REforç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edat, any;
        System.out.println("Escriu quina es la teva edat");
        edat = sc.nextInt();
        System.out.println("Escriu l'any en que ens trobem");
        any = sc.nextInt();
        do {
            edat = edat - 1;
            any = any - 1;
            System.out.println("Edat " + edat + " anys -----> any: "+any);}
        while (edat!=0);{
            System.out.println("No havies nascut");}
        }
    }
    

