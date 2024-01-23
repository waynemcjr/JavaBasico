/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testandoternario;

/**
 *
 * @author wayne
 */
public class TestandoTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Operador Ternário atribui um valor ou outro à uma mesma váriavel (substitui uma estrutura de condição que precisaria ser feito)
        int n1, n2, r;
        n1 = 3;
        n2 = 2;
        r = (n1>n2) ? 0:1; // váriavel recebe o número 0 se o n1 for maior que o n2
        //"fórmula": váriavel = (expressão a ser comparada) ? primeiro resultado se for verdadeiro e segundo resultado se for falso
        System.out.println(r);
        
        r = (n1>n2) ? n1:n2;
        //exemplo: SE n1(3) for MAIOR QUE o n2(2) ENTÃO r recebe o valor de n1(3)
        System.out.println(r);
        
        r = (n1>n2) ? n1+n2:n1-n2;
        //SE n1 for MAIOR QUE n2 ENTÃO será feito n1+n2, caso NÃO seja maior, será feito n1-n2
        System.out.println(r);
        
        String nome1 = "Wayne";
        String nome2 = new String("Wayne");
        String comparacao;
        comparacao = nome1.equals(nome2) ? "Igual":"Diferente"; // não poderia ser usado o == na comparação (variaveis criados de formas diferentes)
        System.out.println(comparacao);
    }
    
}
