/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author wayne
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n, soma = 0;
        String resp;
        do {
            System.out.print("Escolha um número: ");
            n = leia.nextInt();
            soma = soma + n;
            System.out.println("Deseja continuar? (S/N)");
            resp = leia.next();
        } while (resp.equals("S") || resp.equals("s"));
        System.out.println("Resultado da soma de todos os números: " + soma);
    }
}
