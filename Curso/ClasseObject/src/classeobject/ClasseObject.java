package classeobject;

public class ClasseObject {

    public static void main(String[] args) {
        //Toda classe, ao ser criada vai herdar suas características da classe mãe Object
        //Como é o caso do método toString()
        Pessoa[] p = new Pessoa[3];
        p[0] = new Pessoa("Gabryel", 19, 'M');
        p[1] = new Pessoa("Gabryel", 19, 'M');
        //Por que a comparação entre objetos de valores iguais dá false?
        System.out.println(p[0].equals(p[1]));
        //Isso porque, ao comparar os dois, ele está comparando a referência na memória de cada um.
        //Nesse caso, serão ref. diferentes.
        System.out.println(p[0].toString().equals(p[1].toString()));
        System.out.println(p[0]);
    }
    
}
