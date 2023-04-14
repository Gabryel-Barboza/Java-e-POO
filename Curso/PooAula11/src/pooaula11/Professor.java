package pooaula11;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public String receberAum() {
        setSalario(getSalario() + (float)(getSalario() * 0.10)); //Salário + 10% dele
        return "Aumento salarial recebido, de 10%";
    }
    
    @Override
    public String status() {
        return "Nome : " + getNome() + "\nIdade : " + getIdade() + "\nSexo: " + getSexo()
                + "\nEspecialidade : " + getEspecialidade() + "\nSalário : R$" + getSalario();
    }
    
    //Métodos Especiais
    public String getEspecialidade() {
        return this.especialidade;
    }
    
    public void setEspecialidade(String e) {
        this.especialidade = e;
    }
    
    public float getSalario() {
        return this.salario;
    }
    
    public void setSalario(float s) {
        this.salario = s;
    }
}
