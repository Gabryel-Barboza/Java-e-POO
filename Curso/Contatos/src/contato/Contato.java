package contato;

import java.util.Scanner;

public class Contato {
    private static int contador = 0;
    
    private int id;
    private String nome;
    private String telefone;
    private String email;

    @Override
    public String toString() {
        return String.format("Contato {Id: %s, Nome: %s, Telefone: %s, Email: %s}"
                , id, nome, telefone, email);
    }
    
    public Contato(String n, String t, String e) {
        this.id = contador++;
        this.nome = n;
        this.telefone = t;
        this.email = e;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
