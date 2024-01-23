/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemath;

/**
 *
 * @author wayne
 */
public class TesteMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        System.out.println(Math.round(5.5));
        System.out.println("");
        System.out.println(Math.round(5.51));
        System.out.println(Math.round(5.49));
        System.out.println(Math.floor(5.99));
        System.out.println(Math.ceil(5.01));
        System.out.println("");
        System.out.println(Math.random());
        System.out.println("");
        
        double aleatorio = Math.random();
        int n = (int) (10 + aleatorio * (100-10));
        //exemplo acima: gerar números de um intervalo de 10 até 100 // Fórmula = MenorNúmero + random * (MaiorNúmero - MenorNúmero)
        System.out.println(n);
    }
    
}
