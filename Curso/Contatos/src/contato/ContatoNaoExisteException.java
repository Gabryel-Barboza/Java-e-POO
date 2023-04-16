package contato;

public class ContatoNaoExisteException extends Exception {
    private String nomeContato;
    
    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }
    
    @Override
    public String getMessage() {
        return "\033[31mO Contato " + nomeContato + " não foi encontrado";
    }
}
