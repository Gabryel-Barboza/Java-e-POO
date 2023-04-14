package pooaula12;

public class Peixe extends Animal{
    private String corEscama;
    
    public String emitirBolha() {
        return " Soltou uma bolha";
    }
    @Override
    public String locomover() {
        return " Nadando";
    }

    @Override
    public String alimentar() {
        return " Comendo Substâncias";
    }

    @Override
    public String emitirSom() {
        return " Peixe não faz som";
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
