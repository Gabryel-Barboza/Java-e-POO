package trycatch;

public class FinallyOuNao {
    
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};
        
        for (int i = 0; i<numeros.length; i++) {
            try{
                System.out.printf("%s/%s = %s \n", numeros[i], denom[i], (numeros[i]/denom[i]));
                
            }
            catch (ArithmeticException e1) {
                System.out.println("\033[1;31mErro na divisão por zero\033[m");
                //Forçando a interrupção do programa não permite que o resto do código seja executado
                //Logo não haverá execução da linha finally
                System.exit(0);
            }
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("\033[1;31mErro ao acessar o índice do array\033[m");
                System.exit(0);
            }
            finally {
                System.out.println("Linha impressa sempre após o try ou catch");
            }
        }
    }
}
