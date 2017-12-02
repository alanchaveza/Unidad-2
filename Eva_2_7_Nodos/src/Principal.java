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
        Nodo obj1 = new Nodo(100);
        Nodo obj2 = new Nodo(200);
        Nodo obj3 = new Nodo(300);
        //obj1-->obj2-->obj3
        obj1.nsig = obj2;
        obj2.nsig = obj3;
        //imprimir los valores
        Nodo temp = obj1;
        while (temp != null) {
            System.out.print(temp.ival+" - ");
            temp = temp.nsig;
        }

    }

}

class Nodo {

    int ival;
    Nodo nsig;

    public Nodo() {
        ival = 0;
        nsig = null;
    }

    public Nodo(int num) {
        ival = num;
        nsig = null;
    }

}
