
package projet;

import java.sql.*;




public class Projet {

   
    public static void main(String[] args) throws SQLException {
    
        try{Class.forName("com.mysql.jdbc.Driver");System.out.println("Driver initialisé");}
        catch(Exception e){System.out.println("Erreur driver");}
        
        try {
   
  Connection connexion= DriverManager.getConnection( "jdbc:mysql://localhost:3306/projet8", "root", "A44fichaux" );
System.out.println("Connection ok");
Statement statement = connexion.createStatement();

statement.executeUpdate("INSERT INTO Utilisateur (nom,prenom, mot_de_passe,date_inscription) VALUES ('merde', 'réussie',MD5('enculé'), NOW());");

 
 connexion.close();
} catch (Exception e ) {
   System.out.println("Connection échoué");

    
    }}}