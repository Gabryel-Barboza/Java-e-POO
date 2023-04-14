
package modificadorstatic;

public class ModificadorStatic {
    //variavel static, para ser acessada dentro do Main.
    static int resultado;

    public static void main(String[] args) {
        /*Calculadora calc = new Calculadora();
        calc.soma(2, 3); Instância para usar os métodos sem o static*/
        
        //Adicionando modificador static aos métodos
        int resultado = Calculadora.soma(10, 3);
        System.out.println(resultado);
        System.out.println(dobrar(3, 6));
    }
    
    
    static int dobrar(int n1, int n2) {
        return n1 * n2;
    }
}
