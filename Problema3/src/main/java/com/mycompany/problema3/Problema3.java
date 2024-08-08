
package com.mycompany.problema3;

import java.util.Scanner;


public class Problema3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scaner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        double numero_1 = scaner.nextDouble();
        
        // solicitar el segundo numero 
        System.out.println("Ingrese el segundo numero");
        double numero_2 = scaner.nextDouble();
        
        // solicitar el operador 
        System.out.println("Ingres la operacion que desar hacer (+,-,*,/): ");
        String operador = scaner.next();
        // resultado
        double resultado;
        
        switch (operador) {
            case "+" :
                resultado = numero_1 + numero_2;
                System.out.println("El resultado de la suma es " + resultado);
                break;
            case "-":
                resultado = numero_1 - numero_2;
                System.out.println("El resultado de la resta es " + resultado);
            case "*":
                resultado = numero_1 * numero_2;
                System.out.println("El resultado de la multiplicacion es " + resultado);
                break;
            case "/":
                if (numero_2 != 0) {
                    resultado = numero_1 / numero_2;
                    System.out.println("El resultado de la division es " + resultado);
                    
                } else {
                    System.out.println("No se puede dividir entre cero");
                }
                break;
                
            default:
                System.out.println("Operador no valido");
                break;
        }
        
        
        
    }
    
    
}
