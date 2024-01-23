/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorforeach;

import java.util.Arrays;

/**
 *
 * @author wayne
 */
public class VetorForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vetor[] = {3.5, 4.75, 1, 1.3, 4.01, -1.1};
        Arrays.sort(vetor); // colocar o vetor em ordem crescente
        for(double valor: vetor){
            System.out.print(valor + " ");
        }
    }
    
}
