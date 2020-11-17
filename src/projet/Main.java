
package projet;

import projet.Ecran.MainMenu;
import java.sql.*;
import static projet.Sousprogrammes.*;




public class Main implements Serveur{

   
    public static void main(String[] args)  {
      
        data.activation();///lance la base
      //for(int i=0;i<10;i++)data.ajouter_client(motaleatoire(5)+"@gmail.com",motaleatoire(4),motaleatoire(4),motaleatoire(8),5);
        
        if(data.connexion!=null){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
      }
   }}