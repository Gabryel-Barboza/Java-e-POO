/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculando a média
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número :");
        float n1 = teclado.nextFloat();
        System.out.println("Digite o segundo número :");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) /2;
        System.out.println(String.format("Sua média foi %.1f", m));
        //System.out.println("Sua média foi ", + m);
        //System.ou.printf("Sua média foi %.1f \n", m);
        if (m >= 9) {
            System.out.println("Parabéns!");
        }        
    }
    
}
