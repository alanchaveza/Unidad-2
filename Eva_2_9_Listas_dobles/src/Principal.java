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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Lista miLista = new Lista();
        miLista.addElement(new Nodo(300));
        miLista.addElement(new Nodo(350));
        miLista.addElement(new Nodo(400));
        miLista.addElement(new Nodo(450));
        miLista.printList();
        System.out.println("");
        System.out.println("");
        miLista.Buscar(300);
        miLista.Buscar(450);
        miLista.Buscar(400);
        System.out.println("mi lista tiene :" + miLista.retunrSize() + " elementos");
        miLista.makeEmpty();
        miLista.printList();
        for (int i = 0; i < 10; i++) {
            miLista.addElement(new Nodo((int) (Math.random() * 100) + 1));
        }
        miLista.printList();
        System.out.println("");
        miLista.imprimirInverso();
        System.out.println("");
        miLista.agregarEn(4, new Nodo(24));
        miLista.printList();
        System.out.println("");
        
    }

}

class Nodo {

    private int val;
    private Nodo nSig;
    private Nodo nPrev;

    public Nodo() {
        val = 0;
        nSig = null;
        nPrev = null;
    }

    public Nodo(int num) {
        val = num;
        nSig = null;
        nPrev = null;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }

    public void setnPrev(Nodo nPrev) {
        this.nPrev = nPrev;
    }

    public int getVal() {
        return val;
    }

    public Nodo getnSig() {
        return nSig;
    }

    public Nodo getnPrev() {
        return nPrev;
    }
}

class Lista {

    private Nodo Ini;
    private Nodo Fin;

    public Lista() {
        Ini = null;
        Fin = null;
    }

    public Lista(Nodo nNodo) {
        Ini = nNodo;
        Fin = nNodo;
    }

    public void addElement(Nodo nNodo) {
        if (Ini == null) {
            Ini = nNodo;
            Fin = nNodo;
        } else {
            Fin.setnSig(nNodo);
            nNodo.setnPrev(Fin);
            Fin = nNodo;
        }
    }

    public void printList() {
        Nodo Temp = Ini;
        if (Ini == null) {
            System.out.println("Lista vacia");
        } else {
            Nodo temp = Ini;
            while (temp != null) {
                System.out.print(temp.getVal() + " - ");
                temp = temp.getnSig();
            }
        }
    }

    public void imprimirInverso() {
        Nodo Temp = Fin;
        if (Fin.getnPrev() == null) {
            System.out.println("Lista vacia");
        } else {
            Nodo temp = Fin;
            while (temp != null) {
                System.out.print(temp.getVal() + " - ");
                temp = temp.getnPrev();
            }
        }
    }

    public void makeEmpty() {
        Ini = null;
        Fin = null;
    }

    public int retunrSize() {
        int cont;

        if (Ini == null) {
            cont = 0;
        } else {
            cont = 0;

            Nodo temp = Ini;
            while (temp != null) {
                cont++;
                temp = temp.getnSig();
            }

        }
        return cont;
    }

    public void agregarEn(int pos, Nodo nod) {
        if (pos == 0) {
            nod.setnSig(Ini);
            Ini = nod;
        } else if (pos == (retunrSize())) {
            addElement(nod);
        } else {
            int cont = 0;
            int val = 0;
            Nodo temp = Ini;
            while (cont < (pos - 1)) {//moverse por la lista
                temp = temp.getnSig();
                cont++;
            }
            nod.setnSig(temp.getnSig());
            temp.setnSig(nod);
        }

    }

    public void Buscar(int val) throws Exception {
        int cont;
        if (Ini.getVal() == val) {
            cont = 0;
            System.out.println("El valor: " + val + " está en la posicion: " + cont);
        } else if (Ini.getVal() != val) {
            cont = 0;
            Nodo temp = Ini;
            while (temp.getVal() != val) {
                cont++;
                temp = temp.getnSig();
            }
            System.out.println("El valor: " + val + " está en la posicion: " + (cont));
        }
    }
    
    public boolean isEmpty(){
    boolean f;
    if (Ini == null) {
        f=true;
    }else{
        f=false;
    }
    return f;
    }
}
