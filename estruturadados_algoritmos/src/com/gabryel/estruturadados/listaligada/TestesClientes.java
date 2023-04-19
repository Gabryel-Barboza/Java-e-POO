package com.gabryel.estruturadados.listaligada;

public class TestesClientes {

	public static void main(String[] args) {
		ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();
		clientes.adicionar(new Cliente("123", "Kaio"));
		clientes.adicionar(new Cliente("125", "Zé"));
		clientes.adicionar(new Cliente("124", "Brayan"));
		
		System.out.println("Tamanho: " + clientes.getTamanho());
		for (int i = 0; i < clientes.getTamanho(); i++) {
			System.out.println((i+1) + "º Cliente: " + clientes.get(i).getValor());
		}
	}

}
