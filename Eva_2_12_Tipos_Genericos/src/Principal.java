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
        Nodo <Integer> Nod= new Nodo(100);
        System.out.println(Nod.getValor());
        Nod.setValor(200);
    }
    
}
class Nodo <T>{
    private T valor;
    public Nodo(T nuevo){
    valor= nuevo;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }
}
