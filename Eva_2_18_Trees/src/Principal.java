
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Tree miArb = new Tree(new Nodo(100));
        try {
            miArb.agregarNodo(miArb.getRoot(), new Nodo(90));
            miArb.agregarNodo(miArb.getRoot(), new Nodo(101));
            miArb.agregarNodo(miArb.getRoot(), new Nodo(92));
            miArb.agregarNodo(miArb.getRoot(), new Nodo(80));
            miArb.agregarNodo(miArb.getRoot(), new Nodo(110));
            miArb.agregarNodo(miArb.getRoot(), new Nodo(105));
            System.out.println("Pre");
            miArb.preOrder();
            System.out.println("");
            System.out.println("Post");
            miArb.postOrder();
            System.out.println("");
            System.out.println("In");
            miArb.inOrder();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Nodo {

    private int val;
    private Nodo Izq;
    private Nodo Der;

    public Nodo() {
        val = 0;
        this.Izq = null;
        this.Der = null;
    }

    public Nodo(int val) {
        this.val = val;
        this.Izq = null;
        this.Der = null;
    }

    public int getVal() {
        return val;
    }

    public Nodo getIzq() {
        return Izq;
    }

    public Nodo getDer() {
        return Der;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setIzq(Nodo Izq) {
        this.Izq = Izq;
    }

    public void setDer(Nodo Der) {
        this.Der = Der;
    }

}

class Tree {

    private Nodo root;

    public Tree() {
        root = null;
    }

    public Tree(Nodo nod) {
        root = nod;
    }

    public Nodo getRoot() {
        return root;
    }

    public void agregarNodo(Nodo actual, Nodo nod) throws Exception {
        if (root == null) {
            root = nod;
        } else {//no esta vacia 
            if (nod.getVal() < actual.getVal()) {//Si es mayor
                if (actual.getIzq() == null) {//}}}}se inserta nuestro valor qui
                    actual.setIzq(nod);
                } else {
                    agregarNodo(actual.getIzq(), nod);
                }
            } else if (nod.getVal() > actual.getVal()) {
                if (actual.getDer() == null) {//}}}}se inserta nuestro valor qui
                    actual.setDer(nod);
                } else {
                    agregarNodo(actual.getDer(), nod);
                }
            } else {
                throw new Exception("No Puede Haber Valores Repetidos");
            }

        }

    }

    public void preOrder() {
        pOT(root);

    }

    private void pOT(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.getVal() + " - ");
            pOT(actual.getIzq());
            pOT(actual.getDer());
        }
    }

    public void postOrder() {
        psOT(root);
    }

    private void psOT(Nodo actual) {
        if (actual != null) {
            psOT(actual.getIzq());
            psOT(actual.getDer());
            System.out.print(actual.getVal() + " - ");
        }
    }

    public void inOrder() {
        iOT(root);
    }

    private void iOT(Nodo actual) {
        if(actual!=null){
        iOT(actual.getIzq());
        System.out.print(actual.getVal() + " - ");
        iOT(actual.getDer());
        }
    }
}
