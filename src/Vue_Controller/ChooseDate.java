/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue_Controller;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import static Modele.DAO_Connection.data;
import static Modele.Sousprogrammes.*;
import javax.swing.JButton;
import javax.swing.JToggleButton;

/**
 *
 * @author lilia
 */
 
public class ChooseDate extends javax.swing.JFrame {

    /**
     * Creates new form ChooseDate
     * @param d
     * @param d2
     * @param m
     */
    public ChooseDate(double d, double d2, String m) {
        initComponents();//Initialize the components
        setLocationRelativeTo(null);//Put the window at the center
        
        ButtonGroup group=new ButtonGroup();//Create a group of buttton
        ButtonGroup group1=new ButtonGroup();//Create a group of buttton
        
        ArrayList dates=new ArrayList<>();//Create a list of date
        dates=data.get_dates(m);//Get the date of the table
        
        for(int i=0;i<dates.size();i++)
        {  
            date.getDayChooser().ColoDay((String) dates.get(i));//Color in the the calendar all the date booked
           
        }
        
        group.add(A0);
        group.add(A1);
        group.add(A2);
        group.add(A3);
        group.add(A4);
        group.add(A5);
        group.add(A6);
        group1.add(C0);
        group1.add(C1);
        group1.add(C2);
        group1.add(C3);
        group1.add(C4);
        group1.add(C5);
        group1.add(C6);
        
        this.discount_child=d;
        this.discount_adult=d2;
        this.manege=m;
        
        //Get the prix of the ride
        prix_manège=(double) data.GetChampTable("Manege", "nom", manege, "prix");
        //set the price in the frame
        title.setText("The price of this ride is : "+prix_manège+"$ by head");

        //Display if the customer has discount
        if(this.discount_child>=1)
        {
            discount.setText("You don't have discount !");
            
        }
        else if(this.discount_child<1)
        {
            discount.setText("The discount is : -"+discount_child*100+"% for each children");
        }
        
        if(this.discount_adult>=1)
        {
            dsc.setText("You don't have discount !");
            
        }
        else if(this.discount_adult<1)
        {
            dsc.setText("The discount is : -"+discount_adult*100+"% for each adult");
        }
        
        
        
    addWindowListener(new WindowAdapter(){///close serv if close jframe
    @Override
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

        jPanel1 = new javax.swing.JPanel();
        done = new javax.swing.JButton();
        arrow = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JCalendar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Tprice = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        C0 = new javax.swing.JToggleButton();
        C1 = new javax.swing.JToggleButton();
        C2 = new javax.swing.JToggleButton();
        C4 = new javax.swing.JToggleButton();
        C3 = new javax.swing.JToggleButton();
        C6 = new javax.swing.JToggleButton();
        C5 = new javax.swing.JToggleButton();
        Cprice = new javax.swing.JTextField();
        discount = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Aprice = new javax.swing.JTextField();
        dsc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        A0 = new javax.swing.JToggleButton();
        A1 = new javax.swing.JToggleButton();
        A2 = new javax.swing.JToggleButton();
        A4 = new javax.swing.JToggleButton();
        A3 = new javax.swing.JToggleButton();
        A6 = new javax.swing.JToggleButton();
        A5 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        done.setBackground(new java.awt.Color(0, 153, 255));
        done.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        done.setForeground(new java.awt.Color(255, 255, 255));
        done.setText("Done ");
        done.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projet/ImageFrame/bouton menu.PNG"))); // NOI18N
        arrow.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        arrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrowActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Choose your date of visit : ");

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setForeground(new java.awt.Color(51, 153, 255));
        date.setDecorationBackgroundColor(new java.awt.Color(255, 255, 255));
        date.setSundayForeground(new java.awt.Color(51, 153, 255));
        date.setWeekdayForeground(new java.awt.Color(51, 153, 255));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText(" Date not available :");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText(" Date available :");

        jPanel5.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(done)
                .addGap(18, 18, 18)
                .addComponent(arrow, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        title.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("jLabel6");

        Tprice.setBackground(new java.awt.Color(0, 153, 255));
        Tprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Tprice.setForeground(new java.awt.Color(255, 255, 255));
        Tprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tprice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        C0.setBackground(new java.awt.Color(255, 255, 255));
        C0.setText("0");
        C0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C0ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.setText("1");
        C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setText("2");
        C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(255, 255, 255));
        C4.setText("4");
        C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(255, 255, 255));
        C3.setText("3");
        C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C6.setBackground(new java.awt.Color(255, 255, 255));
        C6.setText("6");
        C6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(255, 255, 255));
        C5.setText("5");
        C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(C0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(C0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(C4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(C5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(C6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Cprice.setBackground(new java.awt.Color(0, 153, 255));
        Cprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Cprice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        discount.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        discount.setForeground(new java.awt.Color(255, 255, 255));
        discount.setText("jLabel6");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Child (3-12) :");

        Aprice.setBackground(new java.awt.Color(0, 153, 255));
        Aprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Aprice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        dsc.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        dsc.setForeground(new java.awt.Color(255, 255, 255));
        dsc.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adult (+12) :");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        A0.setBackground(new java.awt.Color(255, 255, 255));
        A0.setText("0");
        A0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        A0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A0ActionPerformed(evt);
            }
        });

        A1.setBackground(new java.awt.Color(255, 255, 255));
        A1.setText("1");
        A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setBackground(new java.awt.Color(255, 255, 255));
        A2.setText("2");
        A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A4.setBackground(new java.awt.Color(255, 255, 255));
        A4.setText("4");
        A4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A3.setBackground(new java.awt.Color(255, 255, 255));
        A3.setText("3");
        A3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A6.setBackground(new java.awt.Color(255, 255, 255));
        A6.setText("6");
        A6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        A5.setBackground(new java.awt.Color(255, 255, 255));
        A5.setText("5");
        A5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(A0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(A2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(A3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(A4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(A5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(A6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(A0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Aprice)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dsc)))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cprice, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(discount))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Tprice, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dsc)
                    .addComponent(jLabel2)
                    .addComponent(discount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aprice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cprice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tprice, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        // TODO add your handling code here:
        try{
        //First type of date
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy/MM/dd");
        String date_ = date_format.format(date.getDate());
        //Second type of date
        SimpleDateFormat date1 = new SimpleDateFormat("dd");
        String date_1 = date1.format(date.getDate());
        int b=0;
        for(int i =0;i<data.get_dates(manege).size();i++)//
        {
            if(date_1.equals(data.get_dates(manege).get(i)))//if the date is booked
            {
                try{
                JOptionPane.showMessageDialog(this, "This date is reserved, please choose another date");//Display that the date is booked
                b=1;
                }
                catch (Exception e){
                    
                }
            }
        }
        if(b==0)
        {
            try{
            int a=JOptionPane.showConfirmDialog(this,"Are you sure you want to book on this date : "+date_); //if the date is not booked
            if(a==JOptionPane.YES_OPTION){ //If he chooses the yes option
            data.ajouter_manege_date(manege, date_1);//Add a new date in the table
            Bill j=new Bill(total_price,discount_child, discount_adult, manege);
            j.setVisible(true);//Display the frame of the bill
            setVisible(false);//Close the frame
            }
            }catch (Exception e){
            
            
        }
        } 
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_doneActionPerformed

    //Fonction which calculate the adult price
    private void Price_A(JToggleButton A)
    {
        if(discount_adult<1){//If he has a discount
        double nbAdult=Double.parseDouble(A.getText());//Get the text of the button
        price_adult=nbAdult*prix_manège*(1-discount_adult);//Set the price of adult
        Aprice.setText("Price : "+nombre(price_adult)+"$");//Set the text
        Tprice.setText("Total price : "+nombre(price_adult+price_child)+"$");//set the text
        total_price=price_adult+price_child;//Set the total price
        }
        double nbAdult=Double.parseDouble(A.getText());//Get the text of the button
        price_adult=nbAdult*prix_manège*(discount_adult);//Set the price of adult
        Aprice.setText("Price : "+nombre(price_adult)+"$");//Set the text
        Tprice.setText("Total price : "+nombre(price_adult+price_child)+"$");//set the text
        total_price=price_adult+price_child;//Set the total price
        
    }
    //Fonction which calculate the child price
    private void Price_C(JToggleButton A)
    {
        if(discount_child<1){//If he has a discount
        double nbChild=Double.parseDouble(A.getText());//Get the text of the button
        price_child=nbChild*prix_manège*(1-discount_child);//Set the price of child
        Cprice.setText("Price : "+nombre(price_child)+"$");//Set the text
        Tprice.setText("Total price : "+nombre(price_adult+price_child)+"$");//Set the text
        total_price=price_adult+price_child;//Set the total price
        }
        double nbChild=Double.parseDouble(A.getText());//Get the text of the button
        price_child=nbChild*prix_manège;//Set the price of child
        Cprice.setText("Price : "+nombre(price_child)+"$");//Set the text
        Tprice.setText("Total price : "+nombre(price_adult+price_child)+"$");//Set the text
        total_price=price_adult+price_child;//Set the total price
        
    }
    
    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        Price_A(A1);
    }//GEN-LAST:event_A1ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        Price_A(A3);
    }//GEN-LAST:event_A3ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        Price_C(C1);
    }//GEN-LAST:event_C1ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        Price_C(C3);
    }//GEN-LAST:event_C3ActionPerformed

    private void A0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A0ActionPerformed
        Price_A(A0);
    }//GEN-LAST:event_A0ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        Price_A(A2);
    }//GEN-LAST:event_A2ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        Price_A(A4);
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        Price_A(A5);
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
       Price_A(A6);
    }//GEN-LAST:event_A6ActionPerformed

    private void C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C0ActionPerformed
        Price_C(C0);
    }//GEN-LAST:event_C0ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
