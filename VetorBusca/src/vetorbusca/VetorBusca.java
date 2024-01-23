/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorbusca;

import java.util.Arrays;

/**
 *
 * @author wayne
 */
public class VetorBusca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = {1 ,4, 3, 9, 0, 2, 17};
        for(int valor: vetor){
            System.out.print(valor + " ");
        }
        int busca = Arrays.binarySearch(vetor, 4); // busca o valor colocado e mostra em qual o indice (casa) está o valor
        System.out.println("\nEncontrei o valor 4 na posição: " + busca);
    }
    
}
