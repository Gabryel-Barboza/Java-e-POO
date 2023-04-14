package casting.instaceof;

public class CastingInstanceof {

    public static void main(String[] args) {
        //Conversão de objetos (casting)
        //Convertendo uma subclasse para o tipo superclasse e vice-versa
        //Upcasting e Downcasting
        
        //Upcasting = transformar classe menor em uma maior
        Object p = new Pessoa("Kaio", 19, 'M');
        //Downcasting = transformar classe maior em uma menor, só funciona com mesmo tipo primitivo
        Object obj1 = "Minha String";
        String s1 = (String) obj1;  //O typecast é obrigatório para Downcasts
        
        //Instanceof
        Pessoa p1 = new Pessoa("Gabryel", 19, 'M');
        //Verificar qual tipo da variavel
        
        if (p1 instanceof Pessoa) {
            System.out.println("É da classe Pessoa!");
        }
    }
    
}
