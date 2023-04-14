package pooaula09;

public class PooAula09 {
/*
    Classe Pessoa - Atributos: nome, idade, sexo - Métodos: fazerAniver()
          | lê \/ - Agregação
         < >
    Classe Livro - Atributos: título, autor, totpaginas, pagAtual, aberto, leitor - Métodos: detalhes()
          | - Implementação
         \ /
    <<interface>> - abrir(), fechar(), folhear(), avancarPag(), voltarPag()
    */
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];
        p[0] = new Pessoa("Gabryel", "M", 19); //Nome, Sexo, Idade
        //Livro, Autor, totPáginas, Leitor
        l[0] = new Livro("Os Contos de Fadas", "Severino Bragança", 52, p[0]); 
        l[0].detalhes();
        l[0].abrir();
        l[0].folhear();
        l[0].ler();
    }
    
}
