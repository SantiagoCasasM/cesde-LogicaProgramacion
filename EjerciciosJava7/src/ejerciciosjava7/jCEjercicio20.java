/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectormult;
import java.util.Scanner;
/**
 *
 * @author 108
 */
public class jCEjercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String codigo_empleado;
        System.out.println("¿Cual es tu codigo empleado?");
        Scanner codigo1 = new Scanner(System.in);
        codigo_empleado = codigo1.next();
        double nd_trabajados;
        System.out.println("¿Cuantos dias trabajo?");
        Scanner diastrabajados = new Scanner(System.in);
        nd_trabajados = diastrabajados.nextDouble();
        double salario_dias;
        System.out.println("¿Cual es su salario por dia?");
        Scanner saladias = new Scanner(System.in);
        salario_dias = saladias.nextDouble();
        
        double salarioN_mensual;
        double deducciones = 0;
        double impuestos = 0;
        double segurosocial = 0;
        double pensiones = 0;
        double neto = 0;
        double subsidio = 0;
        
        salarioN_mensual = nd_trabajados * salario_dias;
        
        if (salarioN_mensual >= 1400000) {
            impuestos = salarioN_mensual * 0.07;
            segurosocial = salarioN_mensual * 0.03;
            pensiones = salarioN_mensual * 0.02;
            deducciones = impuestos + segurosocial + pensiones;
            neto = salarioN_mensual - deducciones;
        }else{
       
            segurosocial = salarioN_mensual * 0.02;
            pensiones = ((salarioN_mensual*1.5)/100);
            subsidio = salarioN_mensual * 0.02;
            deducciones = segurosocial + pensiones;
            neto = salarioN_mensual - deducciones + subsidio;
            
        }

        System.out.println("Su codigo es: "+ codigo_empleado + " El salario neto: "+ neto + " Y sus deducciones son: "+deducciones);
       
    }
    
}
