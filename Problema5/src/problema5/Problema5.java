
package problema5;

import java.util.Scanner;


public class Problema5 {


    public static void main(String[] args) {
        // TODO code application logic here\
        System.out.println("hola mundo");
        Scanner scaner = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Ingres los de la matriz");
        
//        System.out.println("Posicion [0][0]");
//        matriz[0][0] = scaner.nextInt();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" Posicion [" + i + "][" + j+ "]:");
                matriz[i][j] = scaner.nextInt();
            }
        }
        
        // calcular la suma de la diagonal 
        
        int suma_diagonal = matriz[0][0]+ matriz[1][1] + matriz[2][2];
        System.out.println("La suma de la diagonal es "+ suma_diagonal);
       
    }
    
}
