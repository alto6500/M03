/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.menu.fifa;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class ExMenuFifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char caracter;
        Scanner pantalla = new Scanner(System.in);
        do {
        System.out.println("**** Bienvenido a Fifa *****");
        System.out.println("**** A --> Jugar ****");
        System.out.println("**** B --> Entrenar ****");
        System.out.println("**** C --> Jugar partido online ****");
        System.out.println("**** D --> Salir ****");
        System.out.println("**** Escoge opcion ****");
        caracter = pantalla.next().charAt(0);
            if (caracter=='a'||caracter=='A'){
                System.out.println("Estas jugando");}
            else if (caracter=='b'||caracter=='B'){
                System.out.println("Estas entrenando");}
            else if (caracter=='c'||caracter=='C'){
                System.out.println("Estas jugando online");}}
        while (caracter!='D' && caracter!='d');
              System.out.println("EXIT");  }
    }


            
    
