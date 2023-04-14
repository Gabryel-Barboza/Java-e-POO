package pooaula10;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    //Métodos
    
    public void fazerAniver() {
        setIdade(getIdade() + 1);
        System.out.printf("\033[1;33mFeliz Aniversário! Feliz %s anos!\033[m\n"
                , getIdade());
    }
    public String status() {
        return("Nome: " + getNome() + " " + "\nIdade: " + getIdade() + " " + 
                "\nSexo: " + getSexo());
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
