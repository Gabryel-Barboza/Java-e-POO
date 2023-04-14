
package pooaula02;


public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Uma caneta : " + this.cor);
        System.out.println("Tampada? : " + this.tampada);
        System.out.println("Modelo  : "+ this.modelo);
        System.out.println("Ponta : " + this.ponta);
        System.out.println("Carga : " + this.carga);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("\033[1;31mERRO! " + this.modelo + " Está tampada\033[m");
        } else {
            System.out.println(this.modelo + " Está rabiscando!");
        }
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
