package interfaces;

public interface SqlDML {
    //Data Manipulation Language
    public abstract void insert(String n);
    public abstract void update(String n);
    public abstract void delete(String n);
    public abstract String select(String n);
}
