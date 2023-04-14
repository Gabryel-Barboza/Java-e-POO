package pooaula14;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;
    
    public void viuMaisUm() {
        setTotAssistido(getTotAssistido() + 1);
    }
    
    @Override
    public String toString() { //Super referencia a superclasse da classe atual
        return "Gafanhoto{\n" + super.perfil() + "\nlogin=" + login 
                + ", totAssistido=" + totAssistido + '}';
    }
    
    //Métodos Especiais
    public Gafanhoto(String n, int i, String s, String l) {
        super(n, i, s); //Passando atributos para a superclasse
        this.login = l;
        this.totAssistido = 0;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}
