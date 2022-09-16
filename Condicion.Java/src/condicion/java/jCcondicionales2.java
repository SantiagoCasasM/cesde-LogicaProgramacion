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
public class jCcondicionales2 {
    public static void main(String[] args) {
        
        int num;
        System.out.println("Digite dato numerico: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        if (num < 3) {
            System.out.println("El numero es menor");
        }else{
            System.out.println("El numero es mayor");
        }
        
    }
}
