package linguagemdosistema;

import java.util.Locale;

public class LinguagemDoSistema {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        String linguagem = locale.getDisplayLanguage();
        String country = locale.getCountry();
        System.out.print("Seu sistema está em : ");
        System.out.println(linguagem + "-" + country);
    }
    
}
