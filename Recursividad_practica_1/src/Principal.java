/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alán
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sumaDigitos(134));
        System.out.println(sumaDigitos(14));
        System.out.println(sumaDigitos(1));
        System.out.println(sumaDigitos(98));
        System.out.println(sumaDigitos(67));
        
    }

public static int sumaDigitos(int n)
/*Calcula y devuelve la suma de los digitos de un numero, de forma recursiva*/
{
	if (n<=0)
		return(0);
	else
		return ((n%10) + sumaDigitos(n/10));
}



    
}
