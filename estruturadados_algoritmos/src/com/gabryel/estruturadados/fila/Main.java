package com.gabryel.estruturadados.fila;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Filas<String> fila = new Filas<String>();
		
		fila.adicionar("João");
		fila.adicionar("Zé");
		fila.adicionar("Juca");
		fila.adicionar("Maria");
		fila.adicionar("Ana");
		
		System.out.println("Primeiro da fila: " + fila.get());
		fila.remover();
		System.out.println("Primeiro da fila: " + fila.get());
		fila.remover();
		System.out.println("Primeiro da fila: " + fila.get());
		
		Filas<Integer> filaN = new Filas<Integer>();
		
		System.out.println("Fila dos Números : ");
		filaN.adicionar(2);
		filaN.adicionar(7);
		filaN.adicionar(3);
		filaN.adicionar(9);
		System.out.println("Primeiro da fila: " + filaN.get());
		filaN.remover();
		System.out.println("Primeiro da fila: " + filaN.get());
		
		Queue<String> fila2 = new PriorityQueue<>();
	}

}
