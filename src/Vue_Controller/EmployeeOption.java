/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue_Controller;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import static Modele.DAO_Connection.data;
import static Modele.Sousprogrammes.RED;
import static Modele.Sousprogrammes.println;

/**
 *
 * @author lilia
 */
public class EmployeeOption extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeOption
     */
    public EmployeeOption() {
        initComponents();//Initialize the components
        getContentPane().setBackground(Color.WHITE);//Set te color of the background in white
       
        setLocationRelativeTo(null);//Display the frame at the center of the screen
        addWindowListener(new WindowAdapter(){///close serv if close jframe
    @Override
    public void windowClosing(WindowEvent e){data.deconnection();}});
    }

    //Function which initialize the customer table
    public void init_tableau_client(){
        String[] columnNames = {"id","type","email","nom","prenom","age","date_inscription"};//Set the column name
        DefaultTableModel d = (DefaultTableModel)Table.getModel();
        d.setRowCount(0);
        d.setColumnIdentifiers(columnNames);///set the title of the columns
        try{
            
            while(data.get_resultat().next())
            {
               //Add the columns
<<<<<<< HEAD
                Object [] newRowData = {data.resultat.getString("id"),data.resultat.getString("user_type"),data.resultat.getString("email"),data.resultat.getString("nom"),
                data.resultat.getString("prenom"),data.resultat.getString("age"),data.resultat.getString("date_inscription")};//get all of the table
=======
                Object [] newRowData = {data.get_resultat().getString("id"),data.get_resultat().getString("user_type"),data.get_resultat().getString("email"),data.get_resultat().getString("nom"),
                data.get_resultat().getString("prenom"),data.get_resultat().getString("age"),data.get_resultat().getString("date_inscription")};
>>>>>>> aie
                d.addRow(newRowData);///add at the line
                
            }
            
        }
            catch(SQLException e){
            println(e.getMessage(),RED);
            }
        
    }
    //Function which initialize the employee table
    public void init_tableau_contact(){
          String[] columnNames = {"id","type","email","nom","prenom"};//Set the column name
        DefaultTableModel d = (DefaultTableModel)Table.getModel();
        d.setRowCount(0);
        d.setColumnIdentifiers(columnNames);///set the title of the columns
        try{
            
            data.set_resultat(data.get_statement().executeQuery("SELECT *FROM Employe;"));
            while(data.get_resultat().next())
            {
<<<<<<< HEAD
               //add the columns
               Object [] newRowData = {data.resultat.getString("id"),data.resultat.getString("user_type"),data.resultat.getString("email"),data.resultat.getString("nom"),
                data.resultat.getString("prenom")};//get all of the table
                d.addRow(newRowData);///add at the line
=======
               //on ajoute les colonnes
               Object [] newRowData = {data.get_resultat().getString("id"),data.get_resultat().getString("user_type"),data.get_resultat().getString("email"),
                   data.get_resultat().getString("nom"),
                data.get_resultat().getString("prenom")};
                d.addRow(newRowData);///on ajoute la ligne
>>>>>>> aie
            }
            
        }
            catch(SQLException e){
            println(e.getMessage(),RED);
            }
    }
    
    //Function which initialize the unvailable rides table
    public void init_tableau_unavailable(){
        String[] columnNames = {"id","manege","date"};
        DefaultTableModel d = (DefaultTableModel)Table.getModel();
        d.setRowCount(0);
        d.setColumnIdentifiers(columnNames);
        
        try{
           
            data.set_resultat(data.get_statement().executeQuery("SELECT *FROM Ticket;"));
            
            while(data.get_resultat().next())
            {
               //on ajoute les colonnes
               Object [] newRowData = {data.get_resultat().getString("id"),data.get_resultat().getString("Nom_manege"),data.get_resultat().getString("date"),};
                d.addRow(newRowData);///on ajoute la ligne
                
            }
            
        }
            catch(SQLException e){
            println(e.getMessage(),RED);
            }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boutonMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        customers = new javax.swing.JMenu();
        AllDisplayCustomer = new javax.swing.JMenuItem();
        ShowContact = new javax.swing.JMenuItem();
        DeleteCustomer = new javax.swing.JMenuItem();
        discounts = new javax.swing.JMenu();
        ChildDiscount = new javax.swing.JMenuItem();
        AdultDiscount = new javax.swing.JMenuItem();
        rides = new javax.swing.JMenu();
        CheckPopular = new javax.swing.JMenuItem();
        UnavailableRides = new javax.swing.JMenuItem();
        AvailableRides = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Panel");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 255), 2, true));

        boutonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/bouton menu.PNG"))); // NOI18N
        boutonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boutonMenuActionPerformed(evt);
            }
        });

        Table.setBackground(new java.awt.Color(153, 204, 255));
        Table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));
        Table.setFocusable(false);
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(boutonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boutonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        menu.setToolTipText("Customer  Discount  Rides  ");
        menu.setAutoscrolls(true);

        customers.setText("Customers");

        AllDisplayCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        AllDisplayCustomer.setText("Display all the customer");
        AllDisplayCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllDisplayCustomerActionPerformed(evt);
            }
        });
        customers.add(AllDisplayCustomer);

        ShowContact.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        ShowContact.setText("Show contact");
        ShowContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowContactActionPerformed(evt);
            }
        });
        customers.add(ShowContact);

        DeleteCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
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

        UnavailableRides.setText("Show the unavailable dates of rides");
        UnavailableRides.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnavailableRidesActionPerformed(evt);
            }
        });
        rides.add(UnavailableRides);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//If the alldisplay button is performed
    private void AllDisplayCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllDisplayCustomerActionPerformed
        // TODO add your handling code here:
        init_tableau_client();
     
    }//GEN-LAST:event_AllDisplayCustomerActionPerformed
