
package problema.pkg7;

import java.util.ArrayList;
import java.util.Scanner;


public class Problema7 {


    public static void main(String[] args) {
        //Variables
        Scanner elementos = new Scanner(System.in);
        ArrayList<Integer> lista_numeros = new ArrayList<>();
        
        System.out.println("Ingres los numeros y finaliza escribiendo '-1' ");
        
        int numero ;
        
        while (true) {            
            numero = elementos.nextInt();
            if (numero == -1) {
                break;
            }
            lista_numeros.add(numero);
        }  
        // imprimir la lista original 
        
        for (int num : lista_numeros){
            System.out.println("Lista original elmento -> " + num);
        }
        
        // llamar la funcion eliminar duplicados
        eliminar_duplicado(lista_numeros);
        System.out.println("La lista sin duplicdos : /n");
        
        for(int num: lista_numeros){
            System.out.println("Lista filtrada elemento -> " + num);
        }
        
        elementos.close();
        
    }
    
    public static void eliminar_duplicado(ArrayList<Integer> lista){
    // Variables
    ArrayList<Integer> lista_filtrada = new ArrayList<>();
    
    for(Integer numero: lista){
        if (!lista_filtrada.contains(numero)) {
            lista_filtrada.add(numero);
        }
    }
    lista.clear();
    lista.addAll(lista_filtrada);
    }
    
   
}
