package com.gabryel.estruturadados.buscabinaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] vetor = new int[10000];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = i * 2;
		}
		
		//Para realizar uma busca binária, o vetor necessita estar ordenado
		//pois com uma bisca binária, o vetor será somado o primeiro e último índices e divididos por 2
		//o algoritmo então, irá verificar se esse valor é menor ou maior que o requisitado. Então os passos
		//vão se repetir até terminar o vetor ou encontrar o valor, economizando metade de um vetor para ser
		//analisado.
		
		System.out.print("Qual número deseja buscar? : ");
		Scanner scan = new Scanner(System.in);
		int buscado = scan.nextInt();
		
		int contador = 0;
		boolean achou = false;
		int inicio = 0;
		int fim = vetor.length - 1;
		int meio;
		
		while (inicio <= fim) {
			meio = (int) (inicio + fim) / 2;
			contador++; //Quantos testes será feito no final
			if (vetor[meio] == buscado) {
				achou = true;
				break;
			} else if (vetor[meio] < buscado) {
				inicio = meio + 1;
			} else { //Só pode ser maior
				fim = meio - 1;
			}
		}
		//Se o valor do vetor na posição meio for menor que o número buscado, inicio vai de 0 para
		//meio + 1 (direita)
		//mas se for maior, ele vai para esquerda do vetor (meio - 1). Caso não encontre o valor
		//inicio e fim vão ser invertidos e a condição do while vai dar false.
		
		if (achou) { //Em um vetor de 10000 posições, só 10 tentativas feitas é uma economia absurda
			System.out.println("Valor encontrado.");
			System.out.println("Após " + contador + " tentativas.");
		} else {  //Mesmo não encontrando o valor, foram só 14 testes de 10000.
			System.out.println("Valor não encontrado.");
			System.out.println("Após " + contador + " tentativas.");
		}
	}
}
