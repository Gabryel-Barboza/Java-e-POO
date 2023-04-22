package com.gabryel.estruturadados.fila;

public class Elemento<TIPO> {
	//Elemento em uma Lista Ligada, também chamado de Nó/Node.
	private TIPO valor;
	private Elemento<TIPO> proximo;
	//Cada elemento na lista só possui seu valor e a quem é o proximo a ele.
	
	
	public Elemento(TIPO valor) {
		this.valor = valor;
	}
	
	public TIPO getValor() {
		return valor;
	}
	
	public void setValor(TIPO v) {
		this.valor = v;
	}
	
	public Elemento<TIPO> getProximo() {
		return proximo;
	}
	
	public void setProximo(Elemento<TIPO> p) {
		this.proximo = p;
	}
	
}
