package pooaula06;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos Especiais - private de exemplo para usar somente os métodos abstratos
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //Métodos Abstratos

    @Override //Sobrescrever método abstrato
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? : " + isLigado());
        if (isLigado()) {
            System.out.println("Está tocando? : " + isTocando());
            System.out.print("Volume : \033[1;33m");
            for (int i = 0;i < getVolume();i += 5) {
                System.out.print("|");
            }
            System.out.println(" " + getVolume() + "\033[m");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o Menu...");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) { //Está ligado?
            if (getVolume() < 100) { //Volume menor do que 100?
                setVolume(getVolume() + 1);
            }
            System.out.print("\033[1;33m");
            for (int i = 0;i <= getVolume();i += 5) { //Linhas antes do valor do volume
                System.out.print("|");
            }
            System.out.println(" " + getVolume() + "\033[m"); //volume
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            if (getVolume() > 0) {
                setVolume(getVolume() - 1);
            }
            System.out.println("\033[1;33m");
            for (int i = 0;i <= getVolume();i += 5) {
                System.out.print("|");
            }
            System.out.println(" " + getVolume() + "\033[m");
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (isLigado() && !(isTocando())) {
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
        }
    }
    
    
}
