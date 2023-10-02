/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.meses.semanas;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class SwitchMesesSemanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char meses;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Pon una letra");
        meses = pantalla.next().charAt(0);
        switch (meses){
            case 'E':
            case 'e':   
                System.out.println("Enero");
                break;
            case 'F':
            case 'f':   
                System.out.println("Febrero");
                break;
            case 'M':
            case 'm':   
                System.out.println("Marzo");
                break;
            case 'A':
            case 'a':   
                System.out.println("Abril");
                break;
            case 'D':
            case 'd':
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Latra NO valida");
        }
                
    }
    
}
    
    

