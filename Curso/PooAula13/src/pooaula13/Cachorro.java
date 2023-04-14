package pooaula13;

public class Cachorro extends Lobo{
    
    //Polimorfismo de Sobreposição
    @Override
    public String emitirSom() {
        return " Au! Au! Au!";
    }
    
    //Polimorfismo de Sobrecarga
    //Assinaturas por quantidade e tipos de parâmetros, a ordem dos parâmetros conta
    public String reagir(String f) {
        return switch (f) {
            case "comidinha aqui", "pega!" -> " abanando rabo " + emitirSom();
            case "vai apanhar!" -> " rosnando Rggrhhh....";
            default -> "";
        };
    }
    
    public String reagir(int h) {
        if (h > 6 && h <= 12) {
            return " abanando rabo";
        } else if (h >  12 && h < 18) {
            return " abanando rabo " + emitirSom();
        } else {
            return "";
        }
    }
    
    public String reagir(boolean d) {
        if (d) {
            return " abanando rabo";
        } else {
            return " rosnando Rggrhhh...."; 
        }
    }
    
    public String reagir(int i, float p) {
        if (i <= 7 && p <= 6.0) {
            return " abanando rabo";
        } else if(i <= 7 && p > 6.0) {
            return emitirSom();
        } else if(i > 7 && p <= 6.0) {
            return " rosnando Rggrhhh....";
        } else {
            return "";
        }
    }
}
