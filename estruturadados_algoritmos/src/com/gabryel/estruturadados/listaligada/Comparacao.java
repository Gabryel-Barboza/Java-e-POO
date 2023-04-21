package com.gabryel.estruturadados.listaligada;

import java.util.ArrayList;

public class Comparacao {

	public static void main(String[] args) {
		ListaLigada<Integer> lista1 = new ListaLigada<Integer>();
		ArrayList<Integer> vetor = new ArrayList<>();
		
		//Adicionar elementos
		//Comparando as 2 por tempo
		
		//Vale notar que tempo não é a melhor forma de comparação, pois varia por máquina
		//mas vai servir por enquanto.
		
		//Vetor
		int limite = 10000;
		long tempoInicial = System.currentTimeMillis();
		long tempoFinal;
		for (int i=0; i < limite; i++) {
			vetor.add(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Adicionou " + limite + " elementos no vetor");
		System.out.println("Vetor: " + (tempoFinal - tempoInicial) + "ms");
		
		//Lista Ligada
		tempoInicial = System.currentTimeMillis();
		for (int i=0; i < limite; i++) {
			lista1.adicionar(i);
		}
		
		tempoFinal = System.currentTimeMillis();
		System.out.println("\nAdicionou " + limite + " elementos na lista ligada");
		System.out.println("Lista Ligada: " + (tempoFinal - tempoInicial) + "ms");
		//Com isso, podemos perceber que a lista ligada é mais demorada para terminar o processo, isso 
		//levando em conta que a classe utilizada foi feita do zero, mas também porque a lista ligada
		//relaciona objetos entre eles na memória.
		
		System.out.println("\nLendo Valores\n");
		
		//Vetor
		tempoInicial = System.currentTimeMillis();
		for (int i=0; i < vetor.size(); i++) {
			vetor.get(i);
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Vetor: " + (tempoFinal - tempoInicial) + "ms");
		
		//Lista Ligada
		tempoInicial = System.currentTimeMillis();
		for (int i=0; i < lista1.getTamanho(); i++) {
			lista1.get(i);
		}
		
		tempoFinal = System.currentTimeMillis();
		System.out.println("Lista Ligada: " + (tempoFinal - tempoInicial) + "ms");
		//Com os testes, a lista ligada só consegue ler os valores , num tempo rasoável, caso sejam 1000-
		//Maior que isso já demora demais! Mas isso se deve ao fato da lista ler elemento por elemento até
		//chegar no valor requisitado, por isso a lista não pode ser lida com um for padrão,
		//mas sim usando um Iterator do Java.
		
		
		//Fazendo a leitura com um Iterator
		tempoInicial = System.currentTimeMillis();
		IteratorListaLigada<Integer> iterator = lista1.getIterator();
		
		//Veja a classe IteratorListaLigada
		while (iterator.temProximo()) {
			iterator.getProximo();
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("Lista Ligada com Iterator: " + (tempoFinal - tempoInicial) + "ms");
		//Tempo extremamente menor com o uso do iterator.
	}

}
