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
public class jCSelectorMultiple4 {
    public static void main(String[] args) {
    
        int sueldo;
        int extras;
        
        System.out.println("Ingrese su sueldo: ");
        Scanner sueldo1 = new Scanner(System.in);
        sueldo = sueldo1.nextInt();
        
        System.out.println("Ingrese sus horas extras: ");
        Scanner extras1 = new Scanner(System.in);
        extras = extras1.nextInt();
        
        switch (sueldo) {
            
            case 1:
                if (sueldo <= 1000000) {
            
                    extras = 10000;
                    sueldo = sueldo + extras;
                    
                    System.out.println("Su sueldo es: "+sueldo+" Y sus horas extras trabajadas son: "+extras);
                }
                    
                break;
                
            case 2:
                if(sueldo <= 1200000){
        
                    extras = 13800;
                    sueldo = sueldo + extras;
                    
                    System.out.println("Su sueldo es: "+sueldo+" Y sus horas extras trabajadas son: "+extras);
            
                }
                  
                break;
                
            case 3:
                if(sueldo <= 1600000){
        
                    extras = 15000;
                    sueldo = sueldo + extras;
                    
                    System.out.println("Su sueldo es: "+sueldo+" Y sus horas extras trabajadas son: "+extras);
                }
    
                break;
            case 4:
                if(sueldo <= 2000000){
        
                    extras = 17000;
                    sueldo = sueldo + extras;
        
                    System.out.println("Su sueldo es: "+sueldo+" Y sus horas extras trabajadas son: "+extras);
                }
                
                break;
        }
    }
}
