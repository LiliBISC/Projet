
package projet;

import projet.jFrame.jFrame;
import java.sql.*;
import static projet.Sousprogrammes.*;




public class Main {

   
    public static void main(String[] args) throws SQLException {
        //DB_memory data=new DB_memory("projet8","2.tcp.eu.ngrok.io","14126", "root", "A44fichaux");
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jFrame().setVisible(true);
            }
        });
        
   }}