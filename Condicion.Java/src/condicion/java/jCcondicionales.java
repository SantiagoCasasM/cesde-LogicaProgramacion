/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicion.java;
import java.util.Scanner;
/**
 *
 * @author 108
 */
public class jCcondicionales {
        public static void main(String[] args) {
            
            int a = 8;
            int b = 6;
            
            System.out.println("Ingrese un dato: ");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            System.out.println("Ingrese un dato: ");
            b = sc.nextInt();
            
            if (a>b){
                System.out.println("El numero mayor es: " + a);
            }else if (a == b){
                System.out.println("Numeros iguales, ingrese numeros diferentes");
            }else {
                System.out.println("El numero mayor es: " + b);
            }
        }
}
