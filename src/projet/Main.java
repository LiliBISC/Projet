
package projet;

import projet.Ecran.MainMenu;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import projet.Ecran.Chargement;
import static projet.Sousprogrammes.*;;





public class Main implements Serveur{

   
    public static void main(String[] args)  {
      


        
       /* data.activation();///lance la base
        //println(data.recherche_client("email","20"));
        //data.supprimer_client("20");
      //for(int i=0;i<25;i++)data.ajouter_client(motaleatoire(5)+"@gmail.com",motaleatoire(4),motaleatoire(4),motaleatoire(8),5);
        //for(int i=0;i<5;i++)data.ajouter_employe(motaleatoire(5)+"@gmail.com",motaleatoire(4),motaleatoire(4),motaleatoire(8));
        if(data.connexion!=null){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });*/
      //}
        Chargement j= new Chargement();
        j.charg();
        
        
   }}