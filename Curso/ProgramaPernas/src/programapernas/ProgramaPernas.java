/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String tipo;
        System.out.print("Quantas pernas? : ");
        int pernas = teclado.nextInt();
        System.out.print("O tipo é um(a) ");
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
        //forma compactada com switch expression
        System.out.print("Quantas pernas? : ");
        pernas = teclado.nextInt();
        tipo = switch (pernas) {
            case 1 -> "Sací";
            case 2 -> "Bípede";
            case 3 -> "Tripé";
            case 4 -> "Quadrúpede";
            case 6, 8 -> "Aranha";
            default -> "ET";
        }; //Fechar bloco ;
        System.out.printf("O tipo é um(a) %s\n", tipo);
    }
    
}
