package pooaula12;

public class PooAula12 {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro C = new Cachorro();
        //Mamífero
        m.setMembros(4); m.setPeso(5.2f); m.setIdade(3); m.setCorPelo("Marrom");
        //Réptil
        r.setMembros(0); r.setPeso(3.7f); r.setIdade(1); r.setCorEscama("Verde");
        //Peixe
        p.setMembros(0); p.setPeso(3f); p.setIdade(5); p.setCorEscama("Azul");
        //Ave
        a.setMembros(2); a.setPeso(5.4f); a.setIdade(6); a.setCorPena("Preto");
        //Canguru
        c.setMembros(4); c.setPeso(55.4f); c.setIdade(10); c.setCorPelo("Caramelo");
        //Cachorro
        C.setMembros(4); C.setPeso(8.4f); C.setIdade(4); C.setCorPelo("Marrom");
        
        System.out.println("Mamífero " + m.locomover() + m.alimentar() + m.emitirSom());
        
        System.out.println("Réptil " + r.locomover() + r.alimentar() + r.emitirSom());
        
        System.out.println("Peixe " + p.locomover() + p.alimentar() + 
                p.emitirSom() + p.emitirBolha());
        
        System.out.println("Ave " + a.locomover() + a.alimentar() + 
                a.emitirSom() + a.fazerNinho());
        
        System.out.println("Canguru " + c.locomover() + c.alimentar() + 
                c.emitirSom() + c.usarBolsa());
        
        System.out.println("Cachorro " + C.locomover() + C.alimentar() + 
                C.emitirSom() + C.abanarRabo() + C.enterrarOsso());
    }
    
}
