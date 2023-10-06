/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkgif.s;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class ExerciciIfS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sueldo, augmento, sueldo2;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("¿Cuanto cobras al año?");
        sueldo = pantalla.nextDouble();
        if (sueldo < 18000){
            augmento = ((sueldo*12)/100);
            sueldo2 = augmento + sueldo;}
        else if (sueldo >= 18000 && sueldo<=30000){
            augmento = ((sueldo*10)/100);
            sueldo2 = augmento + sueldo;}
        else if (sueldo>30000 && sueldo<45000){
            augmento = ((sueldo*8)/100);
            sueldo2 = augmento + sueldo;}
        else {
            augmento = ((sueldo*6)/100);
            sueldo2 = augmento + sueldo;}
        System.out.println("Li pertoca un augment de sou de "+augmento + "euros");
        System.out.println("L'any següent tindra un sou de "+sueldo2 + "euros");    
                    }
        }


