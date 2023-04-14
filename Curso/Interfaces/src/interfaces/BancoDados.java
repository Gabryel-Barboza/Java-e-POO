package interfaces;

public interface BancoDados extends SqlDDL, SqlDCL, SqlDML{
    //Extendendo todas as interfaces, só se pode extender 1 classe, mas várias interfaces
    public abstract void abrirConexao();
    public abstract void fecharConexao();
}
