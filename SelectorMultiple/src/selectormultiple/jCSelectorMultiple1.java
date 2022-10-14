/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectormultiple;
import java.util.Scanner;
/**
 *
 * @author 108
 */
public class jCSelectorMultiple1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dia = 0;
        System.out.println("Por favor escriba de 1 a 7: ");
        Scanner dia1 = new Scanner(System.in);
        dia = dia1.nextInt();
        
        switch(dia){
        
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            
        }
        
    }
    
}
