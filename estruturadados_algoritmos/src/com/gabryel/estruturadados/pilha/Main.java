package com.gabryel.estruturadados.pilha;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Pilhas<String> pilha = new Pilhas<String>();
		pilha.adicionar("E");
		pilha.adicionar("D");
		pilha.adicionar("C");
		pilha.adicionar("B");
		pilha.adicionar("A");
		
		System.out.println("TOPO: " + pilha.get());
		pilha.remover();
		System.out.println("TOPO: " + pilha.get());
		
		
		Stack<String> pilha2 = new Stack<String>();
		pilha2.push("A");
		System.out.println(pilha2.pop());
	}

}
