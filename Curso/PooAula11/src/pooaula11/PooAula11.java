package pooaula11;

public class PooAula11 {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa(); Classe abstrata
        //Classe de herança pobre
        Visitante v[] = new Visitante[4];
        v[0] = new Visitante();
        v[0].setNome("Gabryel");
        v[0].setIdade(18);
        v[0].setSexo("M");
        System.out.println("Visitante:");
        System.out.println(v[0].fazerAniver()); //Método final, não pode ser sobreposto.
        System.out.println(v[0].status()); //Método a ser sobrescrito
        //Classe de herança para diferença
        
        System.out.println("=======================");
        Aluno a[] = new Aluno[4];
        a[0] = new Aluno();
        a[0].setNome("Karynne");
        a[0].setIdade(13);
        a[0].setSexo("F");
        a[0].setMatricula(35597);
        a[0].setCurso("Enfermagem");
        System.out.println("Aluno:");
        System.out.println(a[0].status()); //Método sobrescrevendo
        System.out.println(a[0].pagarMensalidade()); //Método a ser sobrescrito
        //Subclasse de Aluno
        
        System.out.println("=======================");
        Bolsista b[] = new Bolsista[4];
        b[0] = new Bolsista();
        b[0].setNome("Kaio");
        b[0].setIdade(17);
        b[0].setSexo("M");
        b[0].setMatricula(57765);
        b[0].setCurso("Advocacia");
        b[0].setBolsa(45.5f);
        System.out.println("Bolsista:");
        System.out.println(b[0].status());
        System.out.println(b[0].pagarMensalidade()); //Método sobrescrevendo.
        //Outra subclasse de Aluno
        
        System.out.println("=======================");
        Tecnico t[] = new Tecnico[4];
        t[0] = new Tecnico();
        t[0].setNome("Brayan");
        t[0].setIdade(26);
        t[0].setSexo("M");
        t[0].setCurso("Educação Física");
        t[0].setMatricula(85543);
        t[0].setRegistroProf(1234567);
        System.out.println("Técnico:");
        System.out.println(t[0].status()); //Método sobrescrito para cada tipo de especialização
        
        System.out.println("=======================");
        Professor p[] = new Professor[4];
        p[0] = new Professor();
        p[0].setNome("Guanabara");
        p[0].setIdade(43);
        p[0].setSexo("M");
        p[0].setSalario(4500f);
        p[0].setEspecialidade("Informática");
        System.out.println("Professor:");
        System.out.println(p[0].receberAum());
        System.out.println(p[0].status()); //Método sobrescrito para cada tipo de especialização
    }
    
}
