/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author wayne
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Informe seu nome: ");
        String nome = leia.nextLine();
        
        System.out.print("Informe sua idade: ");
        double idade = leia.nextInt();
        
        System.out.print("Informe seu peso: ");
        double peso = leia.nextDouble();
        
        System.out.print("Informe sua altura: ");
        double altura = leia.nextDouble();
        
        double imc = peso / (altura * altura);
        String classificacao = "";
                
        if(imc < 18.5){
        classificacao = "abaixo do peso";
        } else if(imc >= 18.5 && imc < 25 ){
        classificacao = "saudável";
        } else if(imc >= 25 && imc < 30){
        classificacao = "com peso em excesso";
        } else if(imc >= 30 && imc < 35){
        classificacao = "com obesidade grau I";
        } else if(imc >= 35 && imc < 40){
        classificacao = "com obesidade grau II";
        } else if(imc >= 40){
        classificacao = "com obesidade mórbida";
        }
        
        System.out.println("Seu nome é " + nome + " você tem " + idade + " anos e pesa " + peso + " kgs");
        System.out.printf("Seu imc está em %.2f" , imc);
        System.out.println("\nSua classificação de imc indica que você está " + classificacao);
        //System.out.println(classificacao);
    }
    
}
