/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgswitch.dias.semana;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class SwitchDiasSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("Pon un numero del 1 al 7");
        dia = pantalla.nextInt();
        switch (dia){
            case 1:   
                System.out.println("Lunes");
                break;
            case 2:   
                System.out.println("Martes");
                break;
            case 3:   
                System.out.println("Miercoles");
                break;
            case 4:   
                System.out.println("Jueves");
                break;
            case 5:   
                System.out.println("Viernes");
                break;
            case 6:   
                System.out.println("Sabado");
                break;
            case 7:   
                System.out.println("Domingo");
                break;
        }
                
    }
    
}
