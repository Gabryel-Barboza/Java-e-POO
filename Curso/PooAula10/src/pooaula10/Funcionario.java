package pooaula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho() {
        if (isTrabalhando()) {
            System.out.println("Sua pausa acabou! Hora de trabalhar.");
        } else {
            System.out.println("Você passou para uma pausa.");
        }
        setTrabalhando(!(isTrabalhando())); //Se tiver trabalhando retorna !(true), retornando false
    }
    
    //Métodos Especiais
   

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
