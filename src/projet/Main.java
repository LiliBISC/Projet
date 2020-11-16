
package projet;

import projet.Ecran.MainMenu;
import java.sql.*;
import static projet.Sousprogrammes.*;




public class Main implements Serveur{

   
    public static void main(String[] args)  {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
       
   }}