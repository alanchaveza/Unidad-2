
package dibujar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import static java.awt.image.ImageObserver.WIDTH;


public class DIBUJOS extends javax.swing.JFrame {
Lista x= new Lista();
Lista y= new Lista();
   static int cont=0;
    int x1,y1,x2,y2;
    String sX="|";
    String sY="|";
    static int contador=0;
    public DIBUJOS() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        popupMenu1 = new java.awt.PopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        canvas1 = new java.awt.Canvas();
        canvas2 = new java.awt.Canvas();
        Restablecer = new java.awt.Button();
        Nuevo = new java.awt.Button();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button5 = new java.awt.Button();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvas2MouseClicked(evt);
            }
        });

        Restablecer.setActionCommand("Restablecer");
        Restablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Restablecer.setLabel("Restablecer");
        Restablecer.setName("Restablecer"); // NOI18N
        Restablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestablecerMouseClicked(evt);
            }
        });
        Restablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestablecerActionPerformed(evt);
            }
        });

        Nuevo.setLabel("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(51, 0, 255));
        button1.setLabel("Azul");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 255, 51));
        button2.setLabel("Verde");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(255, 0, 0));
        button3.setLabel("Rojo");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 255, 0));
        button4.setLabel("Amarillo");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setLabel("Cerrar Figura");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Restablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvas2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Restablecer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        Restablecer.getAccessibleContext().setAccessibleDescription("Restablecer");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static int Corx1=0,Corx2=0,Cory1=0,Cory2=0;
    private void RestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestablecerActionPerformed
        
        Texto a= new Texto();
        Lista ls=new Lista();
        a.leerTxtX();
        a.leerTxtY();
        
        a.RestablecerX.contar();
       a.RestablecerX.ImprimirListaX(0);
        a.RestablecerY.ImprimirListaY(0);
        Corx1=Corx2;
        Cory1=Cory2;
        Graphics grMiDibu=canvas2.getGraphics();
        
        for (int i = 1; i < cont; i++) {
            System.out.println("I=" + i);
            a.RestablecerX.ImprimirListaX(i);
            a.RestablecerY.ImprimirListaY(i);
            System.out.println("Uniendo x1 " +Corx1 + ",y1 " + Cory1+" con x2 " + Corx2+ ", y2 "+Cory2);
            grMiDibu.drawLine(Corx1, Cory1, Corx2, Cory2);
            
            Corx1=Corx2;
            Cory1=Cory2;
            
        }
        
    }//GEN-LAST:event_RestablecerActionPerformed

    private void RestablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestablecerMouseClicked
        
        
      
        
    }//GEN-LAST:event_RestablecerMouseClicked

    
    private void canvas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas2MouseClicked
     
   class Cordenadas {
       int antX,Anty;
        public void GuardarCordenadas(){
            x2=x1; y2=y1;
            Point pMiclick = evt.getPoint();
            canvas2.getGraphics().drawRect(pMiclick.x, pMiclick.y, 5,5);
            System.out.println("contador" + cont);
            x.agregarNodo(new Nodo((int)(pMiclick.x)));
            y.agregarNodo(new Nodo((int)(pMiclick.y)));
            x1=pMiclick.x;
            y1=pMiclick.y;
            sX=sX+Integer.toString(x1)+"|";
            sY=sY+Integer.toString(y1)+"|";
            
        }
        public void Dibujar(){
            Graphics grMiDibu=canvas2.getGraphics();
            if (cont>=1) {
            grMiDibu.drawLine(x1, y1, x2, y2);
            }
            
        }
    }
      Cordenadas a= new Cordenadas();
      a.GuardarCordenadas();
      a.Dibujar();
      cont++;
      Archivo Ar=new Archivo();
      Ar.CrearArchivoX(sX);
      Ar.CrearArchivoY(sY);
      Ar.CrearArchivoCont(Integer.toString(cont));
      
    }//GEN-LAST:event_canvas2MouseClicked

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
Texto b= new Texto();
b.Eliminar("C:\\Users\\Alán\\Desktop\\Dibujar\\cont.txt");
b.Eliminar("C:\\Users\\Alán\\Desktop\\Dibujar\\Y.txt");
b.Eliminar("C:\\Users\\Alán\\Desktop\\Dibujar\\X.txt");
        
    }//GEN-LAST:event_NuevoActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
