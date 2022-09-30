/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava7;
import java.util.Scanner;
/**
 *
 * @author 108
 */
public class jCEjercicio1 {
    public static void main(String[] args) {
        
        int num1 = 0;
        System.out.println("Escriba el primer numero: ");
        Scanner numero1 = new Scanner(System.in);
        num1 = numero1.nextInt();
        
        int num2 = 0;
        System.out.println("Escriba el segundo numero: ");
        Scanner numero2 = new Scanner(System.in);
        num2 = numero1.nextInt();
        
        int division = 0;
        
        if (num2 == 0) {
            System.out.println("La division no es posible");
        }
        
        division = num1 / num2;

        System.out.println("La division es la siguiente: "+ division);
        
        
    }
}
