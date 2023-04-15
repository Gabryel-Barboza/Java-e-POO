package multiploscatchs;

public class MultiplosCatchs {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};
        
        for (int i = 0; i<numeros.length; i++) {
            try{
                System.out.printf("%s/%s = %s \n", numeros[i], denom[i], (numeros[i]/denom[i]));
            }
            catch (ArithmeticException e1) {
                System.out.println("\033[1;31mErro na divisão por zero\033[m");
            }
            catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("\033[1;31mErro ao acessar o índice do array\033[m");
            }
        }
    }
    
}
