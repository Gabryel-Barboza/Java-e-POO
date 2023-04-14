
package pooaula02;


public class PooAula02 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.carga = 100;
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "CEV";
        c2.cor = "preta";
        c2.ponta = 1f;
        c2.destampar();
        c2.carga = 85;
        c2.status();
        c2.rabiscar();
        
        Cozinhar comida = new Cozinhar();
        comida.ingrediente = "Verduras";
        comida.panela = "Vasilha";
        comida.LigarFogao();
        comida.PrepararComida();
    }
    
}
