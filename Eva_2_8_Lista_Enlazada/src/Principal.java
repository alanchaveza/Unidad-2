
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            // TODO code application logic here
            Lista miLista = new Lista();
            miLista.printList();
            miLista.addElement(new Nodo(100));
            System.out.println("");
            miLista.printList();
            miLista.addElement(new Nodo(200));
            System.out.println("");
            miLista.printList();
            miLista.addElement(new Nodo(300));
            System.out.println("");
            miLista.printList();
            miLista.makeEmpty();
            System.out.println("");
            miLista.printList();
            for (int i = 0; i < 10; i++) {
                miLista.addElement(new Nodo((int) (Math.random() * 1000) + 1));
            }
            System.out.println("La lista tiene " + miLista.returnSize());
            miLista.printList();
            System.out.println("");

            System.out.println("Valor en Posicion 5:" + miLista.Valor(5));
            miLista.insert(miLista.returnSize(), new Nodo(777));
            System.out.println("");
            miLista.printList();
            miLista.insert(5, new Nodo(897));
            System.out.println("");
            miLista.printList();
            System.out.println("");
            System.out.println(miLista.isEmpty());
            

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

class Nodo {

    private int val;
    private Nodo nsig;

    public Nodo() {
        val = 0;
        nsig = null;
    }

    public Nodo(int num) {
        val = num;
        nsig = null;
    }

    public Nodo(int num, Nodo nNodo) {
        val = num;
        nsig = nNodo;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNsig(Nodo nsig) {
        this.nsig = nsig;
    }

    public int getVal() {
        return val;
    }

    public Nodo getNsig() {
        return nsig;
    }
}

class Lista {

    private Nodo nIni;
    private Nodo nFin;

    public Lista() {
        nIni = null;
        nFin = null;
    }

    public Lista(Nodo nNodo) {
        nIni = nNodo;
        nFin = nNodo;
    }

    /* public void Agregar(Nodo nNod) {//Agregar al Final
        if (nIni == null) {
            nIni = nNod;
        } else {
            Nodo temp = nIni;
            while (temp.getNsig() != null) {
                temp = temp.getNsig();
            }
            temp.setNsig(nNod);
        }
    }*/
    public void addElement(Nodo nNodo) {
        if (nIni == null) {
            nIni = nNodo;//Nuestro nuevo el valor
            nFin = nNodo;//y el valor
        } else {
            nFin.setNsig(nNodo);
            nFin = nNodo;
            // nFin=nFin.getNsig();
        }

    }

    public void printList() {
        if (nIni == null) {
            System.out.println("Lista vacia");
        } else {
            Nodo temp = nIni;
            while (temp != null) {
                System.out.print(temp.getVal() + " - ");
                temp = temp.getNsig();
            }

        }
    }

    public void makeEmpty() {
        nIni = null;
    }

    public int returnSize() {
        int cont;

        if (nIni == null) {
            cont = 0;
        } else {
            cont = 0;

            Nodo temp = nIni;
            while (temp != null) {
                cont++;
                temp = temp.getNsig();
            }

        }
        return cont;
    }

    public int Valor(int n) throws Exception {
        if ((n <= 0) || (n >= returnSize())) {
            throw new Exception("Valor Erroneo");
        }
        int cont = 0;
        int val = 0;
        Nodo temp = nIni;
        while (cont < n) {//moverse por la lista
            temp = temp.getNsig();
            cont++;
        }
        val = temp.getVal();
        return val;
    }

    public void insert(int pos, Nodo nNodo) {
        //Faltan Validaciones
        if (pos == 0) {
            nNodo.setNsig(nIni);
            nIni = nNodo;
        } else if (pos == (returnSize())) {
            addElement(nNodo);
        } else {
            int cont = 0;
            int val = 0;
            Nodo insert = nIni;
            while (cont < (pos - 1)) {//moverse por la lista
                insert = insert.getNsig();
                cont++;
            }
            nNodo.setNsig(insert.getNsig());
            insert.setNsig(nNodo);
        }

    }
    public boolean isEmpty(){
    boolean vacio;
    if(nIni == null){
    vacio=true;
    }
    else{
    vacio=false;
    }
    return vacio;
    }
}
