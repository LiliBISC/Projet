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


 
} catch (SQLException e ) {
   System.err.println("Connection a "+nom_database+" impossible. Vérifie que t'as activé le serveur mec. ");
}
        
    }
    
    
    public void ajouter_client(String email,String mdp,String nom,String prenom,int age) {///ajoute le customer dans la base de donnée mémoire vive et sql
        try{
        statement.executeUpdate("INSERT INTO user (user_type,email,mdp,nom,prenom,age,date_inscription) VALUES ('Client_Membre','"+email+"'"+",'"+mdp+"',"+"'"+nom+"','"+prenom+"','"+age+"',"+"NOW());");
        resultat = statement.executeQuery("SELECT NOW();");
        
        println(date_action(resultat)+" :  "+nom+" s'est inscrit   ");///rapport de l'action
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
        }
    }
    
    public void ajouter_invite(String nom,String prenom) {///ajoute le customer dans la base de donnée mémoire vive et sql
        try{
        //statement.executeUpdate("INSERT INTO user (user_type,email,mdp,nom,prenom,age,date_inscription) VALUES ('Client_Invité','"+null+"'"+",MD5('"+null+"'),"+"'"+nom+"','"+prenom+"','"+-1+"',"+"NOW());");
        statement.executeUpdate("INSERT INTO user (user_type,nom,prenom,date_inscription) VALUES ('Client_Invité','"+nom+"','"+prenom+"',"+"NOW());");
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
  
    public boolean recherche_identifiants_client(String email,String mdp) {
      boolean t=false;
        try{
        resultat = statement.executeQuery( "SELECT *FROM user;" );
        
        
        
        while(resultat.next()){
             
           if( resultat.getString("email").compareTo(email)==0&&resultat.getString("mdp").compareTo(mdp)==0){
              
               t= true;
               
           }
        }
        
       
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
            }
        finally{
        return t;
        
        }
        
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
    
    public void deconnection() {
        try{
            println("DECONNECTION",WHITE);
        connexion.close();
        }catch(SQLException e){
            
        }
    }
    
    public void activation(){
        //println("Appel du serveur");
    }
    
}

