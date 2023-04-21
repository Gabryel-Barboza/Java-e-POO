package com.gabryel.estruturadados.listaligada;


//Aprendendo como funciona uma lista ligada em java, criando uma do zero.
public class ListaLigada<TIPO> { //TIPO vai receber os tipos de dados na instância, <variavel> referencia o generics type
	private Elemento<TIPO> primeiro;
	private Elemento<TIPO> ultimo;
	private int tamanho;
	
	public void adicionar(TIPO valor) {
		//Se a lista estiver vazia, o primeiro e ultimo recebem o elemento
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else { 	//Caso contrário, a partir do último se cria um próximo elemento.
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		
		this.tamanho++;
	}
						//TIPO é o tipo do valor genérico
	public void remover(TIPO valorProcurado) {
		Elemento<TIPO> anterior = null; //Começa vazio.
		Elemento<TIPO> atual = this.primeiro;
		for (int i = 0; i < this.getTamanho(); i++) {
			//Se o valorProcurado igual ao valor de atual
			if (atual.getValor().equals(valorProcurado)) {
				if (this.tamanho == 1) { //Se só tiver 1 elemento na lista para remover.
					this.primeiro = null;
					this.ultimo = null;
				} else if (atual == primeiro) { 				//Se remover o primeiro, o proximo tem que se tornar o novo primeiro
					this.primeiro = atual.getProximo();
					atual.setProximo(null);
				} else if(atual == ultimo) { 				   //Se remover o ultimo, então o anterior tem que virar o ultimo e perder o próximo
					this.ultimo = anterior;
					anterior.setProximo(null); 				  //O valor de atual que estava ligado ao proximo de anterior deixa de existir
				} else {
					anterior.setProximo(atual.getProximo()); //Valor próximo de anterior vai receber o próximo do atual.
					atual = null; 							//O atual vai deixar de existir, e a lista ligada vai continuar na ordem correta.
				}
				this.tamanho--;
				break;
			}
			anterior = atual; //Pegar o valor de atual, antes de atual passar para o próximo.
			atual = atual.getProximo();
		}
		
	}
	
	public Elemento<TIPO> get(int posicao) {
		//Fazendo a iteração em uma lista encadeada
		//Começando pelo começo, pelo primeiro.
		
		Elemento<TIPO> atual = this.primeiro;
		
		//Variável i vai retornar a posição do elemento.
		
		for(int i = 0; i < posicao; i++) { 
		//Na comparação, i tem que ser menor que a posição, caso contrário, ao chegar na posição ele irá pular para próxima
		//e finalizar o loop com o valor da posição errada.
			
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}
	
	public IteratorListaLigada<TIPO> getIterator() {
		return new IteratorListaLigada<TIPO>(this.primeiro);
	}
	
	public ListaLigada() {
		this.tamanho = 0;
	}
	
	public Elemento<TIPO> getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento<TIPO> primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento<TIPO> getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento<TIPO> ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
}
