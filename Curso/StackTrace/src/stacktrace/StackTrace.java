package stacktrace;

public class StackTrace {
    
    public static void main(String[] args) {
        try { 
            int[] vetor = new int[4];

            System.out.println("Antes do Exception");
            vetor[4] = 1; //ArrayIndexOutOfBoundsException - Índice não existente
            System.out.println("Esse texto não será impresso");

            //Exception são todas as exceptions, é preferível a ser utiizado do que Throwable.
        } catch(Exception e) { 
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Esse texto será impresso após a exception");
    }
    
}
