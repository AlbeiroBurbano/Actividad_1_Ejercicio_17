
package com.mycompany.ejercicio17;

import java.util.Scanner;
public class Ejercicio17 {

    public static void main(String[] args) {
        double radio,areacirculo,longitudcircunferencia;
        Scanner leerporteclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio");
        
        radio = leerporteclado.nextInt();
        areacirculo = Math.PI * Math.pow(radio,2);
        longitudcircunferencia = 2 * Math.PI * radio;
        
        System.out.println("el radio es: "+radio);
        System.out.println("Area del circulo: "+areacirculo);
        System.out.println("Longitud de circunferencia "+longitudcircunferencia); 
        
    }
}
