package multiploscatchs;

public class CatchMesmaFamilia {
    
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};
        
        for (int i = 0; i<numeros.length; i++) {
            try {
                System.out.printf("%s/%s = %s \n", numeros[i], denom[i], (numeros[i]/denom[i]));
            }   //Exceptions de mesma familia podem ser colocados no mesmo catch
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) {
                System.out.println("\033[1;31mOcorreu um erro!\033[m");
            }
        }
    }
}
