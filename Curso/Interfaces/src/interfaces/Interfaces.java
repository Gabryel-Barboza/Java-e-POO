package interfaces;

public class Interfaces {

    public static void main(String[] args) {
        BancoMySQL bmysql = new BancoMySQL();
        bmysql.abrirConexao();
        bmysql.fecharConexao();
    }
    
}
