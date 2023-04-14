/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor01;

/**
 *
 * @author gabri
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] n = new int[4];
        int n[] = {3, 2, 8, 7, 5, 4};
        System.out.println("\033[1;33m Laços com Vetores\033[m");
        //System.out.println("Total de casas do vetor: " + n.length);
                            //vetor de 6 casas é 0-5,
        for (int c = 0;c <= n.length-1;c++) {
            System.out.printf("Na posição %s temos o valor %s \n", c, n[c]);
        }
        
        System.out.println();
        
    }
    
}
