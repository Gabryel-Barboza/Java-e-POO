package contato;

import java.util.Scanner;


public class Testes {
    /*Escreva uma classe Contato que contenha nome, telefone e um identificador.
    Esse identificador deve ser gerado automaticamente pela classe através de um contador
    e incrementado automaticamente ao criar um Contato. Crie uma classe Agenda que irá
    gerenciar os contatos. Essa classe terá os métodos para adicionar um Contato e
    consultar. Crie a classe Teste para que informe um menu ao usuário.*/
    
    /* Se o contato não existir, o programa deve lançar uma exceção de ContatoNaoExisteException
    Caso a agenda esteja cheia quando adicionar um contato, o programa deve lançar uma exceção
    AgendaCheiaException. Trate também as exceções de tipos de dados na entrada do usuário.
    */
    public static void main(String[] args) {
       String resp;
       int opcao = 0;
       Scanner scan = new Scanner(System.in);
       Agenda agenda = new Agenda();
        do {
            System.out.println("""
                               ===================
                                  Meus Contatos
                               ===================""");
            System.out.print("""
                               O que deseja fazer? :
                               [1] Consultar agenda de contatos
                               [2] Adicionar novo contato
                               [3] Sair
                               """);
            opcao = verifOpcao(scan);

            if (opcao == 1) { //Consultar agenda
                consultarContato(scan, agenda);
            } else if (opcao == 2) { //Adicionar Contato
                adicionarContato(scan, agenda);
            }
            
        } while (opcao != 3);
        
    }
    
    public static void consultarContato(Scanner scan, Agenda agenda) {
        String nomeContato = leInformacao(scan, "Insira o nome do Contato que deseja Buscar : ");
        try {
            int posicao = agenda.consultaContato(nomeContato);
            System.out.println(agenda.getContato(posicao));
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void adicionarContato(Scanner scan, Agenda agenda) {
        System.out.println("Criando um contato");
        String nome = leInformacao(scan, "Nome do Contato: ");
        String telefone = leInformacao(scan, "Telefone do Contato: ");
        String email = leInformacao(scan, "Email do Contato: ");
        
        Contato contato = new Contato(nome, telefone, email);
        System.out.println(contato);
        try {
            agenda.addContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da Agenda : ");
            System.out.println("    " + agenda);
        }
    }
    
    public static String leInformacao(Scanner scan, String msg) {
        System.out.print(msg);
        String entrada = scan.nextLine();
        return entrada;
    }
    
    public static int verifOpcao(Scanner scan) {
        int opcao = 3;
        boolean valido = false;
        do {
            try {
               String entrada = scan.nextLine();
               opcao = Integer.parseInt(entrada);

               if (opcao == 1 || opcao == 2 || opcao == 3) {
                   valido = true;
               } else  {
                   throw new Exception("\033[31mEntrada Inválida\033[m");
               }
            } catch (Exception e) {
                System.out.println("\033[31mErro no valor digitado, por favor tente novamente.\033[m\n");
            }
        } while (!(valido));
        return opcao;
    }
}
