package pooaula12;

public class Ave extends Animal{
    private String corPena;
    
    public String fazerNinho() {
        return " Criou um ninho";
    }
    
    @Override
    public String locomover() {
        return " Voando";
    }

    @Override
    public String alimentar() {
        return " Comendo Frutas";
    }

    @Override
    public String emitirSom() {
        return " Som de Ave";
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}
