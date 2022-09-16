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
public class jCejercicio1 {
    public static void main(String[] args) {
        
        //1. Un hombre desea saber cuánto dinero se genera por concepto de intereses
        // sobre la cantidad que tiene en inversión en el banco.
        // El decidirá reinvertir los intereses siempre y cuando estos excedan a $7000,
        // y en ese caso desea saber cuánto dinero tendrá finalmente en su cuenta.
        
        double c_invertida = 0;
        double p_intereses = 0;
        double t_inversion = 0;
        double valor_intereses = 0;
        double i_total = 0;
        
        System.out.println("Digite la cantidad invertida: ");
        Scanner sc = new Scanner(System.in);
        c_invertida = sc.nextDouble();
        
        System.out.println("Digite la cantidad de intereses: ");
        Scanner sc1 = new Scanner(System.in);
        p_intereses = sc1.nextDouble();
        
        System.out.println("Digite tiempo de inversión: ");
        Scanner sc2 = new Scanner(System.in);
        t_inversion = sc2.nextDouble();
        
        valor_intereses = (((c_invertida * p_intereses)/100)*t_inversion);
        
        System.out.println("Estos son tus intereses hasta el momento: " + valor_intereses);
        
    }
}
