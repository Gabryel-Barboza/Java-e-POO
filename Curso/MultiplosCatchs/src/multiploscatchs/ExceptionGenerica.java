package multiploscatchs;

public class ExceptionGenerica {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.printf("%s/%s = %s \n", numeros[i], denom[i], (numeros[i] / denom[i]));
            } 
            catch (Throwable e1) { //Classe Throwable, superclasse das exceptions
                System.out.printf("\033[1;31mErro ocorrido na iteração %s\033[m\n", i);
            }
        }
    }
}
