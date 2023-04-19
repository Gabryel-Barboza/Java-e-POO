package com.gabryel.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adiciona(String elemento) { for (int i = 0; i<elementos.length;
	 * i++) { if (this.elementos[i] == null) { this.elementos[i] = elemento; break;
	 * } }
	 * 
	 * }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception { if (this.tamanho <
	 * this.elementos.length) { this.elementos[this.tamanho] = elemento;
	 * this.tamanho++; } else { throw new
	 * Exception("\033[31mVetor já está cheio, não é possível adicionar mais elementos\033[m"
	 * ); } }
	 */
	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
}
