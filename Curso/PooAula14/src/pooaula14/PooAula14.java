package pooaula14;

public class PooAula14 {

    public static void main(String[] args) {
        Video v[] = new Video[4];
        Gafanhoto g[] = new Gafanhoto[4];
        v[0] = new Video("Poo em Java #01");
        v[1] = new Video("Poo em Java #02");
        v[2] = new Video("Poo em Java #03");
        v[3] = new Video("Poo em Java #04");
        g[0] = new Gafanhoto("Gabryel", 19, "M", "GabsBrb");
        g[1] = new Gafanhoto("Kaio", 17, "M", "Kaiothebest");
        Visualizacao vis[] = new Visualizacao[4];
        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(90f);
        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(v[0].getAvaliacao());
    }
    
}
