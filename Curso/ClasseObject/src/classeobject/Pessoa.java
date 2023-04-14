package classeobject;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
    
    public String fazerAniv() {
        setIdade(getIdade() + 1);
        return getNome() + " fez aniversário! E agora está com " + getIdade() + " anos";
    }
    
    @Override
    public String toString() {
        return getNome() + "\n" + getIdade() + "\n" + getSexo();
    }
    
    //É possível sobrescrever o método equals de uma classe, que foi herdado da Object
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }
    
    
    //Métodos Especiais
    public Pessoa(String n, int i, char s) {
    this.nome = n;
    this.idade = i;
    this.sexo = s;
}
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String n) {
        this.nome = n;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int i) {
        this.idade = i;
    }
    
    public char getSexo() {
        return this.sexo;
    }
    
    public void setSexo(char s) {
        this.sexo = s;
    }
}
