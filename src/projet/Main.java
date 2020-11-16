
package projet;

import projet.Ecran.MainMenu;
import java.sql.*;
import static projet.Sousprogrammes.*;




public class Main implements Serveur{

   
    public static void main(String[] args)  {
       
        data.recherche_identifiants_client("4", "5");
        data.recherche_age_client("m","m");
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });*/
       
   }}