package pooaula10;

public class PooAula10 {

    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[5];
        Aluno a[] = new Aluno[5];
        Professor P[] = new Professor[5];
        Funcionario f[] = new Funcionario[5];
        a[0] = new Aluno();
        //Métodos de Pessoa
        a[0].setNome("Gabryel");
        a[0].setIdade(19);
        a[0].setSexo("M");
        //Método de Aluno
        a[0].setCurso("ADS");
        System.out.println(a[0].status());
        System.out.println("Curso : " + a[0].getCurso());
    }
    
}
