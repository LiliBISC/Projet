/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.sql.*;
import static projet.Sousprogrammes.*;


public final class DB_memory {
    Connection connexion;
    Statement statement;
    ResultSet resultat;
    
    public DB_memory(String nom_database,String ip,String port,String user,String mdp){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            println("Driver initialisé",CYAN);
        }
        catch(Exception e){
            println("Erreur driver",RED);
        }
        
        try {
   
connexion= DriverManager.getConnection("jdbc:mysql://"+ip+":"+port+"/"+nom_database+"?verifyServerCertificate=false&useSSL=true",user,mdp);
println("CONNECTION établie a "+nom_database,GREEN);
statement = connexion.createStatement();






/////////////////////////////////////////////////////////////////////
for(int i=0;i<100;i++)ajouter_client(new Customer(motaleatoire(2),motaleatoire(5),motaleatoire(5),motaleatoire(4)));
//supprimer_client("erf");


 /////////////////////////////////////////////////////////////////////




connexion.close();
 println("Deconnection de fin de programme",BLACK);
} catch (SQLException e ) {
   System.err.println(e.getMessage());
}
        println("\n\n");
        
    }
    
    
    public void ajouter_client(Customer c) {///ajoute le customer dans la base de donnée mémoire vive et sql
        try{
        statement.executeUpdate("INSERT INTO client (identifiant,nom,prenom, mot_de_passe,date_inscription) VALUES ('"+c.identifiant+"','"+c.nom+"','"+c.prenom+"',"+"MD5('"+c.mdp+"'),"+"NOW());");
        resultat = statement.executeQuery("SELECT NOW();");
        
        println(date_action(resultat)+" :  "+c.nom+" s'est inscrit   ");///rapport de l'action
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
        }
    }
    
    public void supprimer_client(String identifiant) throws SQLException{
       
        statement.executeUpdate("DELETE FROM client WHERE identifiant='"+identifiant+"';");
  }
    
    
    
    public String date_action(ResultSet resultat) throws SQLException{/// retourne la date du dernier résultat

resultat = statement.executeQuery("SELECT NOW();");
   resultat.next();     
return resultat.getString(1);
}
    
    public int nb_ligne(String table) throws SQLException{///retourne le nombre de ligne de la table rentrée en paramètre
        resultat=statement.executeQuery("SELECT COUNT(*) FROM "+table+";");
        resultat.next();
        return resultat.getInt(1);
        
    }
    
    
    
}

