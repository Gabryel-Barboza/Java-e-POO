package pooaula12;

public class Mamifero extends Animal {
    private String corPelo;
    
    @Override
    public String locomover() {
        return " Correndo";
    }

    @Override
    public String alimentar() {
        return " Mamando";
    }

    @Override
    public String emitirSom() {
        return " Som de Mamífero";
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
