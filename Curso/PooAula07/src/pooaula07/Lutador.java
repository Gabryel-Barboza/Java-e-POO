package pooaula07;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lutador implements Apresentador {
    private String nome, nacionalidade, categoria;
    private float altura, peso;
    private int idade, vitorias, derrotas, empates, hp;

    //Métodos abstratos
    @Override
    public void apresentar() {
        try {
            System.out.println("LUTADOR " + getNome());
            Thread.sleep(1500);
            System.out.println("com um peso de " + getPeso() + "Kg");
            Thread.sleep(1500);
            System.out.println(getIdade() + " anos");
            Thread.sleep(1500);
            System.out.println("altura de " + getAltura() + " m");
            Thread.sleep(1500);
            String nacion = getNacionalidade();
            char letranac = nacion.charAt(nacion.length() - 1);
            //Escrever Da ou Do antes do país
            System.out.println((letranac == 'a'? "Da ":"Do ") + getNacionalidade());
            Thread.sleep(1500);
            System.out.println("e com " + getVitorias() + " vitórias!");
        } catch (InterruptedException ex) {
            Logger.getLogger(Lutador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void status() {
        System.out.println("Lutador : " + getNome());
        System.out.print(getVitorias() + (getVitorias() == 1? " Vitória  |  ":" Vitórias  |  "));
        System.out.print(getDerrotas() + (getDerrotas() == 1? " Derrota  |  ":" Derrotas  |  "));
        System.out.print(getEmpates() + (getEmpates() == 1? " Empate  |  ":" Empates  |  "));
        System.out.println(getCategoria());
        
    }
    @Override
    public void ganharLuta() {
        System.out.println(getNome() + " VENCE O COMBATE!");
        setVitorias(getVitorias() + 1); 
    }
    @Override
    public void perderLuta() {
        System.out.println(getNome() + " perdeu a luta.");
        setDerrotas(getDerrotas() + 1);
    }
    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    
    public void damage(int n) {
        setHP(getHP() - n);
    }
    
    public String atkChance() {
        //rand = Math.random(); chance = (int)Math.round(1 + rand * (2-1));
        Random aleat = new Random();
        int chance = aleat.nextInt(6);
        if (chance == 0) {
            return "Critico";
        } else if (chance < 4) {
            return "Acertou";
        } else {
            return "Errou";
        }
    }
    //Métodos especiais
    public Lutador(String no, String na, int id, float al, float pe, int vi,
            int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.hp = 100;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() { //Atribuição automática de categoria por peso
        if (getPeso() < 52.2 || getPeso() > 120.2) {
            this.categoria = "Inválido";
        } else if (getPeso() <= 70.3) {  
            this.categoria = "PESO LEVE";
        } else if (getPeso() <= 83.9) {
            this.categoria = "PESO MÉDIO";
        } else if (getPeso() <= 120.2) {
            this.categoria = "PESO PESADO";
        } 
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    public int getHP() {
        return hp;
    }
    
    public void setHP(int h) {
        this.hp = h;
    }
}
