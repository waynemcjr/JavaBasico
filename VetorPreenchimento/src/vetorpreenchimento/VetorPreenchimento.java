/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorpreenchimento;

import java.util.Arrays;

/**
 *
 * @author wayne
 */
public class VetorPreenchimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = new int[20];
        Arrays.fill(vetor, 0); // coloca o valor 0 em todas as casas
        
        for(int valor: vetor){
            System.out.print(valor + " ");
        }
    }
    
}
