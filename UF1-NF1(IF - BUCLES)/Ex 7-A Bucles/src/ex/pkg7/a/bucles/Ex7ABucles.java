/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg7.a.bucles;

/**
 *
 * @author alto6500
 */
public class Ex7ABucles {

    /**@param args
     exercici que pida numeros hasta que pongas -1
     al final ttiene que mostrar la suma de todos los numeros introducidos
     */
    public static void main(String[] args) {
        int num;
        Scanner pantalla = new Scanner (System.in);
        System.out.println("Introduce un numero");
        num = pantalla.nextInt();
        while (num==-1)
            System.out.println("Programa finalizado");
        if (num!=-1)