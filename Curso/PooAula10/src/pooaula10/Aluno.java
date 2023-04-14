package pooaula10;

public class Aluno extends Pessoa {
    private boolean matr;
    private String curso;
    
    public void cancelarMatr() {
        if (isMatr()) {
            setMatr(false);
            System.out.println("Matrícula cancelada.");
        } else {
            System.out.println("Sua matrícula não foi cadastrada.");
        }
    }
    //Métodos Especiais
   

    public boolean isMatr() {
        return matr;
    }

    public void setMatr(boolean matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
