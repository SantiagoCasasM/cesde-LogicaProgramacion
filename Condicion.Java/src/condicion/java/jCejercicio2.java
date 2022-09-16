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
public class jCejercicio2 {
    public static void main(String[] args) {
    
        int año_1 = 0;
        int año_2 = 0;
        int calculo_meses = 0;
        
        System.out.println("Digite el primer año: ");
        Scanner valor1 = new Scanner(System.in);
        año_1 = valor1.nextInt();
        
        System.out.println("Digite el Segundo año: ");
        Scanner valor2 = new Scanner(System.in);
        año_2 = valor2.nextInt();
        
        calculo_meses = (año_1 - año_2) * 12; 
        
        System.out.println("Esta es la cantidad de meses que han pasado: " + calculo_meses);
        
    }
    
}
