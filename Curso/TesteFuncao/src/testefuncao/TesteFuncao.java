/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao;

/**
 *
 * @author gabri
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    
    /*static void soma(int a, int b) { //Static/estático funciona apenas na classe e não em instaciamentos de objeto
        int s = a + b;
        System.out.println("A soma é " + s);
    } */
    static int soma(int a, int b) {
        int s = a +b;
        return s;
    }
    
    public static void main(String[] args) {
  // Acesso livre/Sem instanciamento/Não retorna valor/É um procedimento/É um vetor de String/Recebe argumentos
        System.out.println("Começa aqui");
        System.out.println(soma(5, 2));
    }
    
}
