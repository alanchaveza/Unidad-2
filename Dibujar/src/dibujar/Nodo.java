package dibujar;

import static dibujar.DIBUJOS.contador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Nodo {
    private int iVal;
    private Nodo nSig;
    public Nodo(int iNum) {
    iVal=iNum;
    nSig=null;
    
    }
    public Nodo(int iNum, Nodo nNodo){
        iVal=iNum;
        nSig=nNodo;
    }
    public int getiVal() {
        return iVal;
    }
    public void setiVal(int iVal) {
        this.iVal = iVal;
    }
    public Nodo getnSig() {
        return nSig;
    }

    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    }   
}



class Lista{
    private Nodo nIni;
    private Nodo nFin;
    
    public Lista () {
        nIni=null;
        nFin=null;
    }
        public Lista(Nodo nNodo){
            nIni=null;
            nFin=null;
        
        }
       public void agregarNodo(Nodo nNodo){ //Agrega al final
            if (nIni ==null) {
            nIni=nNodo;
            }else {
                Nodo nTemp=nIni;
                while (nTemp.getnSig() !=null) {
                   nTemp=nTemp.getnSig();
                    
                }
                nTemp.setnSig(nNodo);
            }
            
        }
        public void ImprimirListaX(int numero){ 
            String s="";
            if (nIni ==null) {
                System.out.println("Lista vacia");
            }else {
                Nodo nTemp=nIni;
                for (int i = 0; i <=numero; i++) {
                    if (i==numero) {
                    DIBUJOS.Corx2=nTemp.getiVal();
                       DIBUJOS.temp=nTemp.getiVal();
                    }
                    nTemp=nTemp.getnSig();
                }
              
            }
        }
        public void ImprimirListaY(int numero)
        { 
            String s="";
            if (nIni ==null) {
                System.out.println("Lista vacia");
            }else {
                Nodo nTemp=nIni;
                for (int i = 0; i <=numero; i++) {
                    if (i==numero) {
                    DIBUJOS.Cory2=nTemp.getiVal();
                    
                    }
                    nTemp=nTemp.getnSig();
                }
              
            }
        }
        
        public int contar(){
        Nodo nTemp=nIni;
        
                while (nTemp.getnSig() !=null) {
                    //System.out.println((nTemp.getiVal()));
                   nTemp=nTemp.getnSig();
                    DIBUJOS.contador++;
                   
                } System.out.println(contador);
                return 0;
        }
        
        
}


class Archivo{

public void CrearArchivoX(String a) { //Tiempo seccion A Minutos
 
FileWriter fw = null;	// la extension al archivo 
try { 
fw = new FileWriter("C:\\Users\\Alán\\Desktop\\Dibujar\\X.txt"); 
BufferedWriter bw = new BufferedWriter(fw); 
PrintWriter salArch = new PrintWriter(bw);
        
        salArch.print(a);
        
    salArch.close();
}catch (IOException ex) { 
}    
}
public void CrearArchivoY(String a) { //Tiempo seccion A Minutos
 
FileWriter fw = null;	// la extension al archivo 
try { 
fw = new FileWriter("C:\\Users\\Alán\\Desktop\\Dibujar\\Y.txt"); 
BufferedWriter bw = new BufferedWriter(fw); 
PrintWriter salArch = new PrintWriter(bw);
        
        salArch.print(a);
        
    salArch.close();
}catch (IOException ex) { 
}    
}
public void CrearArchivoCont(String a) { //Tiempo seccion A Minutos
 
FileWriter fw = null;	// la extension al archivo 
try { 
fw = new FileWriter("C:\\Users\\Alán\\Desktop\\Dibujar\\cont.txt"); 
BufferedWriter bw = new BufferedWriter(fw); 
PrintWriter salArch = new PrintWriter(bw);
        
        salArch.print(a);
        
    salArch.close();
}catch (IOException ex) { 
}    
}

}

class Texto {
    Lista RestablecerX = new Lista();
    Lista RestablecerY = new Lista();
public String leerTxtX(){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Alán\\Desktop\\Dibujar\\X.txt"));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
                
            }
            texto = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }  
        int x=0,i=0,n=0,contador=texto.length();
        for (int j = 0; j <texto.length(); j++) {
            if (texto.charAt(j)=='|') {
               if (j<texto.length()-1){
                j++;}
                String s="";
                while(texto.charAt(j)!='|') {
                s=s+texto.charAt(j);
                
                if (j<texto.length()-1){
                j++;}
                }
                RestablecerX.agregarNodo(new Nodo(Integer.parseInt(s)));
                j--;
                if (s==""){
                }else{
                }
                if (j==texto.length()-2) {
                break;
                }
                }
            
    }
        
        return texto;
    }
public String leerTxtY(){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Alán\\Desktop\\Dibujar\\Y.txt"));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
                
            }
            texto = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }  
        int x=0,i=0,n=0,contador=texto.length();
        
        
        for (int j = 0; j <texto.length(); j++) {
            if (texto.charAt(j)=='|') {
               if (j<texto.length()-1){
                j++;}
                String s="";
                while(texto.charAt(j)!='|') {
                s=s+texto.charAt(j);
                
                if (j<texto.length()-1){
                j++;}
                }
                RestablecerY.agregarNodo(new Nodo(Integer.parseInt(s)));
                j--;
                if (s==""){
                }else{
                }
                if (j==texto.length()-2) {
                break;
                }
                }
            
    }
        
        return texto;
    }
public String leerTxtcont(){ //direccion del archivo
        
        String texto = "";
        
        try{
            BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Alán\\Desktop\\Dibujar\\cont.txt"));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                temp = temp + bfRead; //guardado el texto del archivo
                
            }
            texto = temp;
            
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        String s="";
        for (int j = 0; j <texto.length(); j++) {
            s=s+texto.charAt(j);
    }
        DIBUJOS.cont=Integer.parseInt(s);
        
        return texto;
    }
public void Eliminar(String Direccion) {

    File fichero = new File(Direccion);

    if (fichero.delete())
        System.out.println("Eliminados");
    else
        System.out.println("El fichero no pudó ser borrado");
}

    }  
  

