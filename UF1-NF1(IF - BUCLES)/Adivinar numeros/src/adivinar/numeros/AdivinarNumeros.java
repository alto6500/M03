/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinar.numeros;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class AdivinarNumeros {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_usuari, intentos=0;
        int max = 20;
        int min = 1;
        int range = max - min + 1;  
        int numero_correcte = (int)(Math.random()*range) + min;
        System.out.println("He pensat el " + numero_correcte);
       
        do{
            System.out.println("Pon un valor del " + min + " al " + max);
            num_usuari = sc.nextInt();
            intentos++;
            if (num_usuari>numero_correcte)
            {
                System.out.println("tu numero es mayor");
            }
            else if (num_usuari<numero_correcte)
            {
                System.out.println("tu numero es menor");
            }
        }while(num_usuari!=numero_correcte && intentos<3);
            if (intentos>=3){
            System.out.println("Numero de intentos superado");}
    }
}

