package interfaces;

public interface SqlDDL {
    //Data Definition Language
    public abstract void create(String n);
    public abstract void drop(String n);
    public abstract void alter(String n);
}
