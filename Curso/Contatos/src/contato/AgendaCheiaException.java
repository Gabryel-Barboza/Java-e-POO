package contato;

public class AgendaCheiaException extends Exception {
    
    @Override
    public String getMessage() {
        return "\033[31mAgenda Cheia! Não é possível adicionar mais contatos.\033[m";
    }
}
