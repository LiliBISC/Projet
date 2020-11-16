
package projet;

import projet.Ecran.jFrame;
import java.sql.*;
import static projet.Sousprogrammes.*;




public class Main {

   
    public static void main(String[] args) throws SQLException {
        DB_memory data=new DB_memory(nom_DB,ip,port, "root", "A44fichaux");
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jFrame().setVisible(true);
            }
        });*/
        
   }}