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
for(int i=0;i<20;i++)ajouter_client(motaleatoire(3)+"@gmail.com",motaleatoire(5),motaleatoire(5),motaleatoire(4),14);
//supprimer_client("erf");


 /////////////////////////////////////////////////////////////////////




connexion.close();
 println("Deconnection de fin de programme",BLACK);
} catch (SQLException e ) {
   System.err.println("Connection a "+nom_database+" impossible. Vérifie que t'as activé le serveur mec. ");
}
        
    }
    
    
    public void ajouter_client(String email,String mdp,String nom,String prenom,int age) {///ajoute le customer dans la base de donnée mémoire vive et sql
        try{
        statement.executeUpdate("INSERT INTO user (user_type,email,mdp,nom,prenom,age,date_inscription) VALUES ('Client_Membre','"+email+"'"+",MD5('"+mdp+"'),"+"'"+nom+"','"+prenom+"','"+age+"',"+"NOW());");
        resultat = statement.executeQuery("SELECT NOW();");
        
        println(date_action(resultat)+" :  "+nom+" s'est inscrit   ");///rapport de l'action
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
        }
    }
    
    public void supprimer_client(String identifiant) {
        try{
        statement.executeUpdate("DELETE FROM client WHERE identifiant='"+identifiant+"';");
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
            }
        }
  
    public boolean recherche_identifiants_client(String email,String mdp){
        try{
        resultat = statement.executeQuery( "SELECT COUNT(*) FROM user;" );
        resultat.next();
        do {
 
 }while (resultat.getString("email").compareTo(email)!=0&&resultat.getString("mdp").compareTo(mdp)!=0&&resultat.next());
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
            }
        return true;
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

