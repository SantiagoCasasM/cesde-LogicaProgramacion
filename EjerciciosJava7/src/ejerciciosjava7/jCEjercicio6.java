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
public class jCEjercicio6 {
    public static void main(String[] args) {
    
        int cedula = 0;
        System.out.println("Registre su cedula: ");
        Scanner cedula1 = new Scanner(System.in);
        cedula = cedula1.nextInt();
        int edad = 0;
        System.out.println("Registre su edad: ");
        Scanner edad1 = new Scanner(System.in);
        edad = edad1.nextInt();
        
        if (edad < 18) {
            System.err.println("No puede votar");
        }else{
            System.out.println("Puede votar tranquilamente.");
        }
    }
}
