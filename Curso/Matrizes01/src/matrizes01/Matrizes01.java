package matrizes01;

import java.util.Scanner;

public class Matrizes01 {

    public static void main(String[] args) {
        /*Mateirial complemetar do curso da Loiane Groner, no Youtube*/
        
        
        //int m[][] = new int[5][4];
        int[][] m = 
        {{2, 3, 4, 5}, {6, 7, 8, 9}, {9, 6, 3, 0}, {2, 4, 6, 8}, {1, 3, 5, 7}};
        for (int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++) {
                //System.out.printf("%s° array - Posição %s: %s\n", i+1, j+1, m[i][j]);
            }
        }
        
        //Matriz de 3 Dimensões
        int[][][] m3x3 = new int[3][3][3];
        int soma=0, somap=0, somai=0;
        //Adicionar para cada elemento, o valor da soma do indice
        //Obter a soma dos elementos da matriz, dos pares e dos ímpares
        
        for (int i=0; i < m3x3.length; i++) {
            
            for (int j=0; j < m3x3[i].length; j++) {
                
                for (int k=0; k < m3x3[i][j].length; k++) {
                    
                    m3x3[i][j][k] = i+j+k; //Add elemento com valor do índice
                    soma += m3x3[i][j][k]; //Soma todos os valores
                    if (m3x3[i][j][k] % 2 == 0) {  //Soma Par
                       somap += m3x3[i][j][k];
                    } else {
                        somai += m3x3[i][j][k];  //Soma Ímpar
                    }
                    
                }
            }
        }
        
        //Output
        for (int i=0; i < m3x3.length; i++) {
            
            for (int j=0; j < m3x3[i].length; j++) {
                
                for (int k=0; k < m3x3[i][j].length; k++) {
                    System.out.print(m3x3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();    
        }
        System.out.printf("Soma total: %s | Soma Pares: %s | Soma Ímpares: %s\n"
                , soma, somap, somai);
        
        //Arrays Irregulares
        //Guardar dados de uma pesquisa feita com algumas pessoas
        //Pergunte ao cidadão a quantidade de filhos e o nome de cada filho. Guarde na matriz
        //os dados de forma a ocupar somente os espaços necessários na memória.
        //Imprimir a quantidade de pessoas entrevistadas, filhos e nomes.
        Scanner teclado = new Scanner(System.in);
        int n;
        int numFilhos;
        String[][] filhos; 
        System.out.print("Vamos entrevistar quantas pessoas? : ");
        n = teclado.nextInt();
        filhos = new String[n][];
        System.out.println("---------------------------");
        for (int i = 0; i<filhos.length; i++){
            System.out.printf("Entrevistado de número 0%s", i+1);
            System.out.print("\nQuantos filhos o senhor tem? : ");
            numFilhos = teclado.nextInt();
            System.out.println("---------------------------");
            if (numFilhos > 0) {
                filhos[i] = new String[numFilhos];
                for (int j = 0; j<filhos[i].length; j++) {
                    System.out.printf("Qual nome do seu %s° filho? : ", j+1);
                    filhos[i][j] = teclado.next();
                }
            } else {
                System.out.println("Ok, passando pro próximo");
                filhos[i] = new String[1];
                filhos[i][0] = "Nenhum"; 
            }
        }
        
        System.out.println("---------------------------");
        System.out.println("Mostrando os entrevistados e o nome de seus filhos : ");
        for (int i = 0; i<filhos.length; i++) {
            System.out.print(i+1 + "°Entrevistado: | ");
            for (int j = 0; j<filhos[i].length; j++) {
                System.out.print(filhos[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
