package com.gabryel.estruturadados.algoritmos_de_ordenacao;

public class BubbleSort {

	public static void main(String[] args) {
		int[] vetor = new int[100];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}

		// BUBBLE SORT O(N^2)
		//Comparando o primeiro valor do vetor com todos os outros
		//caso um seja menor que o primeiro, trocam-se as posições
		//deixando o vetor na ordem crescente, menores do lado esquerdo e maiores do lado direito.
		int aux;
		long tInicio = System.currentTimeMillis();
		for (int i = 0; i < vetor.length; i++) { //O(N)
			for (int j = i+1; j < vetor.length; j++) { //O(N)
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		long tFinal = System.currentTimeMillis();
		System.out.println("Tempo : " + (tFinal - tInicio) + "ms");
		System.out.println("Vetor Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}
}
