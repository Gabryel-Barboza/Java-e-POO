package pooaula11;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public String pagarMensalidade() {
        return "Mensalidade paga, no valor de R$50";
    }
    
    @Override
    public String status() {
        return "Nome : " + getNome() + "\nIdade : " + getIdade() + "\nSexo : " + getSexo()
                + "\nMatrícula : #" + getMatricula() + "\nCurso : " + getCurso();
    }
    //Métodos Especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
