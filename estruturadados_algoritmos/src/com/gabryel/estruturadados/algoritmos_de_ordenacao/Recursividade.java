package com.gabryel.estruturadados.algoritmos_de_ordenacao;

public class Recursividade {

	public static void main(String[] args) {
		//Necessário entender recursividade para entender Shell Sort.
		int[] vetor = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * vetor.length);
			System.out.println(vetor[i]);
		}
		
		int s = somar(0, 0, vetor);
		System.out.println("a Soma é : " + s);
	}
	
	private static int somar(int s, int posicao, int[] vetor) {
		if (posicao < vetor.length) {
			s += vetor[posicao];
			return somar(s, posicao + 1, vetor);
		} else {
			return s;
		}
			
	}

}
