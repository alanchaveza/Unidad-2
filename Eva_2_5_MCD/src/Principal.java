/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 15551450
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=180, n2=48 ;
        System.out.println("El MCD de "+n1+" y "+n2+" = "+MCD(n2, n1));
        
    }
    public static int MCD(int den,int div){
    if (div==0){
        return den;
    }else{
        int resi = den%div;
        return MCD(div,resi);
    }
    
    }
    
}
