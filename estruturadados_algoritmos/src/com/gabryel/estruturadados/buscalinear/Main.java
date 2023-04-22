package com.gabryel.estruturadados.buscalinear;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Como funciona uma busca linear?
		int[] vetor = new int[8];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * 10);
			System.out.println(vetor[i]);
		}
		
		//Dentro de uma variável composta, ao buscar por um valor específico
		//o procedimento padrão é testar todas as posições até ser encontrado o valor buscado.
		//esse procedimento é chamado de busca linear/sequencial
		System.out.print("Qual número deseja buscar? : ");
		Scanner leitor = new Scanner(System.in);
		int buscarN = leitor.nextInt();
		boolean achou = false;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == buscarN) {
				achou = true;
				break;
			}
		}
		//A desvantagem de uma busca linear é que, conforme o tamanho do vetor aumenta a quantidade de
		//passos necessários para buscar um valor também aumenta. 
		//Então temos o tamanho em função dos passos ou uma notação O(N).
		if (achou) {
			System.out.println("Valor encontrado");
		} else {
			System.out.println("Valor não foi encontrado");
		}
	}

}
