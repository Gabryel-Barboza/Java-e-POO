
package pooaula02;


public class Cozinhar {
    String panela;
    String ingrediente;
    boolean gas;
    boolean fogao;
    
    void LigarFogao() {
        this.gas = true;
        this.fogao = true;
    }
    void PrepararComida() {
        System.out.println("Vamos conferir");
        if (this.gas == true && this.fogao == true) {
            if (this.panela == null | this.ingrediente == null) {
                System.out.println("Me falta os ingredientes ou a panela para começar!");
            } else {
                System.out.println("Cozinhando um prato delicioso!");
            }
        }
    }
}
