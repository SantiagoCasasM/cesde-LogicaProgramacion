/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */  import java.util.Scanner;
     import java.math.*;
/**
 *
 * @author 108
 */
public class jcClase2 {
     public static void main(String[] args){
       
        int valorA;
        int valorB;
        double total;
        
        valorA = 2;
        valorB = 3;
        total = Math.pow(valorA, valorB);
        
        
        System.out.println("Este es el resultado: " + total);
        System.out.println("Digite su nombre: ");
        Scanner sc = new Scanner (System.in);
        String nombre = sc.nextLine();
        Scanner valor = new Scanner (System.in);
        System.out.println("Digite su valor: ");
        int num1 = valor.nextInt();
 
    }
}
