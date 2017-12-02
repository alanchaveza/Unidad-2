/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad_practica_3;

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
        System.out.println(Elevar(3,2));
        System.out.println(Elevar(3,3));
        System.out.println(Elevar(4,5));
        System.out.println(Elevar(2,5));
        System.out.println(Elevar(-2,3));
    }
    public static int Elevar(int num, int n){
    if(n==0){
       num=1;
    return num;
    }else {
        return num*(Elevar(num,n-1));
    }
    
    }
    
}
