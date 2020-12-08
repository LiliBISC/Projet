
package Modele;

import Vue_Controller.MainMenu;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Vue_Controller.Chargement;
import static Modele.Sousprogrammes.*;;





public class Main implements DAO_Connection{

   
    public static void main(String[] args)  {
      


        
        data.activation();///lance la base
        //println(data.recherche_client("email","20"));
        //data.supprimer_client("20");
      //for(int i=0;i<25;i++)data.ajouter_client(motaleatoire(5)+"@gmail.com",motaleatoire(4),motaleatoire(4),motaleatoire(8),5);
        //for(int i=0;i<5;i++)data.ajouter_employe(motaleatoire(5)+"@gmail.com",motaleatoire(4),motaleatoire(4),motaleatoire(8));
        //data.SetChampTable("User","id","125","email","");
        //data.SetChampTable("Manege","nom","Roue","n_res",2);
        //println(data.GetChampTable("Reduction","id","0","adulte"));
        if(data.get_connection()!=null){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });}
     
        
    }}
   