package pooaula09;

public class Pessoa {
    private String nome, sexo;
    private int idade;
    //Métodos 
    public void fazerAniver() {
        System.out.println("""
                           \033[1;33mPARABÉNS PRA VOCÊ. NESSA DATA QUERIDA!
                           MUITAS FELICIDADES. MUITOS ANOS DE VIDA!\033[m""");
        setIdade(getIdade() + 1);
        System.out.println("FELIZ " + getIdade() + " ANOS!");
    }
    //Métodos Especiais
    public Pessoa(String n, String s, int i) {
        this.nome = n;
        this.sexo = s;
        this.idade = i;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade(int i) {
        this.idade = i;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setSexo(String s) {
        this.sexo = s;
    }
    
    public String getSexo() {
        return this.sexo;
    }
}
