/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprojectvariables;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class FirstProjectVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int nota1;int nota2;int nota3;int edad;
        Scanner pantalla = new Scanner(System.in);
        /*
        System.in fa que indiqui que sigui per consola
        Informar valor por el usuario
        */
        System.out.println("¿Que nota crees que sacaras en M03?");
        nota1 = pantalla.nextInt();
        System.out.println("¿Que nota crees que sacaras en M02?");
        nota2 = pantalla.nextInt();
        System.out.println("¿Que nota crees que sacaras en M04?");
        nota3 = pantalla.nextInt();
        edad = 18;
        System.out.println("Tu edad es " + edad);
        System.out.println("Tu nota en M03 sera un " + nota1);
        System.out.println("Tu nota en M02 sera un " + nota2);  
        System.out.println("Tu nota en M04 sera un " + nota3);
    }
    
}