//If the child disocunt is performed
    private void ChildDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChildDiscountActionPerformed
        // TODO add your handling code here:
        try{
        String b=JOptionPane.showInputDialog(this, "Enter the new discount :");//Ask the Employee to write the new discount
        double r_e=Double.parseDouble(b);
        data.set_reduction_enfant(r_e);}//Set the new discount in the table
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_ChildDiscountActionPerformed

    private void CheckPopularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckPopularActionPerformed
        // TODO add your handling code here:
        DefaultPieDataset barchart_ride=new DefaultPieDataset();//Construct the pie chart
        barchart_ride.setValue("Boat", new Integer((int)data.GetChampTable("Manege", "nom", "Boat", "n_res")));//set the value
        barchart_ride.setValue("MegaTron", new Integer((int)data.GetChampTable("Manege", "nom","MegaTron" , "n_res")));////set the value
        barchart_ride.setValue("Poney", new Integer((int)data.GetChampTable("Manege", "nom","Poney" , "n_res")));//set the value
        barchart_ride.setValue("Roller Coaster", new Integer((int)data.GetChampTable("Manege", "nom","Roller Coaster" , "n_res")));//set the value
        barchart_ride.setValue("Roue", new Integer((int)data.GetChampTable("Manege", "nom","Roue" , "n_res")));         //set the value
        barchart_ride.setValue("The Flying Chairs", new Integer((int)data.GetChampTable("Manege", "nom","The Flying Chairs" , "n_res")));//set the value         
        
        JFreeChart b= ChartFactory.createPieChart3D("Popularity", barchart_ride, true,true, false);//Create a pie chart in 3D
        
        PiePlot P=(PiePlot)b.getPlot();
        P.setSectionPaint("Boat", Color.gray);//Display the section
        P.setSectionPaint("MegaTron",Color.BLUE );//Display the section
        P.setSectionPaint("Roller Coaster",Color.CYAN);//Display the section
        P.setSectionPaint("Roue",Color.darkGray);//Display the section
        P.setSectionPaint("The Flying Chairs", Color.LIGHT_GRAY);//Display the section
        P.setSectionPaint("The Poney", Color.pink);//Display the section
        P.setBackgroundAlpha(TOP_ALIGNMENT);
        
        ChartFrame frame=new ChartFrame("Popularity", b);//Create a new frame for the pie chart
        frame.setSize(684,489);//Set his size
        frame.setLocationRelativeTo(null);//Set his location
        frame.setBackground(Color.white);//Set his color of his background
        frame.setVisible(true);//Display the frame
    }//GEN-LAST:event_CheckPopularActionPerformed

    private void DeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerActionPerformed
        // TODO add your handling code here:
        try{
        String email ="";
        email=JOptionPane.showInputDialog("Enter his email : ");//Ask the employee to write the email of the customer
        data.supprimer_client(email);//delete the customer
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_DeleteCustomerActionPerformed

    private void AdultDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdultDiscountActionPerformed
        // TODO add your handling code here:
        try{
        String b=JOptionPane.showInputDialog(this, "Enter the new discount :");//Ask the Employee to write the new discount
        double r_a=Double.parseDouble(b);
        data.set_reduction_adulte(r_a);}//set the new discount
        catch(Exception e)
        {
            
        }
        
    }//GEN-LAST:event_AdultDiscountActionPerformed

    private void AvailableRidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvailableRidesActionPerformed
        // TODO add your handling code here:
        try
        {String choix[]={"remove an unavailable date","add an unavailable date"};
        String b;
        b = (String) JOptionPane.showInputDialog(this, "What do you want to do ?","Choice",JOptionPane.QUESTION_MESSAGE, null, choix, choix[0]);//Ask the employee if he wants to reove or add
        if(b.equals(choix[0]))//If he wants to remove
        {
            try{
            String a=JOptionPane.showInputDialog(this,"Ride : " );//Ask the name of the ride
            String c=JOptionPane.showInputDialog(this,"Date : " );//ask the date
            data.supprimer_manege_date(a, c);}//delete the ride and the date in the table
            catch(Exception e)
        {
            
        }
        }
        else if(b.equals(choix[1]))
        {
            try{
            String a=JOptionPane.showInputDialog(this,"Ride : " );//Ask the name of the ride
            String c=JOptionPane.showInputDialog(this,"Date : "); //ask the date  
            data.ajouter_manege_date(a, c);}//Add the ride and the date in the table
            catch(Exception e)
        {
            
        }
        }}
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_AvailableRidesActionPerformed

    private void ShowContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowContactActionPerformed
      init_tableau_contact();
    }//GEN-LAST:event_ShowContactActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TableMouseClicked

    private void boutonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boutonMenuActionPerformed
        // TODO add your handling code here:
        MainMenu j=new MainMenu();
        j.setVisible(true);//display the menu
        setVisible(false);
    }//GEN-LAST:event_boutonMenuActionPerformed

    private void UnavailableRidesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnavailableRidesActionPerformed
        // TODO add your handling code here:
        init_tableau_unavailable();
    }//GEN-LAST:event_UnavailableRidesActionPerformed

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
    private javax.swing.JMenuItem AllDisplayCustomer;
    private javax.swing.JMenuItem AvailableRides;
    private javax.swing.JMenuItem CheckPopular;
    private javax.swing.JMenuItem ChildDiscount;
    private javax.swing.JMenuItem DeleteCustomer;
    private javax.swing.JMenuItem ShowContact;
    private javax.swing.JTable Table;
    private javax.swing.JMenuItem UnavailableRides;
    private javax.swing.JButton boutonMenu;
    private javax.swing.JMenu customers;
    private javax.swing.JMenu discounts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu rides;
    // End of variables declaration//GEN-END:variables

}
