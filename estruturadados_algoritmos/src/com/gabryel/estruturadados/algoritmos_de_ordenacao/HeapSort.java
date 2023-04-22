package com.gabryel.estruturadados.algoritmos_de_ordenacao;

public class HeapSort {

	public static void main(String[] args) {
		int[] vetor = new int[100];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.print(vetor[i] + " ");
		}
		//HEAP SORT
		//Refere-se a uma árvore binária, onde possui uma raíz e suas filhas, isso vai até chegar nas
		//folhas(estéril), os pais vão possuir o maior valor, se estiver ordenado a direita, a esquerda
		//recebe o menor valor entre as filhas e direita o maior somente entre as filhas. Isso se aplica
		//a todos os ramos da árvore binária. Caso passe um heap novamente, se as filhas tiverem valores maiores
		//que os pais, elas vão trocar seus valores com os pais.
		
		int n = vetor.length;
		//Representando um vetor como árvore: índice i e seus filhos: 2i + 1, 2i + 2;
		for (int i = n / 2 - 1; i >= 0; i--) {
			aplicarHeap(vetor, n, i);
		}
		System.out.println("\nQuase Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		for( int i = n-1; i > 0; i--) {
			int aux = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = aux;
			
			aplicarHeap(vetor, i, 0);
		}
		
		System.out.println("\nVetor Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	
	private static void aplicarHeap(int[] vetor, int tamanhoV, int i) {
		int raiz = i; //Elemento inicial
		int esquerda = 2*i+1;  //Posição das filhas
		int direita = 2*i+2;
		
		if(esquerda < tamanhoV && vetor[esquerda] > vetor[raiz]) {  //Se índice dentro do vetor e vetor maior que a raiz
			raiz = esquerda;
		}
		
		if (direita < tamanhoV && vetor[direita] > vetor[raiz]) {
			raiz = direita;
		}
		
		if (raiz != i) {  //Se houve alteração de raiz, troca as posições no vetor
			int aux = vetor[i];
			vetor[i] = vetor[raiz];
			vetor[raiz] = aux;
			
			aplicarHeap(vetor, tamanhoV, raiz);
		}
	}

}
