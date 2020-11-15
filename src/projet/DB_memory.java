/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author trani
 */
public final class DB_memory {
    Connection connexion;
    Statement statement;
    ResultSet resultat;
    
    public DB_memory(){
        
        try{Class.forName("com.mysql.jdbc.Driver");System.out.println("Driver initialisé");}
        catch(Exception e){System.out.println("Erreur driver");}
        
        try {
   
connexion= DriverManager.getConnection( "jdbc:mysql://localhost:3306/projet8", "root", "A44fichaux" );
System.out.println("CONNECTION établie");
statement = connexion.createStatement();
/////////////////////////////////////////////////////////////////////
//ajouter_client(new Customer("ertervf","Marc","Fichou","78965"));
//supprimer_client("erterv");
statement.executeUpdate("DELETE FROM client WHERE identifiant='ertervf';");

 /////////////////////////////////////////////////////////////////////
 connexion.close();
 statement.close();
 resultat.close();
} catch (SQLException e ) {
   //System.err.println(e.getMessage());
}
        
        
    }
    
    
    public void ajouter_client(Customer c) throws SQLException{///ajoute le customer dans la base de donnée mémoire vive et sql
        statement.executeUpdate("INSERT INTO client (identifiant,nom,prenom, mot_de_passe,date_inscription) VALUES ('"+c.identifiant+"','"+c.nom+"','"+c.prenom+"',"+"MD5('"+c.mdp+"'),"+"NOW());");
        
    }
    
    public void supprimer_client(String identifiant) throws SQLException{
        //statement.executeUpdate("DELETE FROM client WHERE identifiant='"+identifiant+"';");
        
    }
    
}
