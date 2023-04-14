/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author gabri
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x[] = {3, 7, 6, 1, 9, 4, 2};
        int p = Arrays.binarySearch(x, 1); //Pesquisar por tipos de buscar de vetores.
        for (int vet: x) {
            System.out.print(vet + " ");
        }
            System.out.println("\nEncontrei o valor 1 na posição " + p);
    }
    
}
