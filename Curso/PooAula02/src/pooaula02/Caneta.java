
package pooaula02;


public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Uma caneta : " + this.cor);
        System.out.println("Tampada? : " + this.tampada);
        System.out.println("Modelo  : "+ this.modelo);
        System.out.println("Ponta : " + this.ponta);
        System.out.println("Carga : " + this.carga);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("\033[1;31mERRO! " + this.modelo + " Está tampada\033[m");
        } else {
            System.out.println(this.modelo + " Está rabiscando!");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
