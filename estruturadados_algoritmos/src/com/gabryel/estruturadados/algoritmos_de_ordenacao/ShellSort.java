package com.gabryel.estruturadados.algoritmos_de_ordenacao;

public class ShellSort {

	public static void main(String[] args) {
		int[] vetor = new int[100];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}
		
		//SHELL SORT - tentar entender melhor
		//Esse algoritmo funciona de uma forma com uma fórmula que não foi explicada matemáticamente,
		//mas é um algoritmo eficiente. O algoritmo irá ordenar o vetor fazendo pulos entre 
		//posições e considerando apenas dois valores, então novamente é feito pulos só que menores,
		//no final o algoritmo funciona como um Insertion Sort.
		
		int h = 1;
		int n = vetor.length;
		while(h < n) {
			h = h * 3 + 1;
		}
		h = (int) Math.floor(h / 3);
		
		int elemento, j;
		while(h > 0) {
			for (int i = h; i < n; i++) {
				elemento = vetor[i];
				j = i;
				while(j >= h && vetor[j - h] > elemento) {
					vetor[j] = vetor[j - h];
					j = j - h;
				}
				vetor[j] = elemento;
			}
			h = h / 2;
		}
		
		System.out.println("Vetor Ordenado");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
