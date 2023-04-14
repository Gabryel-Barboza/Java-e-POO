package pooaula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAum(float r) {
        setSalario(getSalario() + r);
        System.out.printf("O salário recebeu um aumento de %.2f e foi para %.2f\n"
                , r, getSalario());
    }
    
    //Métodos Especiais
    

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
