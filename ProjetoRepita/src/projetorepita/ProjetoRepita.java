/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author wayne
 */
public class ProjetoRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 - JOptionPane.showMessageDialog(null, "Olá mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        //2 - JOptionPane.showMessageDialog(null, "Você digitou o número " + n);
        int n;
        int soma = 0;
        int count = 1;
        int contPar = 0;
        int contImpar = 0;
        int cont100 = 0;
        float media = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            soma = soma + n;
            if (n % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            if (n >= 100) {
                cont100++;
            }
            count++;
        } while (n != 0);
        media = soma / (count - 2);
        JOptionPane.showMessageDialog(null,
                "<html>Resultado Final<hr><br>Total de valores: " + (count - 2)
                + "<br>Soma total: " + soma
                + "<br>Total de pares: " + (contPar - 1)
                + "<br>Total de ímpares: " + contImpar
                + "<br>Acima de 100: " + cont100
                + "<br>Média dos valores: " + media + "</html>");
    }
}
