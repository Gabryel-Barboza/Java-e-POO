package pooaula07;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Luta {
        private Lutador desafiado; //Tipo abstrato, Luta "Tem Um" Lutador
        private Lutador desafiante; //Luta Tem Um Lutador, - Agregação
        private int rounds;
        private boolean aprovada;
     /*Regras : Só pode ser marcada entre lutadores de mesma categoria.
     Desafiado e desafiante devem ser lutadores diferentes.
     Só pode acontecer se estiver aprovada.
     Só pode ter como resultado a vitória de um do lutadores ou o empate.*/
    public void marcarLuta(Lutador l1, Lutador l2) {
        if ((l1.getCategoria().equals(l2.getCategoria()))
                && !(l1.equals(l2))) { //Se mesma categoria e lutadores diferentes 
                setAprovada(true);
                setDesafiante(l1);
                setDesafiado(l2);
        } else {
            setAprovada(false);
            setDesafiante(null);
            setDesafiado(null);
        }
    }   
    
    public void luta() {
        if (isAprovada()) { //Luta aprovada?
            try { //Necessário com Thread.sleep()
                System.out.print("\033[1;33mDE UM LADO TEMOS O ");
                desafiante.apresentar();
                System.out.println("\033[m================================");
                Thread.sleep(3000);
                System.out.print("\033[1;33mE DO OUTRO TEMOS O ");
                desafiado.apresentar();
                System.out.println("\033[m================================");
                Thread.sleep(3000);
                System.out.println("\033[1;35mA LUTA FOI APROVADA! QUE COMECE O COMBATE!");
                System.out.println("NA CATEGORIA " + getDesafiante().getCategoria()
                 + "\033[m");
                Thread.sleep(2000);
                String atk;
                String l1 = getDesafiante().getNome();
                String l2 = getDesafiado().getNome();
                boolean fim = false;
                while (!fim) {
                    setRounds(getRounds() + 1);
                    //Ataque desafiante
                    System.out.println("============================");
                    System.out.println("É a vez de " + l1);
                    atk = getDesafiante().atkChance();
                    switch (atk) {
                        case "Critico" -> {
                            System.out.println(l1 + " acerta um golpe crítico!");
                            getDesafiado().damage(14);
                            System.out.println(l2 + " está agora com " + getDesafiado().getHP() + " de vida");
                        }
                        case "Acertou" -> {
                            System.out.println(l1 + " acerta um golpe");
                            getDesafiado().damage(8);
                            System.out.println(l2 + " está agora com " + getDesafiado().getHP() + " de vida");
                        }
                        default -> System.out.println(l1 + " errou");
                    }
                    System.out.println("============================");
                    Thread.sleep(2000);
                    //Desafiado foi de base?
                    if (getDesafiado().getHP() <= 0) {
                        System.out.println(l2 + " foi nocauteado!");
                        getDesafiado().perderLuta();
                        getDesafiante().ganharLuta();
                        fim = true;
                    } else { //Ataque Desafiado
                        System.out.println("É a vez de " + l2);
                        atk = getDesafiante().atkChance();
                        switch (atk) {
                            case "Critico" -> {
                                System.out.println(l2 + " acerta um golpe crítico!");
                                getDesafiante().damage(14);
                                System.out.println(l1 + " está agora com " + getDesafiante().getHP() + " de vida");
                            }
                            case "Acertou" -> {
                                System.out.println(l2 + " acerta um golpe");
                                getDesafiante().damage(8);
                                System.out.println(l1 + " está agora com " + getDesafiante().getHP() + " de vida");
                            }
                            default -> System.out.println(l2 + " errou");
                        }
                    }
                    Thread.sleep(2000);
                    //Desafiante foi de base?
                    if (getDesafiante().getHP() <= 0) {
                        System.out.println(l1 + " foi nocauteado!");
                        getDesafiante().perderLuta();
                        getDesafiado().ganharLuta();
                        fim = true;
                    } else if (getRounds() >= 15) {
                        System.out.println("IMPRESSIONANTE! HOUVE UM EMPATE,"
                                + " POIS NENHUM DOS LUTADORES FORAM DERRUBADOS");
                        System.out.println("APÓS UM TOTAL DE " + getRounds() + " ROUNDS.");
                        getDesafiante().empatarLuta();
                        getDesafiado().empatarLuta();
                        fim = true;
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Lutador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("\033[1;31mA Luta não pode ser aprovada. Lutadores inválidos.\033[m");
        }
    }
    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
        
}
