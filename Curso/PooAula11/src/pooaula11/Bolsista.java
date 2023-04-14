package pooaula11;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public String renovarBolsa() {
        return "Bolsa de " + getNome() + "foi renovada e já está ativa!";
    }
    
    @Override
    public String pagarMensalidade() {
        return "Mensalidade paga, no valor de R$40";
    }
    
    @Override
    public String status() {
        return "Nome : " + getNome() + "\nIdade : " + getIdade() + "\nSexo : " + getSexo()
                + "\nMatrícula : #" + getMatricula() + "\nCurso : " + getCurso()
                + "\nBolsa : " + getBolsa() + "%";
    }
    
    //Métodos Especiais
    public float getBolsa() {
        return this.bolsa;
    }
    
    public void setBolsa(float b) {
        this.bolsa = b;
    }
}
