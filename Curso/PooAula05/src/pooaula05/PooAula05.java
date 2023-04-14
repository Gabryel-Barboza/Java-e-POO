/*Criar um programa para Conta no Banco com os seguintes dados: + numConta, # tipo, - dono, - saldo, - status
+ abrir conta(), + fechar conta(), + depositar(), + sacar(), + pagarMensal(), todos atributos getter e setter.
conta corrente(cc) começa com R$50, conta poupança(cp) começa com R$150, mensalidade para cc = R$12, mensalidade
para cp = R$20, fechar conta somente se não tiver débito ou saldo. Método construtor para criar conta, definir
status como fechada(falso) e saldo R$0.
*/
package pooaula05;

import pooaula05.Utils.Utils;
import java.util.Scanner;

public class PooAula05 {
    
    public static void main(String[] args) {
        int resp;
        String tipo, conf;
        float v;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seja Bem Vindo!");
        System.out.println("=======================");
        System.out.print("Seu Nome : ");
        String nm = teclado.next();
        ContaBanco conta1 = new ContaBanco(nm);
        do { //Loop de seleção Menu
            Utils.menu(nm);
            resp = teclado.nextInt();
            System.out.println("=======================");
            switch (resp) {
                case 1 -> {   //AbrirConta
                    if (!conta1.isStatus()) { //Se a Conta estiver fechada
                        System.out.print("Qual tipo de Conta? [CC/CP] : ");
                        tipo = teclado.next().strip().toLowerCase();
                        conta1.abrirConta(tipo, nm);
                    } else {
                        System.out.printf("Você já tem uma conta aberta! : %s#%s \n"
                            , conta1.getDono(), conta1.getNumConta());
                    }
                }
                
                case 2 -> conta1.fecharConta(); //FecharConta
                
                case 3 -> {  //Depositar
                    if (conta1.isStatus()) {
                        System.out.printf("Saldo : R$%.2f\n", conta1.getSaldo());
                        System.out.print("Valor : R$");
                        v = teclado.nextFloat();
                        conta1.depositar(v);
                    } else {
                        System.out.println("Você ainda não abriu uma conta!");
                    }
                }
                
                case 4 -> {  //Sacar
                    if (conta1.isStatus()) {
                        System.out.printf("Saldo : R$%.2f\n", conta1.getSaldo());
                        System.out.print("Valor : R$");
                        v = teclado.nextFloat();
                        conta1.sacar(v);
                    } else {
                        System.out.println("Você ainda não abriu uma conta!");
                    }
                }
                
                case 5 -> { //Pagar Mensal
                    if (conta1.isStatus()) {
                        conta1.pagarMensal(conta1.getTipo());
                    } else {
                        System.out.println("Você ainda não abriu uma conta!");
                    }
                }
                
                default -> System.out.println("\033[1;31mOPÇÃO INVÁLIDA!\033[m");
            }
            System.out.print("Continuar? [S/N] : ");
            conf = teclado.next();
        } while (!"n".equals(conf));
    }
    
}
