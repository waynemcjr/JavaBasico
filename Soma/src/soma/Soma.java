/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soma;

import java.util.Scanner;

/**
 *
 * @author wayne
 */
public class Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Escolha úm numero: ");
        int n1 = leia.nextInt();
        
        System.out.print("Escolha outro número: ");
        int n2 = leia.nextInt();
        
        int soma = n1 + n2;
        
        System.out.println("A soma dos dois números é igual a " + soma);
    }
    
}
