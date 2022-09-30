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
public class jCEjercicio3 {
     public static void main(String[] args) {
     
         int num1 = 0;
         System.out.println("Escriba el primer numero: ");
         Scanner numero1 = new Scanner(System.in);
         num1 = numero1.nextInt();
         
         int num2 = 0;
         System.out.println("Escriba el primer numero: ");
         Scanner numero2 = new Scanner(System.in);
         num2 = numero2.nextInt();
         
         int num3 = 0;
         System.out.println("Escriba el primer numero: ");
         Scanner numero3 = new Scanner(System.in);
         num3 = numero3.nextInt();
         
         if (num1 < num2){
             if(num1 < num3) {
                 if (num2 < num3) {
                                         
                    System.out.println("Menor a mayor: "+ num1);
                    System.out.println("Menor a mayor: "+ num2);
                    System.out.println("Menor a mayor: "+ num3);
                     
                 }
       
             }if (num2 < num1) {
                if (num2 < num3) {
                    if (num1 < num3) {
                         
                        System.out.println("Menor a mayor: "+ num2);
                        System.out.println("Menor a mayor: "+ num1);
                        System.out.println("Menor a mayor: "+ num3);
                         
                     }if (num3 < num1) {
                         if (num3 < num2) {
                            if (num2 < num1) {
                                
                                System.out.println("Menor a mayor: "+ num3);
                                System.out.println("Menor a mayor: "+ num2);
                                System.out.println("Menor a mayor: "+ num1);
                                 
                             }
                         }
                     }
                 }
             }
         }
     }
}
