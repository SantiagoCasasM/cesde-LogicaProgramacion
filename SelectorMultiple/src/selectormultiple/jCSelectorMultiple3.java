/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectormultiple;

import java.util.Scanner;

/**
 *
 * @author 108
 */
public class jCSelectorMultiple3 {
     public static void main(String[] args) {
     
         int numero;
         int unidades;
         
         Scanner numero1 = new Scanner(System.in);
         System.out.println("Escriba un numero: ");
         numero = numero1.nextInt();
         
         unidades = numero % 10;
         
         switch(unidades){
         
             case 1:
                 
                 System.out.println("uno");
                 
                 break;
                 
             case 2:
                 
                 System.out.println("dos");
                 
                 break;
                 
             case 3:
                 
                 System.out.println("tres");
                 
                 break;
                 
             case 4:
                 
                 System.out.println("cuatro");
                 
                 break;
                 
             case 5:
                 
                 System.out.println("cinco");
                 
                 break;
                
             case 6:
                 
                 System.out.println("seis");
                 
                 break;
                 
             case 7:
                 
                 System.out.println("siete");
                 
                 break;
                 
             case 8:
                 
                 System.out.println("ocho");
                 
                 break;
               
             case 9:
                 
                 System.out.println("nueve");
                 
                 break;
             
         }
     
     }
}
