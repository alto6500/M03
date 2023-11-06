/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4.reforç;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Ex4Reforç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin_correcto, pin, intentos=0;
        System.out.println("Bienvenido a Banco Sabadell");
        do{
            System.out.println("Introduce la clave PIN de tu targeta");
            pin = sc.nextInt();
            pin_correcto = 1234;
            intentos++;
            if (pin!=pin_correcto)
            {
                System.out.println("Pin incorrecto");
            }
            else {
                System.out.println("Pin correcto. Compra realizada correctamente");
            }
        }while(pin!=pin_correcto && intentos<3);
            if (intentos>=3 && pin!=pin_correcto){
            System.out.println("Numero de intentos superado. Tarjeta bloqueada");}
    }
    
}
