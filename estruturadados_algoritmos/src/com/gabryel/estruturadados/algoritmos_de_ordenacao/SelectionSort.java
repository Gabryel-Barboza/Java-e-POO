package com.gabryel.estruturadados.algoritmos_de_ordenacao;

public class SelectionSort {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		
		System.out.println("Vetor Desordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		//SELECTION SORT
		//Diferentemente do Bubble Sort que troca os valores em tempo real, o Selection Sort primeiro
		//pega a primeira posição, define quem é o menor da lista,
		//após o término do loop j o valor é trocado.
		int posicaoMenor, aux;
		for (int i = 0; i < vetor.length; i++) {
			posicaoMenor = i;
			for (int j = i+1; j < vetor.length; j++) {
				if (vetor[j] < vetor[posicaoMenor]) {
					posicaoMenor = j;
				}
			}
			aux = vetor[posicaoMenor];
			vetor[posicaoMenor] = vetor[i];
			vetor[i] = aux;
		}
		
		System.out.println("\nVetor Ordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
