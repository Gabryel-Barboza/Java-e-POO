package pooaula11;

public class Tecnico extends Aluno{
    private int registroProfissional;
    
    public String praticar() {
        return "Exercitando...";
    }
    
    @Override
    public String status() {
        return "Nome : " + getNome() + "\nIdade : " + getIdade() + "\nSexo : " + getSexo()
                + "\nMatrícula : #" + getMatricula() + "\nCurso : " + getCurso()
                + "\nRegistro Profissional : " + getRegistroProf();
    }
    
    //Métodos Especiais
    public void setRegistroProf(int r) {
        this.registroProfissional = r;
    }
    
    public int getRegistroProf() {
        return this.registroProfissional;
    }
}
