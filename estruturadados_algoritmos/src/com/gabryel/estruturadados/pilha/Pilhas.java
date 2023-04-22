package com.gabryel.estruturadados.pilha;

public class Pilhas<TIPO> {
	private ListaLigada<TIPO> lista;
	
	public Pilhas() {
		this.lista = new ListaLigada<TIPO>();
	}
	
	public void adicionar(TIPO novoValor) {
		this.lista.adicionarComeco(novoValor);
	}
	
	public void remover() {
		this.lista.remover(this.get());
	}
	
	public TIPO get() {
		return this.lista.getPrimeiro().getValor();
	}
}
