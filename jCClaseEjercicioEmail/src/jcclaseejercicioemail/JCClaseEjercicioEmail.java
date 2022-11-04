/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jcclaseejercicioemail;

import java.util.Scanner;

/**
 *
 * @author 108
 */
public class JCClaseEjercicioEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numpar = 0;
        System.out.println("¿Que numero desea evaluar si es par?: ");
        Scanner numpar1 = new Scanner(System.in);
        numpar = numpar1.nextInt();
        
        if (numpar % 2==0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("No es un numero par");
        }
        
        int numprimo = 0;
        System.out.println("¿Que numero desea evaluar si es primo?: ");
        Scanner numprimo1 = new Scanner(System.in);
        numprimo = numprimo1.nextInt();
        
        int contador = 0;
        int I;
        
        for (I = 1; I <= numprimo; I++) {
            
            if ((numprimo % I) == 0) {
                contador++;
            }
            
        }
        if(contador == 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }

        int numperfec = 0;
        System.out.println("¿Que numero desea evaluar si es perfecto?");
        Scanner numperfec1 = new Scanner(System.in);
        numperfec = numperfec1.nextInt();
        
        int suma = 0;
        for (int i = 1; i < numperfec / 2; i++) {
            if (numperfec % i == 0) {
                suma += i;
            }
        }
        if (numperfec == suma) {
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }
        
        
    }
    
}
