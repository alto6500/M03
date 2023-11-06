/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random.exemples;

import java.util.Random;

/**
 *
 * @author alto6500
 */
public class RandomExemples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Voy a generar un numero aleatorio del 1 al 100");
        //Math.random() genera un aleatori de 0 a 1 (el 1 no està inclós)
        
        int max = 25;
        int min = 1;
        int range = max - min + 1;
        System.out.println("rango de valores " + range);   
        int aleatorio = (int) (Math.random()*range) + min;
        System.out.println("numero generado " + aleatorio);   

        Random rd = new Random ();
        min = 1;
        range =10;
        aleatorio = rd.nextInt(range)+ min;
        System.out.println("numero generado por random " + aleatorio);   

    }
    
}
