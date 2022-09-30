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
public class jCEjercicio7 {
    public static void main(String[] args) {
    
        int num1 = 0;
        System.out.println("Escriba el primer numero: ");
        Scanner numero1 = new Scanner(System.in);
        num1 = numero1.nextInt();
        
        int sum = 0;
        
        if (num1 > 0) {
            num1 = num1 + 10;
            sum = num1;
            System.out.println("Este es el resultado: "+ sum);
            
        }else if (num1 < 0) {
            num1 = num1 * num1;
            sum = num1;
            System.err.println("Este es el resultado: " + sum);
        }
    }
}
