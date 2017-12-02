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
        int datos[]= new int [3];
        datos[0]=100;
        datos[1]=200;
        datos[2]=300;
        for (int dato : datos) {
            System.out.print(dato+" - ");
        }
        
       
       
        System.out.println("");
        int copia[] = new int[3];
        for (int i = 0; i < datos.length; i++) {
            copia[i]=datos[i];
        }
        datos= new int [4];
        for (int i = 0; i < copia.length; i++) {
            datos[i]=copia[i];
        }
        for (int dato : datos) {
            System.out.print(dato+" - ");
        }
        
    }
    
}
