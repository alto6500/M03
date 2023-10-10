/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg9.bucles;

/**
 *
 * @author alto6500
 */
public class Ex9Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma;
        for ( num = 1; num <= 10; num++) {
        //num = num++;
        System.out.println(""+num);
        suma = 1+2;
        suma = suma+num++;
        if (num==10){
            System.out.println("Suma" + suma);}
        }
        }
    }


