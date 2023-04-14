package pooaula12;

public class Reptil extends Animal{
    private String corEscama;
    
    @Override
    public String locomover() {
        return " Rastejando";
    }

    @Override
    public String alimentar() {
        return " Comendo Vegetais";
    }

    @Override
    public String emitirSom() {
        return " Som de Réptil";
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
