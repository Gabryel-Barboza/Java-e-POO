package com.gabryel.estruturadados.pilha;

public class IteratorListaLigada<TIPO> {
	private Elemento<TIPO> elemento;
	//A vantagem do iterator é que ele possibilita a lista ligada ler os valores sem precisar
	//começar do inicio tudo de novo, pois ele guarda o ultimo valor verificado e pega o próximo 
	//desse mesmo valor.
	public boolean temProximo() {
		if (elemento.getProximo() == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public Elemento<TIPO> getProximo() {
		this.elemento = elemento.getProximo();
		return elemento;
	}
	
	public IteratorListaLigada(Elemento<TIPO> atual) {
		this.elemento = atual;
	}
}