Texto a= new Texto();
        Lista ls=new Lista();
        a.leerTxtX();
        a.leerTxtY();
        
        a.RestablecerX.contar();
       a.RestablecerX.ImprimirListaX(0);
        a.RestablecerY.ImprimirListaY(0);
        Corx1=Corx2;
        Cory1=Cory2;
        Graphics grMiDibu=canvas2.getGraphics();
        
        for (int i = 1; i < cont; i++) {
            System.out.println("I=" + i);
            a.RestablecerX.ImprimirListaX(i);
            a.RestablecerY.ImprimirListaY(i);
            System.out.println("Uniendo x1 " +Corx1 + ",y1 " + Cory1+" con x2 " + Corx2+ ", y2 "+Cory2);
            grMiDibu.setColor(Color.yellow);
            grMiDibu.drawLine(Corx1, Cory1, Corx2, Cory2);
            Corx1=Corx2;
            Cory1=Cory2;
            
        }        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       Texto a= new Texto();
        Lista ls=new Lista();
        a.leerTxtX();
        a.leerTxtY();
        
        a.RestablecerX.contar();
       a.RestablecerX.ImprimirListaX(0);
        a.RestablecerY.ImprimirListaY(0);
        Corx1=Corx2;
        Cory1=Cory2;
        Graphics grMiDibu=canvas2.getGraphics();
        
        for (int i = 1; i < cont; i++) {
            System.out.println("I=" + i);
            a.RestablecerX.ImprimirListaX(i);
            a.RestablecerY.ImprimirListaY(i);
            System.out.println("Uniendo x1 " +Corx1 + ",y1 " + Cory1+" con x2 " + Corx2+ ", y2 "+Cory2);
            grMiDibu.setColor(Color.blue);
            grMiDibu.drawLine(Corx1, Cory1, Corx2, Cory2);
            Corx1=Corx2;
            Cory1=Cory2;
            
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        Texto a= new Texto();
        Lista ls=new Lista();
        a.leerTxtX();
        a.leerTxtY();
        
        a.RestablecerX.contar();
       a.RestablecerX.ImprimirListaX(0);
        a.RestablecerY.ImprimirListaY(0);
        Corx1=Corx2;
        Cory1=Cory2;
        Graphics grMiDibu=canvas2.getGraphics();
        
        for (int i = 1; i < cont; i++) {
            System.out.println("I=" + i);
            a.RestablecerX.ImprimirListaX(i);
            a.RestablecerY.ImprimirListaY(i);
            System.out.println("Uniendo x1 " +Corx1 + ",y1 " + Cory1+" con x2 " + Corx2+ ", y2 "+Cory2);
            grMiDibu.setColor(Color.green);
            grMiDibu.drawLine(Corx1, Cory1, Corx2, Cory2);
            Corx1=Corx2;
            Cory1=Cory2;
            
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        Texto a= new Texto();
        Lista ls=new Lista();
        a.leerTxtX();
        a.leerTxtY();
        
        a.RestablecerX.contar();
       a.RestablecerX.ImprimirListaX(0);
        a.RestablecerY.ImprimirListaY(0);
        Corx1=Corx2;
        Cory1=Cory2;
        Graphics grMiDibu=canvas2.getGraphics();
        
        for (int i = 1; i < cont; i++) {
            System.out.println("I=" + i);
            a.RestablecerX.ImprimirListaX(i);
            a.RestablecerY.ImprimirListaY(i);
            System.out.println("Uniendo x1 " +Corx1 + ",y1 " + Cory1+" con x2 " + Corx2+ ", y2 "+Cory2);
            grMiDibu.setColor(Color.red);
            grMiDibu.drawLine(Corx1, Cory1, Corx2, Cory2);
            Corx1=Corx2;
            Cory1=Cory2;
            
        }
    }//GEN-LAST:event_button3ActionPerformed
   static int n1,n2,n3,n4,temp;
    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
       Texto b = new Texto();
       Graphics grMiDibu=canvas2.getGraphics();
       x.ImprimirListaX(0);
       n1=temp;
       y.ImprimirListaX(0);
       n2=temp;
       x.ImprimirListaX(cont-1);
       n3=temp;
       y.ImprimirListaX(cont-1);
       n4=temp;
        System.out.println("n1"+n1);
        System.out.println("n2"+n2);
        System.out.println("n3"+n3);
        System.out.println("n4"+n4);
       grMiDibu.drawLine(n1, n2, n3, n4);
    }//GEN-LAST:event_button5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DIBUJOS().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Nuevo;
    private java.awt.Button Restablecer;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
