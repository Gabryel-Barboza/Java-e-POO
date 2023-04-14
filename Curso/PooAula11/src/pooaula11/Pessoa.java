package pooaula11;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public final String fazerAniver() {
        setIdade(getIdade() + 1);
        return "\033[1;33mFELIZ ANIVERSÁRIO "+ getNome().toUpperCase() + "! FELIZ " 
                + getIdade() + " ANOS!\033[m";
    }

    public String status() {
        return "Nome : " + getNome() + "\nIdade : " + getIdade() + "\nSexo: " + getSexo();
    }
    
    //Métodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

