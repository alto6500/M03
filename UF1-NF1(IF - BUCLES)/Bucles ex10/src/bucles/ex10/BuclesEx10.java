/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles.ex10;

import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class BuclesEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean nota10 = false;
        System.out.println("Ingresa tus notas. Ingresa -1 para finalizar.");
        while (true) {
            System.out.print("Ingrese una nota: ");
            int nota = sc.nextInt();
                if (nota == 10) {
                nota10 = true; }
                if (nota == -1) {
                break;}     }
            if (nota10) {
            System.out.println("¡Se encontró al menos una nota con valor 10!");} 
            else {
            System.out.println("No se encontró ninguna nota con valor 10.");}
    }
}
