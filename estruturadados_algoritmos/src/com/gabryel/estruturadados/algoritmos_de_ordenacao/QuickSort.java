package com.gabryel.estruturadados.algoritmos_de_ordenacao;


public class QuickSort {

	public static void main(String[] args) {
		int[] vetor = new int[100];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}
		//QUICK SORT
		//O Quick Sort irá selecionar um pivô, de forma aleatória, e dos lados esquerdo e direito
		//irá fazer seleções aleatórias de pivô, após isso começará comparações recursivas entre pivôs
		//e no final será feito um loop para organizar o restante.
		
		quicksort(vetor, 0, vetor.length - 1);
		System.out.println("Vetor Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
	
	static void quicksort(int[] vetor, int esquerda, int direita) {
		if (esquerda < direita) {
			int p = particao(vetor, esquerda, direita); //pivô
			quicksort(vetor, esquerda, p);
			quicksort(vetor, p + 1, direita);
		}
	}
	
	static int particao(int[] vetor, int esquerda, int direita) {
		int meio = (int) ((esquerda + direita) / 2);
		int pivot = vetor[meio];
		int i = esquerda - 1;
		int j = direita + 1;
		while(true) {
			do {
				i++;
			} while (vetor[i] < pivot);
			
			do {
				j--;
			} while (vetor[j] > pivot);
			
			if (i >= j) {
				return j;
			}
			
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
	}
}
