/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.Ecran;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import projet.DB_memory;
import projet.Serveur;
import static projet.Serveur.data;
import static projet.Sousprogrammes.*;

/**
 *
 * @author lilia
 */
public class Bill extends javax.swing.JFrame implements MouseListener,Serveur {

    /**
     * Creates new form jFrame3
     */
    public Bill(double b, double c, double a) {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        ButtonGroup g=new ButtonGroup();
        this.total_price=b;
        this.discount_adult=a;
        this.discount_child=c;
        g.add(J1);
        g.add(J2);
        g.add(J3);
        g.add(J4);
        TotalBill.setText(""+total_price+"$");
        arrow.addMouseListener(this);
        show.addMouseListener(this);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter(){///close serv if close jframe
    public void windowClosing(WindowEvent e){data.deconnection();}});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        expiry = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        arrow = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cryptogram = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cardNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        J1 = new javax.swing.JRadioButton();
        J2 = new javax.swing.JRadioButton();
        J3 = new javax.swing.JRadioButton();
        J4 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TotalBill = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        Area = new javax.swing.JScrollPane();
        billTicket = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        expiry.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        expiry.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Card number :");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText(" Expiry :");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Secure payment of your order");

        confirm.setBackground(new java.awt.Color(204, 204, 204));
        confirm.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        confirm.setForeground(new java.awt.Color(51, 153, 255));
        confirm.setText("Done");
        confirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/fleche sur la gauche.PNG"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText(" Visual cryptogram :");

        cryptogram.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cryptogram.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Name :");

        cardNumber.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cardNumber.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/CB.PNG"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/mastercard.PNG"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/visa.PNG"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/paypal.PNG"))); // NOI18N

        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J2ActionPerformed(evt);
            }
        });

        J3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J3ActionPerformed(evt);
            }
        });

        J4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setText("Select a card to pay for your booking");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel11.setText("Total of your order :");

        TotalBill.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        TotalBill.setForeground(new java.awt.Color(255, 153, 0));

        show.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        show.setText("Show the bill");
        show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        error.setFont(new java.awt.Font("Verdana", 2, 10)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));

        billTicket.setColumns(20);
        billTicket.setRows(5);
        Area.setViewportView(billTicket);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(J1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addGap(55, 55, 55)
                                        .addComponent(J3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(J4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(55, 55, 55)
                                .addComponent(J2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(TotalBill)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cryptogram, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(38, 38, 38)
                                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(282, 282, 282)
                                                .addComponent(error)))
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(expiry, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show)
                    .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TotalBill))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(J1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(J3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(J4))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel7))))
                                        .addGap(106, 106, 106))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(J2)
                                        .addGap(136, 136, 136)))
                                .addComponent(error)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(expiry, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cryptogram, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(show)
                        .addGap(11, 11, 11)
                        .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
       
        if(name.getText().equals("") || cardNumber.getText().equals("")|| cryptogram.getText().equals("")||expiry.getText().equals("") )
        {
            error.setText("One of the fields is empty !");
        }
        else
        {
            new Thread(new Runnable() {
        public void run(){
           Chargement j=new Chargement();
            j.setVisible(true);
            j.setDefaultCloseOperation(j.DO_NOTHING_ON_CLOSE);
            j.charg();
            int a=JOptionPane.showConfirmDialog(null, "Thanks for your order mr "+name.getText()+" ! Do you want to book an other ride ?");
            j.setVisible(false);
            if(a==JOptionPane.YES_OPTION){
                ChooseRide c=new ChooseRide(discount_child,discount_adult);
                c.setVisible(true);
                setVisible(false);
            }
            setVisible(false);
            MainMenu c=new MainMenu();
            c.setVisible(true);
             } }).start();
               
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        // TODO add your handling code here:  
            card="Blue Card";
    }//GEN-LAST:event_J1ActionPerformed

    private void J3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J3ActionPerformed
        // TODO add your handling code here:
        card="VISA";
    }//GEN-LAST:event_J3ActionPerformed

    private void J4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J4ActionPerformed
        // TODO add your handling code here:
        card="Master Card";
    }//GEN-LAST:event_J4ActionPerformed

    private void J2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J2ActionPerformed
        // TODO add your handling code here:
        card="PayPal";
    }//GEN-LAST:event_J2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private double total_price;
    private double discount_adult;
    private double discount_child;
    private String card;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Area;
    private javax.swing.JRadioButton J1;
    private javax.swing.JRadioButton J2;
    private javax.swing.JRadioButton J3;
    private javax.swing.JRadioButton J4;
    private javax.swing.JLabel TotalBill;
    private javax.swing.JButton arrow;
    private javax.swing.JTextArea billTicket;
    private javax.swing.JTextField cardNumber;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField cryptogram;
    private javax.swing.JLabel error;
    private javax.swing.JTextField expiry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables

    public String type_customer()
    {
        String type="";
        if(discount_child==1 && discount_adult==1)
        {type="Guest";
        return type;}
        else
        {type="Member";
            return type;
        }      
    }
    
    
    @Override
    public void mouseClicked(MouseEvent me) {
        if(me.getSource()==arrow)
        {
            MainMenu j=new MainMenu();
            j.setVisible(true);
            setVisible(false);
        }
        else if(me.getSource()==show)
        {
            Date aujourdhui = new Date();
            DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"********************************************************************************************************\n");
            billTicket.setText(billTicket.getText()+"*********************************************Bill Ticket************************************************\n");
            billTicket.setText(billTicket.getText()+"********************************************************************************************************\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"Customer type : "+"\t"+type_customer()+"\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"Name : "+"\t"+name.getText()+"\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"Ride : "+"\t"+"\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"Date/Hour of payment: "+"\t"+mediumDateFormat.format(aujourdhui)+"\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"Payment : "+"\t"+card+"\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"********************************************************************************************************\n");
            billTicket.setText(billTicket.getText()+"\n");
            billTicket.setText(billTicket.getText()+"                                                          Total price : "+"\t"+total_price+"$\n");
            billTicket.setText(billTicket.getText()+"\n");        
            billTicket.setText(billTicket.getText()+"********************************************************************************************************\n");  
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
