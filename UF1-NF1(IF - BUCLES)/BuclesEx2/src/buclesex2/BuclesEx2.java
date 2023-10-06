/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclesex2;

/**
 *
 * @author alto6500
 */
public class BuclesEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        for (cont = 0; cont <= 200; cont=cont+2){
        System.out.println("Contador --> " + cont);}
        
        System.out.println("Do While");
        do{
        int cont1=0;
        cont1=cont1+2;
        System.out.println("Contador --> " + cont1);
        while (cont1==200);
        System.out.println("Estos son los numeros pares hasta el 200");}
        


