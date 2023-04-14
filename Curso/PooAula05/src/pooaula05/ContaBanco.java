
package pooaula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    private int num = (int) (Math.random() * 10000);
    
    public ContaBanco(String nm) { //Construtor
        this.dono = nm;
        this.saldo = 0;
        this.status = false;
        this.numConta = num;
    }
    //Métodos Personalizados
    public void abrirConta(String tipo, String nm) {
        setTipo(tipo);
        setStatus(true);
        if (tipo.equals("cc")) setSaldo(50);
        else if (tipo.equals("cp")) setSaldo(150);
    }
    
    public void fecharConta() {
        if (getSaldo() == 0) {
            setStatus(false);
            System.out.println("Sua conta está agora fechada!");
        } else if (getSaldo() > 0) {
            System.out.printf("""
                              Não foi possível fechar a conta.
                              Você possui um saldo de R$%.2f\n""", getSaldo());
        } else {
            System.out.printf("""
                Não foi possível fechar a conta.
                Você ainda tem um débito com o Banco de R$%.2f.\n""", getSaldo());
        }
    }
    
    public void depositar(float v) {
        setSaldo(getSaldo() + v);
    }
    
    public void sacar(float v) {
        if (getSaldo() >= v) {
            setSaldo(getSaldo() - v);
        } else {
            System.out.printf("Saldo Insuficiente. Saldo : R$%.2f\n", getSaldo());
        }
        
    }
    
    public void pagarMensal(String tipo) {
        if (tipo.equals("cc")) {
            setSaldo(getSaldo() - 12);
            System.out.println("Mensalidade Paga! No valor de R$12,00");
            System.out.printf("Saldo : R$%.2f\n", getSaldo());
        } else if (tipo.equals("cp")) {
            setSaldo(getSaldo() - 20);
            System.out.println("Mensalidade Paga! No valor de R$20,00");
            System.out.printf("Saldo : R$%.2f\n", getSaldo());
        }
    }
    //Métodos Especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
