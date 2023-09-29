/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.lee.caracteres.enteros;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class ProgramaLeeCaracteresEnteros {

    /**
     * @param args the command line arguments+
     * te va a pedir a que clase vas (A,B,C)
     * y te va a pedir una edad
     * a la clase A van los adultos 
     * y a la clase B o C van los menores de edad
     * el programa tiene que comprovar que estas en la clase correcta
     */
    public static void main(String[] args) {
        int edad;
        char clase;
        Scanner pantalla = new Scanner(System.in);
            System.out.println("Dime tu edad");
        edad = pantalla.nextInt();
            System.out.println("Dime tu clase");
        clase = pantalla.next().charAt(0);
        if (clase=='A' && edad>=18){
            System.out.println("Vas a la clase correcta");}
        else if ((clase=='B'||clase=='C') && edad<18){
            System.out.println("Vas a la clase correcta");}
        else {
            System.out.println("Vas a la clase incorrecta");
        }
    }
    
}
