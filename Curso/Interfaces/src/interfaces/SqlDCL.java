package interfaces;

public interface SqlDCL {
    //Data Control Language
    public abstract String grant(String n);
    public abstract String revoke(String n);
}
