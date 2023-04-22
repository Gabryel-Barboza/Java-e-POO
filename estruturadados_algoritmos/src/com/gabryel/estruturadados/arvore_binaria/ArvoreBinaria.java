package com.gabryel.estruturadados.arvore_binaria;
							//Extende o tipo genérico para receber métodos de comparação objeto
public class ArvoreBinaria<TIPO extends Comparable<TIPO>>{
	private Elemento<TIPO> raiz;
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public void adicionar(TIPO valor) {
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		if (raiz == null) {
			this.raiz = novoElemento;
		} else {
			Elemento<TIPO> atual = this.raiz;
			while (true) {	//Retorna -1 = menor, 0 = igual, 1 = maior
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) { //Se menor que raiz, esquerda
					if (atual.getEsquerda() != null) { //Se na esquerda já tem um valor
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novoElemento);
						break;
					}
				} else {  //Se valor maior que raiz, então vai para direita
					if (atual.getDireita() != null) {  //Se na direita já tem um valor
						atual = atual.getDireita();
					} else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
		
	}
	
	public void emOrdem(Elemento<TIPO> atual) {  //Esquerda Cima Direita
		if (atual != null) { //Se uma das direções não existir, o método não faz nada, retornando
			emOrdem(atual.getEsquerda());  //e imprimindo o valor.
			System.out.println(atual.getValor());
			emOrdem(atual.getDireita());
		}
		//Desafio: retornar um vetor com os valores, remover o print da função
	}
	
	public void preOrdem(Elemento<TIPO> atual) { //Cima Esquerda Direita
		if (atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
		}
	}
	
	public void posOrdem(Elemento<TIPO> atual) {  //Esquerda Direita Cima
		if (atual != null) {
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.println(atual.getValor());
		}
	}
	
	public Elemento<TIPO> getRaiz() {
		return raiz;
	}
	
}
