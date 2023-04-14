package pooaula13;

public class Mamifero extends Animal{
    private String corPelo;
    
    @Override
    public String emitirSom() {
        return " Som de Mamífero";
    }

    //Métodos Especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
