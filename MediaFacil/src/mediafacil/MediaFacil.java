/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediafacil;

import java.util.Scanner;

/**
 *
 * @author wayne
 */
public class MediaFacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        float n1, n2, m;
        
        System.out.print("Informe a nota 1: ");
        n1 = leia.nextFloat();
        System.out.print("Informe a nota 2: ");
        n2 = leia.nextFloat();
        m = (n1 + n2) / 2;
        System.out.println("Sua média foi de " + m);
        
        if(m>=9){
            System.out.println("Parabéns!");
        }
    }
    
}
