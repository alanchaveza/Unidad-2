
import java.util.Stack;

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
        Stack <Double> miStack = new Stack();
        miStack.push(20.0);
        miStack.push(18.0);
        miStack.push(17.0);
        miStack.push(50.0);
        miStack.push(66.0);
        System.out.println(miStack.pop());
        System.out.println(miStack.pop());
        System.out.println(miStack.peek());
        
        
    }
    
}
