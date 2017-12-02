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
        falsoFor(5);
        System.out.println("");
        falsoForI(5,1);
    }
    public static void falsoFor(int val){
        System.out.print(val+" ");
        if (val > 1)
        falsoFor(val-1);
    }
    public static void falsoForI(int fin, int val){
        System.out.print(val +" ");
        if(val < fin)
            falsoForI(fin,val+1);
    } 
}
