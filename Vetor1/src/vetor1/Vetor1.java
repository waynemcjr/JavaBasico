/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor1;

/**
 *
 * @author wayne
 */
public class Vetor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int n[] = new int[4]; // cria o vetor com 4 "casas" vazias
        int n[] = {3, 2, 8, 7, 5, 4}; // cria o vetor já preenchido
        System.out.println("Total de casas do vetor: " + n.length); // mostra o comprimento do vetor
        for(int count=0; count<n.length; count++){ // estrutura de repetição genérica, funciona pra qualquer vetor de qualquer tamanho // count<=n.length-1 também pode ser utilizado
            System.out.println("Na posição " + count + " temos o valor " + n[count]);
        }
    }

}