Price_C(C2);    }//GEN-LAST:event_C2ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
Price_C(C4);    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
Price_C(C5);    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
Price_C(C6);    }//GEN-LAST:event_C6ActionPerformed

    private void arrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrowActionPerformed
        // TODO add your handling code here:
        ChooseRide j=new ChooseRide(discount_child, discount_adult);
            j.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_arrowActionPerformed

    
    private double price_adult;
    private double price_child;
    private double total_price;
    private double discount_child;
    private double discount_adult;
    private String manege;
    private double prix_manège;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton A0;
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A2;
    private javax.swing.JToggleButton A3;
    private javax.swing.JToggleButton A4;
    private javax.swing.JToggleButton A5;
    private javax.swing.JToggleButton A6;
    private javax.swing.JTextField Aprice;
    private javax.swing.JToggleButton C0;
    private javax.swing.JToggleButton C1;
    private javax.swing.JToggleButton C2;
    private javax.swing.JToggleButton C3;
    private javax.swing.JToggleButton C4;
    private javax.swing.JToggleButton C5;
    private javax.swing.JToggleButton C6;
    private javax.swing.JTextField Cprice;
    private javax.swing.JTextField Tprice;
    private javax.swing.JButton arrow;
    private com.toedter.calendar.JCalendar date;
    private javax.swing.JLabel discount;
    private javax.swing.JButton done;
    private javax.swing.JLabel dsc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    
}