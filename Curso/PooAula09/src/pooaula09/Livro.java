package pooaula09;

import java.util.Scanner;

public class Livro implements Publicacao {
    private String titulo, autor, leitorn;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    public void detalhes() {
        System.out.printf("""
                          %s está vendo o livro '%s' de %s.
                          O livro está %s. \n""", this.leitorn, getTitulo(),
                          getAutor(), isAberto()?"aberto":"fechado");
    }
    //Métodos abstratos
    @Override
    public void abrir() {
        if (isAberto()) { //Está aberto?
            System.out.println("O livro já está aberto...");
        } else {   
            setAberto(true);
            Scanner sc = new Scanner(System.in);
            System.out.println("==============================");
            System.out.printf("%s abre o livro.\n", this.leitorn);
            System.out.printf("Começar a ler? [S/N] : ");
            char resp = sc.next().strip().charAt(0); //Se resp for sim, começar a ler
            switch (resp) {
                case 's' -> {
                    System.out.printf("%s começa a ler.\n", this.leitorn);
                    ler();
                    break;
                }
                default -> System.out.printf("%s fica parado observando o livro.\n", this.leitorn);
            }
        }
    }

    @Override
    public void fechar() {
        if (isAberto()) {
            setAberto(false);
            System.out.println("==============================");
            System.out.printf("%s fecha o livro.\n", this.leitorn);
        } else {
            System.out.println("O livro já está fechado...");
        }
    }
    
    @Override
    public void ler(){
        if (isAberto()) {
            int pag;
            int resp = pararLer() - 1;
            if (resp == -1) { //Sistema para fechar loop
                avancarPag();
            } else {
                try { //Enquanto a pagina atual for menor do que a quantidade escolhida para ler
                    do {  
                        pag = getPagAtual();
                        Thread.sleep(2000);
                        avancarPag();
                    } while (pag < resp);
                } catch (InterruptedException ex){
                    System.out.println("Erro na leitura, checar log");
                }
            }
        } else {
            System.out.println("O livro está fechado...");
        }
    }
    
    private int pararLer() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Ler até que página? Página: ");
            int resp = sc.nextInt();
            //Se a pagina for maior que total ou se pagina for menor/igual a pagina atual 
            if (getPagAtual() == getTotPaginas()) { //Se ultima página
                return -1;
            } else if (resp > getTotPaginas() || resp <= getPagAtual()) { 
                System.out.printf("Quantidade de Páginas inválida! %s está na %s de %s\n"
                                , this.leitorn, getPagAtual(), getTotPaginas());
            } else {
                return resp;
            }
        }
    }
    
    @Override
    public void folhear() {
        if (isAberto()) {
            System.out.println("==============================");
            System.out.printf("Ao folhear as páginas, %s contou %s páginas no total\n",
                    this.leitorn, getTotPaginas());
        } else {
            System.out.println("O livro está fechado...");
        }
    }

    @Override
    public void avancarPag() {
        if(isAberto()) {
            System.out.println("==============================");
            if (getPagAtual() < getTotPaginas()) { //Se não for a ultima página
                setPagAtual(getPagAtual() + 1);
                System.out.printf("%s passa para a página %s\n", this.leitorn, getPagAtual());
            } else {
                System.out.printf("%s chega ao fim do livro, e o fecha\n", this.leitorn);
                setAberto(false);
            }
        } else {
            System.out.println("O livro está fechado...");
        }
    }

    @Override
    public void voltarPag() {
        if (isAberto()) {
            System.out.println("==============================");
            if (getPagAtual() == 1) { //Se estiver no inicio
                System.out.printf("%s volta a capa do livro, e o fecha\n", this.leitorn);
                setAberto(false);
            } else {
                System.out.printf("%s volta uma página\n", this.leitorn);
                setPagAtual(getPagAtual() - 1);
                System.out.printf("%s está agora na página %s\n", this.leitorn, getPagAtual());
            }
        } else {
            System.out.println("O livro está fechado...");
        }
    }
    //Métodos especiais
    public Livro(String t, String a, int tot, Pessoa le) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tot;
        this.pagAtual = 1;
        this.aberto = false;
        this.leitor = le;
        this.leitorn = this.leitor.getNome();
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
