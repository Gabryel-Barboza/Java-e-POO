package com.gabryel.estruturadados.listaligada;

public class Testes {
	
	public static void main(String[] args) {	//Colocar algum tipo de dados como parâmetro do generics type
		ListaLigada<String> lista = new ListaLigada<String>();
		//Ao instanciar uma lista, ela por padrão estará vazia
		System.out.println("Tamanho: " + lista.getTamanho());
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		System.out.println("Tamanho: " + lista.getTamanho());
		//Buscando por um elemento, retorna o elemento daquela posição então é necessário pegar o valor daquele elemento
		System.out.println("Primeiro da Lista: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo da Lista: " + lista.getUltimo().getValor());
		
		//Iterando a lista encadeada em busca de um valor
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
		
		//Removendo um valor da lista.
		//lista.remover("CE"); 		//Removendo do meio
		//lista.remover("AC"); 		//Removendo Primeiro, para remover não pode ter um anterior
		lista.remover("DF");   		//Removendo Último, para remover o anterior tem que virar o ultimo
		System.out.println("Estado DF removido!");
		lista.adicionar("SP");
		System.out.println("Estado SP Adicionado");
		System.out.println("Tamanho: " + lista.getTamanho());
		
		for(int i=0; i < lista.getTamanho(); i++) {
			System.out.println("Estado: " + lista.get(i).getValor());
		}
		
		//Removendo tudo da lista
		lista.remover("BA");
		lista.remover("CE");
		lista.remover("AC");
		lista.remover("SP");
		System.out.println("Tamanho: " + lista.getTamanho());
		
		for(int i=0; i < lista.getTamanho(); i++) {
			System.out.println("Estado: " + lista.get(i).getValor());
		}
		
	}
}
