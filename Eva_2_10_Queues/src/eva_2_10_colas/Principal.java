/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_2_10_colas;

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
        Queue Lista = new Queue();
        System.out.println(Lista.leerPrimer());
        for (int i = 0; i < 10; i++) {
            int Num= (int) ((Math.random() * 100) + 1);
            System.out.print(Num+" - ");
            Lista.agregar(new Nodo(Num));
        }
        System.out.println("");
        System.out.println(Lista.leerPrimer());
        System.out.println(Lista.removerPrimerNodo());
        System.out.println(Lista.removerPrimerNodo());
        System.out.println(Lista.removerPrimerNodo());
        System.out.println(Lista.removerPrimerNodo());
        
        
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

class Queue {

    private Nodo Ini;
    private Nodo Fin;

    public Queue() {
        Ini = null;
        Fin = null;
    }

    public Queue(Nodo nNodo) {
        Ini = nNodo;
        Fin = nNodo;
    }

    public void agregar(Nodo nNodo) {
        if (Ini == null) {
            Ini = nNodo;
            Fin = nNodo;
        } else {
            Fin.setnSig(nNodo);
            nNodo.setnPrev(Fin);
            Fin = nNodo;
        }
    }

    public int leerPrimer() {
        if (Ini == null) {
            return 0;//Almacenamos enteros , el 
        } else {
            return Ini.getVal();
        }
    }
    public int removerPrimerNodo(){
     if (Ini == null) {
            return 0;//Almacenamos enteros , el 
        } else {
         int Val = Ini.getVal();
         //Dos caras ----->Cunado hay un nodo
         if(Ini.getnSig()==null){
         Ini=null;
         Fin=null;
         }else{
             Ini=Ini.getnSig();
             Ini.setnPrev(null);
         }
            return Val;
        }
    }
}
