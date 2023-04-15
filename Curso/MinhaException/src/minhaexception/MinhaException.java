package minhaexception;

public class MinhaException {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denom = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    //Lançando uma exception
                    //throw new Exception("Número ímpar, divisão não exata.");
                    throw new DivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.printf("%s/%s = %s \n", numeros[i], denom[i], (numeros[i] / denom[i]));

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e1) {
                System.out.println("""
                                   \033[31mOcorreu um erro com o array utilizado.
                                   Verifique se os números são pares e possuem denominadores para realizar a divisão, diferentes de 0.\033[m""");
                e1.printStackTrace();
            } catch (Exception e) {
                System.out.println("\033[31mAconteceu um erro genérico:");
                System.out.println(e.getMessage() + "\033[m");
            }
        }
    }

}
