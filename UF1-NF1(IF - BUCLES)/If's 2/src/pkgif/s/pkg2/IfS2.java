/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgif.s.pkg2;

import java.util.Scanner;

/**
 *
 * @author alto6500
 */
public class IfS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gasto, descuento, gasto_final;
        Scanner pantalla = new Scanner(System.in);
        System.out.println("¿Cuanto te has gastado en el supermercado?");
        gasto = pantalla.nextDouble();
        if (gasto < 800){
            descuento = ((gasto*0)/100);
            gasto_final = gasto - descuento;}
        else if (gasto >= 800 && gasto<=1500){
            descuento = ((gasto*6)/100);
            gasto_final = gasto - descuento;}
        else if (gasto>1500 && gasto<=3000){
            descuento = ((gasto*8)/100);
            gasto_final = gasto - descuento;}
        else {
            descuento = ((gasto*10)/100);
            gasto_final = gasto - descuento;}
        System.out.println("Finalment pagarem "+gasto_final + "euros");    
                    }
        }

    
    

