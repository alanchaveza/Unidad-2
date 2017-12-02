
import java.util.Collections;
import java.util.Comparator;
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
        LinkedList<String> miLista = new LinkedList();
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
        Comparator miComparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String cad1,cad2;
                cad1= (String)o1;
                cad2= (String)o2;
                char c1, c2;
                c1=cad1.charAt(0);
                c2=cad2.charAt(0);
                return c2-c1;
            }

        };
        System.out.println("");
        Collections.sort(miLista, miComparator);
        System.out.println(miLista);   
    }
}
