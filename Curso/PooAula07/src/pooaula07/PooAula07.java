package pooaula07;

public class PooAula07 {
/*Regras : A luta só pode ser marcada entre lutadores de mesma categoria.
     Desafiado e desafiante devem ser lutadores diferentes.
     Só pode acontecer se estiver aprovada.
     Só pode ter como resultado a vitória de um do lutadores ou o empate.*/
    public static void main(String[] args) {
        Lutador p[] = new Lutador[6];  //Nome, nacionalidade, idade, altura, peso, vitórias, derrotas, empates
        p[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
        p[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        p[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        p[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        p[4] = new Lutador("UFOcobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        p[5] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        //Ultra Emoji Combat
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(p[0], p[1]);
        UEC01.luta();
    }
    
}
