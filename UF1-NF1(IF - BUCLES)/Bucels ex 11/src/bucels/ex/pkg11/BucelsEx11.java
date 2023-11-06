/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucels.ex.pkg11;

/**
 *
 * @author alvar
 */
public class BucelsEx11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int par = 0, impar = 0;
        for (int cont = 100; cont <= 200; cont++) {
            if (cont%2 ==1){
            impar = impar + cont;}
            else {
            par = par + cont;} }
            System.out.println("Suma de los pares" + par);    
            System.out.println("Suma de los impares" + impar);  
        
    }
    
}
