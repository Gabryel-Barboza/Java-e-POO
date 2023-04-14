
package pooaula02;


public class PooAula02 {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; Acesso Privado
        c1.carga = 100; //Acesso protegido, liberado apenas para classes usando a classe Caneta; 
        //c1.tampada = true; Acesso Privado
        c1.status();
        c1.destampar();
        c1.rabiscar();
        c1.tampar();
        c1.status();
    }
    
}
