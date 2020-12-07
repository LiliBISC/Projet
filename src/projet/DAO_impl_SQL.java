/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static projet.Sousprogrammes.*;


public final class DAO_impl_SQL {
    public Connection connexion;
    public Statement statement;
    public ResultSet resultat;
    
    public DAO_impl_SQL(String nom_database,String ip,String port,String user,String mdp){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            println("Driver initialisé");
        }
        catch(Exception e){
            println("Erreur driver",RED);
        }
        
        try {
   
connexion= DriverManager.getConnection("jdbc:mysql://"+ip+":"+port+"/"+nom_database+"?verifyServerCertificate=false&useSSL=true",user,mdp);
println("CONNECTION établie a "+nom_database,GREEN);
statement = connexion.createStatement();


 
} catch (SQLException e ) {
   System.err.println("Connection a "+nom_database+" impossible.");
}
        
    }
    
    
    public void ajouter_client(String email,String mdp,String nom,String prenom,int age) {///ajoute le customer dans la base de donnée mémoire vive et sql
        try{
        statement.executeUpdate("INSERT INTO User (user_type,email,mdp,nom,prenom,age,date_inscription) VALUES ('Client','"+email+"'"+",'"+mdp+"',"+"'"+nom+"','"+prenom+"','"+age+"',"+"NOW());");
        resultat = statement.executeQuery("SELECT NOW();");
        
        println(date_action(resultat)+" :  "+nom+" s'est inscrit   ");///rapport de l'action
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
        }
    }
    
    public void ajouter_employe(String email,String mdp,String nom,String prenom) {///ajoute le customer dans la base de donnée mémoire vive et sql
        try{
        statement.executeUpdate("INSERT INTO Employe (user_type,email,mdp,nom,prenom) VALUES ('Employe','"+email+"','"+mdp+"','"+nom+"','"+prenom+"');");
        resultat = statement.executeQuery("SELECT NOW();");
        
        println("Employe :  "+nom+" ajouté");///rapport de l'action
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
        }
    }
    
    public void ajouter_invite(String nom,String prenom) {///ajoute le customer dans la base de donnée mémoire vive et sql
        try{
        //statement.executeUpdate("INSERT INTO user (user_type,email,mdp,nom,prenom,age,date_inscription) VALUES ('Client_Invité','"+null+"'"+",MD5('"+null+"'),"+"'"+nom+"','"+prenom+"','"+-1+"',"+"NOW());");
        statement.executeUpdate("INSERT INTO User (user_type,nom,prenom,date_inscription) VALUES ('Client_Invité','"+nom+"','"+prenom+"',"+"NOW());");
            resultat = statement.executeQuery("SELECT NOW();");
        
        println(date_action(resultat)+" :  "+nom+" s'est inscrit   ");///rapport de l'action
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
        }
    }
    
    public void supprimer_client(String email)  {
       
       
        boolean b=recherche_client("email",email);
        if(b==true){
           try{
              statement.executeUpdate("DELETE FROM User WHERE email='"+email+"';");
            println(email+" a été supprimé",GREEN);}
           catch(SQLException e){
               println(e.getMessage(),RED);
           }
           
        }
        else{
            println("N'existe pas",RED);
        }
        
        }
  
    public boolean recherche_identifiants_client(String email,String mdp) {
      boolean t=false;
        try{
        resultat = statement.executeQuery( "SELECT *FROM User;" );
        
        
        
        while(resultat.next()&&t==false){//parcourt
             
           if( resultat.getString("email").compareTo(email)==0&&resultat.getString("mdp").compareTo(mdp)==0){//si trouve
              
               t= true;
               
           }
        }
        
       
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
            }
        finally{
            
        return t;//retourne le boléen de la recherche
        
        }
        
    }
    
     public boolean recherche_identifiants_employe(String email,String mdp) {
      boolean t=false;
        try{
        resultat = statement.executeQuery( "SELECT *FROM Employe;" );
        
        
        
        while(resultat.next()&&t==false){//parcourt
             
           if( resultat.getString("email").compareTo(email)==0&&resultat.getString("mdp").compareTo(mdp)==0){//si trouve
              
               t= true;
               
           }
        }
        
       
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
            }
        finally{
            
        return t;//retourne le boléen de la recherche
        
        }
        
    }
    
      public boolean recherche_client(String nom_colonne,String champ) {//retourne vrai si le client avec cette valeur de colonne éxiste
      boolean t=false;
        try{
        resultat = statement.executeQuery( "SELECT *FROM User;" );
        
        
        
        while(resultat.next()&&t==false){
             
           if( resultat.getString(nom_colonne).compareTo(champ)==0){
              
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
      
      public boolean recherche_manege_date(String nom_colonne1,String champ1, String nom_colonne2, String champ2) {//retourne vrai si le client avec cette valeur de colonne éxiste
      boolean t=false;
        try{
        resultat = statement.executeQuery( "SELECT *FROM Ticket;" );
        
        
        
        while(resultat.next()&&t==false){
             
           if( resultat.getString(nom_colonne1).compareTo(champ1)==0&&resultat.getString(nom_colonne2).compareTo(champ2)==0){
              
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
      
      public double get_prix_manege(String nom){///tu mets le nom du manege ça retourne son prix
          double prix=-1; 
          try{
        resultat = statement.executeQuery( "SELECT *FROM Manege;" );
        
        
        
        while(resultat.next()&&prix==-1){
             
           if( resultat.getString("nom").compareTo(nom)==0){
              
               prix=resultat.getDouble("prix");
               
           }
        }
        
       
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
            }
        finally{
           return prix;
        
        }
      }
      
      public Object GetChampTable(String nom_table,String champ_indentification,String valeur_champ_identification,String nom_type_colonne){///
          Object var = null; 
          try{
        resultat = statement.executeQuery( "SELECT *FROM "+nom_table+";" );
        
        
        
        while(resultat.next()&&var==null){
             
          
              if(resultat.getString(champ_indentification).compareTo(valeur_champ_identification)==0)
               var=resultat.getObject(nom_type_colonne);
               
           
        }
        
       
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
            }
        finally{
           return var;
        
        }
      }
    public void SetChampTable(String nom_table,String champ_indentification,String valeur_champ_identification,String nom_colonne,Object var_set){
        try{
       statement.executeUpdate(" UPDATE "+nom_table+" SET "+nom_colonne+" = '"+var_set+"' WHERE "+champ_indentification+" = '"+valeur_champ_identification+"';");
        }catch(SQLException e){
            println(e.getMessage());
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
    
    public void activation(){//méthode vide pour initialisé le serveur déclaré dans l'interface
        
    }
    
    public void set_reduction_adulte(double reduction){
        try{
       statement.executeUpdate(" UPDATE Reduction SET adulte = '"+reduction+"';");
        }catch(SQLException e){
            println(e.getMessage());
        }
    }
    
    public void set_reduction_enfant(double reduction){
        try{
       statement.executeUpdate(" UPDATE Reduction SET enfant = '"+reduction+"';");
        }catch(SQLException e){
            println(e.getMessage());
        }
    }
    
    public double get_reduc(String nom){
       double a=0;
          try {
            resultat = statement.executeQuery( "SELECT *FROM Reduction;" );
            resultat.next();
            a=resultat.getDouble(nom);
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO_impl_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           return a;
          
      }
   public ArrayList get_dates(String manege){
        ArrayList date=new ArrayList<>(); 
        try{
        resultat = statement.executeQuery( "SELECT *FROM Ticket;" );
        
       
        
        while(resultat.next()){
             
          if(resultat.getString("Nom_manege").compareTo(manege)==0){
              date.add(resultat.getString("date"));
          }
              
               
           
        }
        
        
        
    }catch(SQLException e){
            
        }
         finally{
        return date;
    }
    
}
    public void ajouter_manege_date(String nom_manege,String datem) {///ajoute le customer dans la base de donnée mémoire vive et sql
       
        
        try{
        statement.executeUpdate("INSERT INTO Ticket (Nom_manege,date) VALUES ('"+nom_manege+"','"+datem+"');");
        resultat = statement.executeQuery("SELECT NOW();");
        
        println(date_action(resultat)+" :  "+nom_manege+" est réservé   ");///rapport de l'action
        }
        catch(SQLException e){
            println(e.getMessage(),RED);
        }
    }
    
    public void supprimer_manege_date(String manege, String date)  {
       
       
        boolean b=recherche_manege_date("Nom_manege",manege, "date", date);
        if(b==true){
           try{
              statement.executeUpdate("DELETE FROM Ticket WHERE Nom_manege='"+manege+"' AND date='"+date+"';");
            println(manege+" "+date+" a été supprimé",GREEN);}
           catch(SQLException e){
               println(e.getMessage(),RED);
           }
           
        }
        else{
            println("N'existe pas",RED);
        }
        
        }
}

