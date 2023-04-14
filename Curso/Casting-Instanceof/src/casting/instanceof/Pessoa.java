package casting.instaceof;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
    public String fazerAniv() {
        setIdade(getIdade() + 1);
        return getNome() + " está fazendo aniversário! E agora têm " + getIdade() + " anos";
    }
    
    public static String saudacao() {
        return "Olá, tudo bem?";
    }
    
    //Métodos Especiais
    
    public Pessoa(String n, int i, char s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }
    
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
