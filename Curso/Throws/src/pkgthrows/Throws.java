package pkgthrows;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Throws {

    public static void main(String[] args) {
        //Caso a máquina esteja configurada como pt-br, no Java vai ser utilizado como identificador de número
        //flutuante o "," e não o "."
        System.out.print("Entre com um número decimal : ");
        try {
            double num = leNumero();
            System.out.println("Você digitou " + num);
        } catch (Exception ex) {
            System.out.println("Entrada inválida");
            ex.printStackTrace();
        }
    }
    //Ao usar a palavra-chave throws, estamos passando a responsabilidade do tratamento de erros
    //Então onde for utilizar esse método que terá o tratamento do erro
    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}
