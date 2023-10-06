/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple2.dowhile;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class Exemple2DoWhile {

    /**
     * @param args the command line arguments
     * programa que pedira numeros hasta que ntroduzcas el -1
     * en ese momento parará
     */
    public static void main(String[] args) {
        int numero=0;
        Scanner pantalla = new Scanner(System.in);
        //do{
        //System.out.println("pon valores, (-1 para terminar)....");
        //numero = pantalla.nextInt(); 
        //System.out.println("Has introducido el " +numero);
        
        //}
        //while(numero!=-1);
        //System.out.println("Mismo bucle");//
        
        
        boolean end = false;
        do {
        System.out.println("pon valores, (-1 para terminar)....");
        numero = pantalla.nextInt(); 
        while (!end){
        System.out.println("");
        cont = cont +1;}
        if (cont>10){
        end = true;}
        }
        
    }
    
}
