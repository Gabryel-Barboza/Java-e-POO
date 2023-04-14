package pooaula14;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    public void avaliar() {
        getFilme().setAvaliacao(5);
    }
    
    public void avaliar(int n) {
        getFilme().setAvaliacao(n);
    } 
    
    public void avaliar(float por) {
        int p;
        if (por <= 20) {
            p = 2;
        } else if (por <= 50) {
            p = 5;
        } else if (por <= 90) {
            p = 8;
        } else {
            p  = 10;
        }
        getFilme().setAvaliacao(p);
    }

    @Override
    public String toString() {
        return "Visualizacao{\n" + "espectador=" + espectador + "\nFilme={\n" + filme + '}';
    }

    //Métodos Especiais
    public Visualizacao(Gafanhoto e, Video f) {
        this.espectador = e;
        this.filme = f;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
}
