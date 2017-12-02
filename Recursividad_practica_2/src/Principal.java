/**
 *
 * @author 15551450
 * 
 */
public class Principal {
	
        
	public static void main(String args[]) {
		String pr1 ="xaxb";
		System.out.println(Remover('x', pr1));
                String pr2="xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
                System.out.println(Remover('x', pr2));
                
                
                
                
	}
        public static String Remover(char c, String s) {
		if(s.length() > 0) {
			if(s.charAt(0) == c) {
				return Remover(c, s.substring(1));
			}
			return s.substring(0, 1).concat(Remover(c, s.substring(1)));
		}
		return "";
	}
}


