package com.gabryel.estruturadados.listaligada;

public class TestesInteiros {

	public static void main(String[] args) {	//Tipos de dados genéricos recebendo o tipo Integer
		ListaLigada<Integer> numeros = new ListaLigada<Integer>();
		numeros.adicionar(2);
		numeros.adicionar(1);
		numeros.adicionar(6);
		numeros.adicionar(15);
		numeros.adicionar(13);
		
		System.out.println("Tamanho: " + numeros.getTamanho());
		for(int i=0; i < numeros.getTamanho(); i++) {
			System.out.println("Número " + i + " : " + numeros.get(i).getValor());
		}
	}

}
