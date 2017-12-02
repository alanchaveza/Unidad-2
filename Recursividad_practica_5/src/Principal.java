import java.util.Scanner;
/**
 *
 * @author 15551450
 * 
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        String sParen;
        Scanner sc = new Scanner(System.in);
        System.out.println("ESCRIBE LOS PARENTESIS: ");
        sParen = sc.nextLine();
        System.out.println("RESULTADO: " + Parentesis(sParen));
    }
public static boolean Parentesis(String str) {
    if (str.equals("")) 
        return true;
    if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
        return Parentesis(str.substring(1,str.length()-1));
    else
        return false;
    }
}
