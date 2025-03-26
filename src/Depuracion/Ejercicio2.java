package Depuracion;

import java.util.Scanner;
/**
 *
 *    Escribe un programa que lea 15 números por teclado y que luego los
 *    muestre en orden inverso, es decir, el primero que se introduce es
 *    el último en mostrarse y viceversa.
 * 
 * VARIABLES
 *     int i - contador para recorrer los ciclos.
 *     int[] numero - array para almacenar los diez números introducidos por el usuario.
 * 
 * INICIO PROGRAMA 
 * 1.- Presentación del programa al usuario.
 * 2.- Introducción de los valores por el usuario en el array.
 * 3.- Impresión por pantalla recorriendo el array desde la última posición a la primera.

 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        
        System.out.println("El programa pedirá 15 números y después serán impresos en orden inverso:");
        
        for (int i =0;i<15;i++) {
            System.out.print("Número "+(i+1)+": ");
            numeros[i] = scanner.nextInt();
        }        
        System.out.println("Valores introducidos en orden inverso");
        for (int i = 14; i>0;i--) {
            System.out.println("Numero " + i+": "+numeros[i]);            
        }
    }
}
