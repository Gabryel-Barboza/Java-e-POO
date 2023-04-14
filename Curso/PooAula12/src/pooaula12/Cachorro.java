package pooaula12;

public class Cachorro extends Mamifero{
    
    public String enterrarOsso() {
        return " Enterrando Osso";
    }
    
    public String abanarRabo() {
        return " Abanando Rabo";
    }
    @Override
    public String alimentar() {
        return " Comendo Ração";
    }
    
    @Override
    public String emitirSom() {
        return " Au! Au! Au!";
    } 
}
