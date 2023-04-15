package classes;

public class Piramide extends Figura3D {
    private Figura2D base;
    private float altura;
    private float apotema;
    private int arestaBase;
    private int numPoligono;
    
    @Override
    public double calcularVolume() {
        if (this.base != null) {
            return (base.calcularArea() * altura / 3);
        }
        return 0;
    }
    
    @Override
    public double calcularArea() {
        if (base != null) {
            double aB = base.calcularArea();
            double aL = (numPoligono * arestaBase * apotema) / 2;
            return (aB + aL);
        }
        return 0;
    }
    
    public Piramide() {
        setNome("Piramide");
        setCor("Marrom");
        this.altura = 6;
        this.arestaBase = 5;
        this.numPoligono = 4;
        this.apotema = 4;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public int getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(int arestaBase) {
        this.arestaBase = arestaBase;
    }

    public int getNumPoligono() {
        return numPoligono;
    }

    public void setNumPoligono(int numPoligono) {
        this.numPoligono = numPoligono;
    }
    
}
