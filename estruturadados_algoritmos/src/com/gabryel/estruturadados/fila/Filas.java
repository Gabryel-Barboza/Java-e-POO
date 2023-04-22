package com.gabryel.estruturadados.fila;

public class Filas<TIPO> {
	//Pode ser usado um vetor, porém é mais complicado para redimensionar
	//Uma fila sempre vai ter o primeiro, saiu o primeiro irá entrar outro.
	private ListaLigada<TIPO> lista;
	
	public Filas() {
		this.lista = new ListaLigada<TIPO>();
	}
	public void adicionar(TIPO novoValor) {
		this.lista.adicionar(novoValor);
	}
	
	public void remover() {
		this.lista.remover(this.get());
	}
	
	public TIPO get() {
		return this.lista.getPrimeiro().getValor();
	}
}
