/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetormes;

import java.util.Scanner;

/**
 *
 * @author wayne
 */
public class VetorMes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int count = 0; count < mes.length; count++) {
            System.out.println("O mês " + mes[count] + " tem " + dia[count] + " dias!");
        }
    }

}
