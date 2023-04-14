
package pooaula04;


public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    public Caneta(String m, String c, float p) { //Construtor
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampada = true; //ALT + INSERT gerar automático 
    }
    
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void status() {
        System.out.println("Informações Caneta");
        System.out.println("Modelo : " + getModelo());
        System.out.println("Ponta : " + getPonta());
        System.out.println("Cor : " + getCor());
        System.out.println("Tampada? : " + this.tampada);
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public String getCor() {
        return this.cor;
    }
}
