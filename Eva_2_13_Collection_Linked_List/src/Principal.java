
import java.util.LinkedList;

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
        LinkedList <String> miLista = new LinkedList();
        miLista.add("Hola");
        miLista.add(" ");
        miLista.add("Mundo");
        miLista.add(" ");
        miLista.add("Cruel");
        miLista.add(" ");
        miLista.add("Collections");
        for (String string : miLista) {
            System.out.print(string);
        }
        System.out.println("");
        miLista.remove(4);
        for (String string : miLista) {
            System.out.print(string);
        }
        System.out.println("");
        miLista.add(4, "Bondadoso");
        for (String string : miLista) {
            System.out.print(string);
        }
        System.out.println("");
        System.out.println("La lista tiene : " +miLista.size()+" Elementos");
    }
    
}
