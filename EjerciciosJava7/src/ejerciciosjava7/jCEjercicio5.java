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
public class jCEjercicio5 {
    public static void main(String[] args) {
    
        int p1 = 0;
        System.out.println("Escriba el primer numero: ");
        Scanner primero1 = new Scanner(System.in);
        p1 = primero1.nextInt();
        int p2 = 0;
        System.out.println("Escriba el primer numero: ");
        p2 = primero1.nextInt();
        int p3 = 0;
        System.out.println("Escriba el primer numero: ");
        p3 = primero1.nextInt();
        
        if (p1 == p2) {
             System.out.println("Hacen pareja");
        }else if (p1 == p3) {
                 System.out.println("Hacen pareja");
        }else if (p2 == p3) {
                     System.out.println("Hacen pareja");
        }else if(p3 == p1) {
                        System.out.println("Hacen pareja");
                        
        }else{
            System.err.println("No hacen pareja");
        }
    }
}
        
        
    


