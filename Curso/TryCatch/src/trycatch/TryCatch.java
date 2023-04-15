package trycatch;

public class TryCatch {

    public static void main(String[] args) {
        try { //Tente executar
            int[] vetor = new int[4];

            System.out.println("Antes do Exception");
            vetor[4] = 1; //ArrayIndexOutOfBoundsException - Índice não existente
            System.out.println("Esse texto não será impresso");
            
            //Exception e variável para guardar a exception
        } catch(ArrayIndexOutOfBoundsException exception) { //Capture a exceção e trate o erro
            System.out.println("\033[1;31mExceção ao acessar um índice do vetor\033[m");
        }
        System.out.println("Esse texto será impresso após a exception");
    }
    
}
