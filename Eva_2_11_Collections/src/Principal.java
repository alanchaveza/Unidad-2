
import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Integer> miArreglo = new ArrayList();
        miArreglo.add((int)((Math.random()*100)+1));
        miArreglo.add((int)(Math.random()*100)+1);
        miArreglo.add((int)(Math.random()*100)+1);
        miArreglo.add((int)(Math.random()*100)+1);
        miArreglo.add((int)(Math.random()*100)+1);
        for (Integer integer : miArreglo) {
            System.out.print(integer+" - ");
        }
        miArreglo.add(2, 999);
        System.out.println("");
        for (Integer integer : miArreglo) {
            System.out.print(integer+" - ");
        }
        System.out.println("");
        Iterator recorrer;
        recorrer=miArreglo.iterator();
        while(recorrer.hasNext()){
            System.out.print(recorrer.next()+" - ");
        }
    }
    
}
