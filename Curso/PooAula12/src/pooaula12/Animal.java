package pooaula12;

public abstract class Animal {
    private float peso;
    private int idade;
    private int membros;
    
    //métodos abstratos
    public abstract String locomover();
    public abstract String alimentar();
    public abstract String emitirSom();
    
    //métodos especiais
    public void setPeso(float p) {
        this.peso = p;
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public void setIdade(int i) {
        this.idade = i;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setMembros(int m) {
        this.membros = m;
    }
    
    public int getMembros() {
        return this.membros;
    }
}
