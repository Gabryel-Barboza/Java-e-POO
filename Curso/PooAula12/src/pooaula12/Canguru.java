package pooaula12;

public class Canguru extends Mamifero{
    
    public String usarBolsa() {
        return " Olhando sua bolsa";
    }    
    
    @Override
    public String locomover() {
        return " Saltando";
    }
    
    @Override
    public String alimentar() {
        return " Comendo Frutas";
    }
    
    @Override
    public String emitirSom() {
        return " Som de Canguru";
    } 
}
