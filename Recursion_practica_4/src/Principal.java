
/**
 *
 * @author 15551450
 *
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("TEXTO ORIGINAL: YYZA  |" + CadenaLimpia("  CADENA LIMPIA: YYZA"));
        System.out.println("TEXTO ORIGINAL: Hello  |" + CadenaLimpia("  CADENA LIMPIA: Hello"));
        System.out.println("Naillpulldinng" + CadenaLimpia("  CADENA LIMPIA: Naillpulldinng"));
    }

    public static String CadenaLimpia(String sVal) {
        if (sVal.length() < 2) {
            return sVal;
        } else if (sVal.charAt(0) == sVal.charAt(1)) {
            return CadenaLimpia(sVal.substring(1));
        } else {
            return sVal.charAt(0) + CadenaLimpia(sVal.substring(1));
        }
    }
}
