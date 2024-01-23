/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemaioridade;

import java.util.Scanner;
/**
 *
 * @author wayne
 */
public class TesteMaiorIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe o ano de nascimento: ");
        int ano = leia.nextInt();
        
        int idade = 2024 - ano;
        
        if(idade>=18){
            System.out.println("Você é maior de idade com " + idade + " anos!");
        }else {
            System.out.println("Você é menor de idade com " + idade + " anos!");
        }
    }
}
