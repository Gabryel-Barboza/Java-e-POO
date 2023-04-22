package com.gabryel.estruturadados.algoritmos_de_ordenacao;

public class InsertionSort {

	public static void main(String[] args) {
		int[] vetor = new int[1000];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
		}
		
		
		//INSERTION SORT
		//O insertion sort irá fazer uma busca contrária, comparando os valores no caminho contrário.
		int aux, j;
		for (int i = 1; i < vetor.length; i++) {
			aux = vetor[i];
			j = i-1;
			//Faz o teste, se j maior ou igual a 0 e se o valor de vetor[j] for maior que o aux.
			while (j >= 0 && vetor[j] > aux) { //j vai de i-1 até 0, se o valor do vetor na posição j
				vetor[j+1] = vetor[j];		  //for maior  que o aux, então joga o valor na posição acima
				j--;
			}
			vetor[j+1] = aux; 		//O vetor[0] recebe o aux, caso nenhum acima seja menor que aux.
									//Nesse momento j == -1, por isso j + 1.
		}
		
		for (int i=0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
