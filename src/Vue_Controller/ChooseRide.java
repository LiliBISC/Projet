/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue_Controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static Modele.DAO_Connection.data;
import static Modele.Sousprogrammes.println;
import javax.swing.JOptionPane;


/**
 *
 * @author lilia
 */
public class ChooseRide extends javax.swing.JFrame implements MouseListener{

    /**
     * Creates new form jFrame4
     */
    public ChooseRide(double dC, double dA) {
        initComponents();//Initialize the components
        getContentPane().setBackground(Color.WHITE);//set the color of the background in white
        ride3.addMouseListener(this);//Add the button at the mouseListener
        ride1.addMouseListener(this);//Add the button at the mouseListener
        ride2.addMouseListener(this);//Add the button at the mouseListener
        ride4.addMouseListener(this);//Add the button at the mouseListener
        ride5.addMouseListener(this);//Add the button at the mouseListener
        ride6.addMouseListener(this);//Add the button at the mouseListener
        photo.addMouseListener(this);//Add the button at the mouseListener
        this.discount_child=dC;
        this.discount_adult=dA;
        this.manege="";
        setLocationRelativeTo(null);//Display the frame at the center of the screen
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

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menue = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ride1 = new javax.swing.JLabel();
        ride3 = new javax.swing.JLabel();
        ride2 = new javax.swing.JLabel();
        ride4 = new javax.swing.JLabel();
        ride5 = new javax.swing.JLabel();
        ride6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 2));
        photo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Choose your ride");

        menue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/bouton menu.PNG"))); // NOI18N
        menue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(menue, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(menue, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        ride1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ride1.setForeground(new java.awt.Color(255, 255, 255));
        ride1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ride1.setText("The Boat");
        ride1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ride1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ride3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ride3.setForeground(new java.awt.Color(255, 255, 255));
        ride3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ride3.setText("Roller Coaster");
        ride3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ride3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ride2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ride2.setForeground(new java.awt.Color(255, 255, 255));
        ride2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ride2.setText("The Flying Chairs");
        ride2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ride2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ride4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ride4.setForeground(new java.awt.Color(255, 255, 255));
        ride4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ride4.setText("Roue");
        ride4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ride4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ride5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ride5.setForeground(new java.awt.Color(255, 255, 255));
        ride5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ride5.setText("Megatron");
        ride5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ride5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ride6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ride6.setForeground(new java.awt.Color(255, 255, 255));
        ride6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ride6.setText("Poney");
        ride6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ride6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ride1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ride2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ride3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ride5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ride6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ride4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(ride1)
                .addGap(18, 18, 18)
                .addComponent(ride2)
                .addGap(18, 18, 18)
                .addComponent(ride3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ride4)
                .addGap(18, 18, 18)
                .addComponent(ride5)
                .addGap(18, 18, 18)
                .addComponent(ride6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//If the menu button is pressed
    private void menueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menueActionPerformed
        // TODO add your handling code here:
        MainMenu j=new MainMenu();
        j.setVisible(true);//Display the menu
        setVisible(false);//Close the frame
    }//GEN-LAST:event_menueActionPerformed


    protected double discount_child;
    protected double discount_adult;
    protected String manege;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton menue;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel ride1;
    private javax.swing.JLabel ride2;
    private javax.swing.JLabel ride3;
    private javax.swing.JLabel ride4;
    private javax.swing.JLabel ride5;
    private javax.swing.JLabel ride6;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
        try{
        if(me.getSource()==photo)//If he click on the photo
        {
            if(manege.equals(""))//If the field manege is empty
        { try{
                JOptionPane.showMessageDialog(this, "You have not clicked on a ride !");//Error message
                }
         catch(Exception e)
                {
                    
                }}
            ChooseDate j=new ChooseDate(discount_child,discount_adult, manege);
            j.setVisible(true);//Display the frame choosedate
            setVisible(false);//Close the frame
            int a=((int) data.GetChampTable("Manege", "nom", manege, "n_res"));//Get the number of book of this ride
            data.SetChampTable("Manege", "nom",manege, "n_res", a+1);//Set the number of book of this ride
        }
        }catch(Exception e)
                {
                    
                }
        
        
        String imgUrl_ride3="build/classes/projet/ImageFrame/Capture1.PNG";//Url of the image
        String imgUrl_ride1="build/classes/projet/ImageFrame/Capture3.PNG";//Url of the image
        String imgUrl_ride2="build/classes/projet/ImageFrame/Capture2.PNG";//Url of the image
        String imgUrl_ride4="build/classes/projet/ImageFrame/OIP (1).jpg";//Url of the image
        String imgUrl_ride6="build/classes/projet/ImageFrame/OIP (2).jpg";//Url of the image
        String imgUrl_ride5="build/classes/projet/ImageFrame/Capture.JPG";//Url of the image
        if(me.getSource()==ride1)//If he click on this ride
        {
            Icon icone=new ImageIcon(imgUrl_ride1);//Create a new icon
            manege="Boat";//Set manege
            photo.setIcon(icone); //Set a new Icon                        
        }
        else if(me.getSource()==ride2)//If he click on this ride
        {
            Icon icone=new ImageIcon(imgUrl_ride2);//Create a new icon
            manege="The Flying Chairs";//Set manege
            photo.setIcon(icone);//Set a new Icon

        }
        else if(me.getSource()==ride3)//If he click on this ride
        {
            Icon icone=new ImageIcon(imgUrl_ride3);//Create a new icon
            manege="Roller Coaster";//Set manege
            photo.setIcon(icone);//Set a new Icon
        }
        else if(me.getSource()==ride4)//If he click on this ride
        {
            Icon icone=new ImageIcon(imgUrl_ride4);//Create a new icon
            manege="Roue";//Set manege
            photo.setIcon(icone);//Set a new Icon

        }
        else if(me.getSource()==ride5)//If he click on this ride
        {
            Icon icone=new ImageIcon(imgUrl_ride5);//Create a new icon
            manege="MegaTron";//Set manege
            photo.setIcon(icone);//Set a new Icon

        }
        else if(me.getSource()==ride6)//If he click on this ride
        {
            Icon icone=new ImageIcon(imgUrl_ride6);//Create a new icon
            manege="Poney";//Set manege
            photo.setIcon(icone);//Set a new Icon
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
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
