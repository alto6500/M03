/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.cajas;

/**
 *
 * @author alto6500
 */
public class ExCajas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        int range = max - min + 1;  
         int normales = 0, raras = 0, epicas = 0;
        for (int cont = 1; cont <= 100; cont++){
        int aleatorio = (int) (Math.random()*range) + min; 
            if (aleatorio <=60 ){
                normales++;}
            else if (aleatorio>60 && aleatorio<=90){
                raras++;}
            else if (aleatorio>90 && aleatorio<=100){
                epicas++;} }
        System.out.println("Epicas = "+ epicas);
        System.out.println("Super raras = "+ raras);
        System.out.println("Normales = "+ normales);    
            }
        }
    
    

