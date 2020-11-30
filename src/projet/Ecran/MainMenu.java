/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.Ecran;

import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import projet.Serveur;
import projet.Main;
import static projet.Sousprogrammes.println;
/**
 *
 * @author lilia
 */
public class MainMenu extends javax.swing.JFrame implements MouseListener ,Serveur{

    /**
     * Creates new form NewJFrame
     */
    public MainMenu() {
        
        
        initComponents();
        //getContentPane().setBackground(Color.WHITE);
        lb1.addMouseListener(this);
        lb2.addMouseListener(this);
        lb3.addMouseListener(this);
        createMember.addMouseListener(this);
        setLocationRelativeTo(null);
        
        new Thread(new Runnable() {
        public void run(){
        ArrayList url= new ArrayList<>();
        ArrayList icones= new ArrayList<>();
        for(int i=1; i<50; i++)
        {
            url.add("build/classes/projet/ImageFrame/frame-0"+i+".gif");
            icones.add(new ImageIcon((String) url.get(i)));
        }
        int i=0;
        while(true)
        {
        i=i+1;
        
            try {
                 
                    Thread.sleep(100);
                    
                    jLabel5.setIcon((Icon) icones.get(i));
                } catch (InterruptedException ex) {
                    println(ex.getMessage());
                }
        if(i==49)
        {
            i=0;
        }
        }} }).start();
        
        
        addWindowListener(new WindowAdapter(){///close serv if close jframe
    public void windowClosing(WindowEvent e){data.deconnection();}});
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb3 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        createMember = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 159, 159));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.lightGray);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lb3.setBackground(new java.awt.Color(204, 204, 204));
        lb3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(0, 153, 255));
        lb3.setText("Employee Space");
        lb3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        lb3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lb1.setBackground(new java.awt.Color(204, 204, 204));
        lb1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lb1.setForeground(new java.awt.Color(0, 153, 255));
        lb1.setText("Member Customer");
        lb1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        lb1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lb2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(0, 153, 255));
        lb2.setText("Guest Customer");
        lb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        lb2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setBackground(new java.awt.Color(215, 215, 235));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/logo.PNG"))); // NOI18N

        createMember.setFont(new java.awt.Font("Verdana", 3, 12)); // NOI18N
        createMember.setForeground(new java.awt.Color(255, 0, 0));
        createMember.setText("Create a member account ");
        createMember.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96)
                .addComponent(createMember))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createMember)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb1)
                        .addGap(46, 46, 46)
                        .addComponent(lb2)
                        .addGap(50, 50, 50)
                        .addComponent(lb3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createMember;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
        
        if(me.getSource()==lb1)
        {
            MemberPlace j=new MemberPlace();
            j.setVisible(true);
            setVisible(false);
        }
        else if(me.getSource()==lb2)
        {
            ChooseRide j= new ChooseRide(1,1);
            j.setVisible(true);
            setVisible(false);
        }
        else if(me.getSource()==createMember)
        {
            CreateMember j=new CreateMember();
            j.setVisible(true);
            setVisible(false);
            
        }
        else if(me.getSource()==lb3)
        {
            EmployeeSpace j=new EmployeeSpace();
            j.setVisible(true);
            setVisible(false);
        }
            
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
