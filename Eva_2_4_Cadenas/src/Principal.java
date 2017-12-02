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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      
        // TODO code application logic here
        /*
        for (int i = 1; i <= 10; i++) {
            System.out.println(crearCadena(i));
        }
        for (int i = 9; i >= 1; i--) {
            System.out.println(crearCadena(i));
        }*/
        //Un solo Ciclo
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(crearCadena(i));
        }*/
        int arriba = 1;
        int abajo =9;
        while(abajo !=0){
        if(arriba<=10){
            System.out.println(crearCadena(arriba));
            arriba++;
        }
        if(arriba >10){
            System.out.println(crearCadena(abajo));
            abajo --;
        }
        }
        
        
    }
    public static String crearCadena(int val){
    if(val >1)
        return "*"+crearCadena(val-1);
    else 
       return "*";
    }
    
}
