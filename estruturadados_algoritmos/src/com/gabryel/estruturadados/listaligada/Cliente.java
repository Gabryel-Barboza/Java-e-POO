package com.gabryel.estruturadados.listaligada;

public class Cliente {
	private String cpf;
	private String nome;
	
	public Cliente(String novoCpf, String novoNome) {
		this.cpf = novoCpf;
		this.nome = novoNome;
	}
	
	@Override
	public String toString() {
		return String.format("Cliente {CPF: %s, NOME: %s", cpf, nome);
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
