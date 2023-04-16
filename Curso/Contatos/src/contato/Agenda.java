package contato;

public class Agenda {
    private Contato[] contatos;
    
    public void addContato(Contato c) throws AgendaCheiaException {
        
       boolean cheia = true;
        for (int i = 0; i<contatos.length; i++) {
            if (contatos[i] == null) {
                contatos[i] = c;
                cheia = false;
                break;
            }
        }
        if (cheia) {
            throw new AgendaCheiaException();
        }
        
    }
    
    public int consultaContato(String n) throws ContatoNaoExisteException {
        
        for (int i = 0; i<contatos.length; i++) {
            if (contatos[i] != null) {
                if (contatos[i].getNome().equalsIgnoreCase(n)) {
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(n);
    }
    
    public Agenda() {
        contatos = new Contato[5];
    }
    
    @Override
    public String toString() {
        String s = "";
        for (Contato c : contatos) {
            if (c != null) {
                s += c.toString() + "\n";
            }
        }
        return s;
    }

    public Contato getContato(int pos) {
        return contatos[pos];
    }
}
