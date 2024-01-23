/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador;

/**
 *
 * @author wayne
 */
public class Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        while (count<10){
            count++;
            if(count == 2 || count == 4 || count == 6){
                continue;
            }
            if(count==9){
                break;
            }
            System.out.println("Pule pela " + count + "° vez");
        }
    }
}
