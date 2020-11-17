/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.Ecran;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static projet.Serveur.data;
import static projet.Sousprogrammes.RED;
import static projet.Sousprogrammes.println;

/**
 *
 * @author lilia
 */
public class EmployeeOption extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeOption
     */
    public EmployeeOption() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        customers = new javax.swing.JMenu();
        AllCustomer = new javax.swing.JMenuItem();
        CustomerMember = new javax.swing.JMenuItem();
        CustomerGuest = new javax.swing.JMenuItem();
        ResearchCustomer = new javax.swing.JMenuItem();
        DeleteCustomer = new javax.swing.JMenuItem();
        discounts = new javax.swing.JMenu();
        ChildDiscount = new javax.swing.JMenuItem();
        AdultDiscount = new javax.swing.JMenuItem();
        rides = new javax.swing.JMenu();
        CheckPopular = new javax.swing.JMenuItem();
        AvailableRides = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome to the Employee Option Space");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(Table);

        menu.setBackground(new java.awt.Color(0, 153, 204));
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        menu.setToolTipText("Customer  Discount  Rides  ");
        menu.setAutoscrolls(true);

        customers.setText("Customers");

        AllCustomer.setText("Display all the customer");
        AllCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllCustomerActionPerformed(evt);
            }
        });
        customers.add(AllCustomer);

        CustomerMember.setText("Display all the member customer");
        CustomerMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerMemberActionPerformed(evt);
            }
        });
        customers.add(CustomerMember);

        CustomerGuest.setText("Display all the guest customer");
        CustomerGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerGuestActionPerformed(evt);
            }
        });
        customers.add(CustomerGuest);

        ResearchCustomer.setText("Research a customer");
        ResearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResearchCustomerActionPerformed(evt);
            }
        });
        customers.add(ResearchCustomer);

        DeleteCustomer.setText("Delete a customer");
        DeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerActionPerformed(evt);
            }
        });
        customers.add(DeleteCustomer);

        menu.add(customers);

        discounts.setText("Discounts");

        ChildDiscount.setText("Change the child discount");
        ChildDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChildDiscountActionPerformed(evt);
            }
        });
        discounts.add(ChildDiscount);

        AdultDiscount.setText("Change the adult discount");
        AdultDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdultDiscountActionPerformed(evt);
            }
        });
        discounts.add(AdultDiscount);

        menu.add(discounts);

        rides.setText("Rides");

        CheckPopular.setText("Check the most popular");
        CheckPopular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckPopularActionPerformed(evt);
            }
        });
        rides.add(CheckPopular);

        AvailableRides.setText("Update the currently available rides");
        AvailableRides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvailableRidesActionPerformed(evt);
            }
        });
        rides.add(AvailableRides);

        menu.add(rides);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AllCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllCustomerActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)Table.getModel();
        
        Vector v= new Vector();
        
        try{
            data.resultat = data.statement.executeQuery( "SELECT *FROM User;" );
            
            
            
            while(data.resultat.next())
            {
                v.add(data.resultat.getString("id"));
                v.add(data.resultat.getString("user_type"));
                v.add(data.resultat.getString("email"));
                v.add(data.resultat.getString("mdp"));
                v.add(data.resultat.getString("nom"));
                v.add(data.resultat.getString("prenom"));
                v.add(data.resultat.getString("age"));
                v.add(data.resultat.getString("date_inscription"));
                for(int i=0;i<5;i++){
                d.setRowCount(i);
                d.addRow(v);}
                
            }
        }
            catch(SQLException e){
            println(e.getMessage(),RED);
            }
     
    }//GEN-LAST:event_AllCustomerActionPerformed

    private void ChildDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChildDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChildDiscountActionPerformed

    private void CheckPopularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckPopularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckPopularActionPerformed

    private void ResearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResearchCustomerActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel)Table.getModel();
        d.setRowCount(0);
        String id="";
        String mdp="";
        Vector v= new Vector();
        JOptionPane.showInputDialog("Enter his login : ",id);
        JOptionPane.showInputDialog("Enter his password : ",mdp);
        //boolean result=data.recherche_identifiants_client(id, mdp);
        boolean result=true;
        if(result==true)
        {
            try{
            data.resultat.previous();
            while(data.resultat.next())
            {
                
                if( data.resultat.getString("email").compareTo(id)==0)
                {v.add(data.resultat.getString("id"));
                v.add(data.resultat.getString("user_type"));
                v.add(data.resultat.getString("email"));
                v.add(data.resultat.getString("mdp"));
                v.add(data.resultat.getString("nom"));
                v.add(data.resultat.getString("prenom"));
                v.add(data.resultat.getString("age"));
                v.add(data.resultat.getString("date_inscription"));
                }
                
                
            }
            d.addRow(v);
        }
            catch(SQLException e){
            println(e.getMessage(),RED);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "The login or the password are false","",JOptionPane.WARNING_MESSAGE);
            
        
        
    }//GEN-LAST:event_ResearchCustomerActionPerformed

    private void DeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerActionPerformed
        // TODO add your handling code here:
        String id = null;
        JOptionPane.showInputDialog("Enter his id : ",id);
        data.supprimer_client(id);
    }//GEN-LAST:event_DeleteCustomerActionPerformed

    private void AdultDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdultDiscountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdultDiscountActionPerformed

    private void AvailableRidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableRidesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AvailableRidesActionPerformed

    private void CustomerGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerGuestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerGuestActionPerformed

    private void CustomerMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerMemberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdultDiscount;
    private javax.swing.JMenuItem AllCustomer;
    private javax.swing.JMenuItem AvailableRides;
    private javax.swing.JMenuItem CheckPopular;
    private javax.swing.JMenuItem ChildDiscount;
    private javax.swing.JMenuItem CustomerGuest;
    private javax.swing.JMenuItem CustomerMember;
    private javax.swing.JMenuItem DeleteCustomer;
    private javax.swing.JMenuItem ResearchCustomer;
    private javax.swing.JTable Table;
    private javax.swing.JMenu customers;
    private javax.swing.JMenu discounts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu rides;
    // End of variables declaration//GEN-END:variables
}
