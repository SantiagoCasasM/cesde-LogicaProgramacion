/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jbclaseejercicios;
import java.util.Scanner;
/**
 *
 * @author 108
 */
public class jbClase2Ejercicio {
    public static void main(String[] args) {
        
        /*EJERCICIO 2.1*/
        Scanner leer =  new Scanner(System.in);
        int notas;

        System.out.print("ingrese cantidad de notas:");
        notas = leer.nextInt();

        int suma = 0;
        int prom = 0; 
        int nota = 0;

        for(int i=1; i<= notas; i++){
        System.out.println("ingrese nota"+" "+i+" "+"de"+" "+notas+":");
        nota = leer.nextInt();          
        suma = suma + nota;
}

        prom = suma / notas;
        System.out.println("promedio de las notas:"+prom );
    }
}

