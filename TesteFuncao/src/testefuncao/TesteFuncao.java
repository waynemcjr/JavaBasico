/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao;

/**
 *
 * @author wayne
 */
public class TesteFuncao {
    
    /*static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma é " + s);
    }*/
    
    static int soma (int a, int b){
        int s = a + b;
        return s;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Começou o programa (main é executado primeiro)");
        //soma(5,4);
        int sm = soma(5,9);
        System.out.println("A soma é igual a " + sm);
    }
    
}
