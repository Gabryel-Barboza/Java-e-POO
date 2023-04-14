package pooaula13;

public class PooAula13 {

    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c[] = new Cachorro[4];
        c[0] = new Cachorro();
        
        m.setSexo("M"); m.setIdade(5); m.setPeso(10.5f); m.setCorPelo("Caramelo"); m.setMembros(4);
        l.setSexo("F"); l.setIdade(3); l.setPeso(6.7f); l.setCorPelo("Cinza com Preto"); m.setMembros(4);
        c[0].setSexo("M"); c[0].setIdade(6); c[0].setPeso(8.5f); c[0].setCorPelo("Marrom"); m.setMembros(4);
        
        System.out.println("Mamífero:" + m.emitirSom());
        System.out.println("Lobo:" + l.emitirSom());
        //Polimorfismo de Sobrecarga
        System.out.println("Cachorro: " + c[0].reagir("pega!")); //por frase
        System.out.println(c[0].reagir(false)); //se dono
        System.out.println(c[0].reagir(4)); //por horário
        System.out.println(c[0].reagir(8, 5.5f)); //por idade e peso
        
    }
    
}
