/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava7;
import java.util.Scanner;
import java.math.MathContext;
/**
 *
 * @author 108
 */
public class jCEjercicio2 {
     public static void main(String[] args) {
     
     int num1 = 0;
     System.out.println("Escriba el primer numero; ");
     Scanner numero1 = new Scanner(System.in);
     num1 = numero1.nextInt();
     
     double raiz = Math.sqrt(num1);
     
         if (num1 <= 0) {
     
             System.out.println("El numero tiene raiz imaginaria: " + raiz);
         }else{
             System.out.println("La raiz cuadrada es: " + raiz);
         }
     }
}
