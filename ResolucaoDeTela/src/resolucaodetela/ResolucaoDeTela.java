/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author wayne
 */
public class ResolucaoDeTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("Sua resolução é de " + largura + "x" + altura);
    }
    
}
