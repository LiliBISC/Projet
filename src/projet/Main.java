
package projet;

import projet.Ecran.MainMenu;
import java.sql.*;
import static projet.Sousprogrammes.*;




public class Main implements Serveur{

   
    public static void main(String[] args)  {
      
        
        data.activation();///lance la base
      
        if(data.connexion!=null){
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
      }
   }}