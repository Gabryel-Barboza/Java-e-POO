package interfaces;

public interface BancoDados extends SqlDDL, SqlDCL, SqlDML{
    //Extendendo todas as interfaces, só se pode extender 1 classe, mas várias interfaces
    public abstract void abrirConexao(); //As interfaces tem as classes como public abstract por padrao
    public abstract void fecharConexao(); //Logo é redundante adicionar esses modificadores novamente
}
