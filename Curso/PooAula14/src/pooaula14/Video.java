package pooaula14;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    @Override
    public String toString() {
        return "Titúlo: " + getTitulo() + "\nAvaliação: " + getAvaliacao() 
                + "\nViews: " + getViews() + "\nCurtidas: " + getCurtidas() 
                + "\nReproduzindo: " + isReproduzindo();
    }
    
    @Override
    public void play() {
        if (isReproduzindo()) {
            System.out.println("Já está reproduzindo.");
        } else {
            setReproduzindo(true);
        }
    }
    
    @Override 
    public void pause() {
        if (isReproduzindo()) {
            setReproduzindo(false);
        } else {
            System.out.println("Já está pausado.");
        }
    }
    
    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }
    
    //Métodos Especiais
    public Video(String t) {
        this.titulo = t;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliação) {
        this.avaliacao = (this.avaliacao + avaliação) / this.views;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
}
