package interfaces;

public class BancoMySQL implements BancoDados{
    
    @Override
    public void abrirConexao() {
    }

    @Override
    public void fecharConexao() {
    }

    @Override
    public void create(String n) {
    }

    @Override
    public void drop(String n) {
    }

    @Override
    public void alter(String n) {
    }

    @Override
    public String grant(String n) {
        return "";
    }

    @Override
    public String revoke(String n) {
        return "";
    }

    @Override
    public void insert(String n) {
    }

    @Override
    public void update(String n) {
    }

    @Override
    public void delete(String n) {
    }

    @Override
    public String select(String n) {
        return "";
    }
    
}
