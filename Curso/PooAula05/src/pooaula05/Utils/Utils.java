
package pooaula05.Utils;

public class Utils {
        public static void menu(String nm) {
        System.out.println("""
                           =======================
                               CONTA NO BANCO
                           =======================
                               """);
            System.out.printf("\033[1;31mOlá, %s \033[m\n", nm);
        System.out.print("""
                           =======================
                           O que deseja fazer? 
                           [1] Abrir Conta 
                           [2] Fechar Conta
                           [3] Depositar
                           [4] Sacar
                           [5] Pagar Mensalidade
                           : """);
    }
}
