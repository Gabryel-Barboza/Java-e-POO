package matrizes02;

import java.util.Random;
import java.util.Scanner;
import java.time.Month;

public class Matrizes02 {

    public static void main(String[] args) {
        //Exercícios
        //01 - Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso, determine o maior
        //número da matriz e a sua posição(linha, coluna).
            Random random = new Random();
            int[][] M = new int[4][4];
            int numaior = 0;
            for (int i = 0; i<M.length; i++) {
                for (int j = 0; j<M[i].length; j++) {
                    M[i][j] = random.nextInt(10);
                    if (M[i][j] > numaior) {
                        numaior = M[i][j];
                    }
                }
            }
            //Output da Matriz
            for (int[] col : M) {
                for (int num : col) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println("O maior número encontrado foi " + numaior);
            //Posição do maior num
            for (int i = 0; i<M.length; i++) {
                for (int j = 0; j<M.length; j++) {
                    if (M[i][j] == numaior)
                        System.out.println("Encontrado na linha " + i + " coluna " + j);
                }
            }
        
        //02 - Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior
        //e o menor valor da linha 5 e qual o maior e menor da coluna 7.
            /*int[][] M = new int[10][10];
            int numaior = 0, numenor = 0;
            //Gerando a Matriz
            for (int i = 0; i<M.length; i++) { 
                for (int j = 0; j<M[i].length; j++) {
                    M[i][j] = random.nextInt(10);
                }
            }
            //Output matriz
            for (int i = 0; i<M.length; i++) { 
                for (int j = 0; j<M[i].length; j++) {
                    System.out.print(M[i][j] + " ");
                }
                System.out.println();
            }
            //Verificando linha 5
            for (int j = 0; j<M.length; j++) { 
                if (j == 0) {
                    numaior = M[5][j]; //Atribuindo valor inicial para comparar
                    numenor = M[5][j];
                }
                if (M[5][j] > numaior) numaior = M[5][j]; //Verificando maior valor
                if (M[5][j] < numenor) numenor = M[5][j]; //Verificando menor valor
            }
            //Mostrando posições linha 5
            for (int j = 0; j<M.length; j++) {   
                if (M[5][j] == numaior) {
                    System.out.println("Maior valor da linha 5 encontrado na coluna " + j);
                }
                if (M[5][j] == numenor) {
                    System.out.println("Menor valor da linha 5 encontrado na coluna " + j);
                }
            }

            //Verificando coluna 7
            for (int i = 0; i<M.length; i++) { 
                if (i == 0) {
                    numaior = M[i][7]; //Atribuindo valor inicial para comparar
                    numenor = M[i][7];
                }
                if (M[i][7] > numaior) numaior = M[i][7]; //Verificando maior valor
                if (M[i][7] < numenor) numenor = M[i][7]; //Verificando menor valor
            }
            //Mostrando posições coluna 7
            for (int i = 0; i<M.length; i++) {
                if (M[i][7] == numaior) {
                    System.out.println("Maior valor da coluna 7 encontrado na linha " + i);
                }
                if (M[i][7] == numenor) {
                    System.out.println("Menor valor da coluna 7 encontrado na linha " + i);
                }
            }*/
        //03 - Capture do teclado, valores para preencimento de uma matriz M 3x3. Após criada imprima a Matriz
        //e encontre a quantidade de números pares e números ímpares
            /*int[][] M = new int[3][3];
            int totpar=0, totimpar=0;
            Scanner teclado = new Scanner(System.in);
            
            for (int i = 0; i<M.length; i++) {
                System.out.println("Linha 0" + i);
                for (int j = 0; j<M[i].length; j++) {
                    System.out.print(" Coluna 0"+j + " | Digite um valor : ");
                    M[i][j] = teclado.nextInt();
                }
            }
            System.out.println("===================");
            for (int i=0; i<M.length; i++) {
                for (int j=0; j<M[i].length; j++) {
                    System.out.print(M[i][j] + " ");
                    if (M[i][j] % 2 == 0) {
                        totpar++;
                    } else totimpar++;
                }
                System.out.println();
            }
            System.out.println("===================");
            System.out.println("Total de pares encontrados : " + totpar);
            System.out.println("Total de ímpares encontrados : " + totimpar);*/
        //04 -Faça uma matriz para armazenar os compromissos de uma agenda pessoal. Cada dia do mês deve conter
        // 24horas, e para cada uma dessas 24 horas podemos agendar um compromisso. O programa deve ter um menu
        // para indicar os dias do mês e as horas, para que o usuário consiga alterar ou consultar.
        
        
    }
}
