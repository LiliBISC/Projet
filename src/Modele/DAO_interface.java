/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

import static Modele.Sousprogrammes.GREEN;
import static Modele.Sousprogrammes.RED;
import static Modele.Sousprogrammes.WHITE;
import static Modele.Sousprogrammes.println;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author trani
 */
public interface DAO_interface {
    
    
    //AJOUTS
     public void ajouter_client(String email,String mdp,String nom,String prenom,int age);///ajoute le customer dans la base de donnée mémoire vive et sql
     public void ajouter_employe(String email,String mdp,String nom,String prenom);
    public void ajouter_invite(String nom,String prenom);
    public void ajouter_manege_date(String nom_manege,String datem);
    
    //SUPPRESSIONS
    public void supprimer_client(String email);
    public void supprimer_manege_date(String manege, String date);
  
    //RECHERCHES
    public boolean recherche_identifiants_client(String email,String mdp);
    public boolean recherche_identifiants_employe(String email,String mdp);
    public boolean recherche_client(String nom_colonne,String champ);  
    public boolean recherche_manege_date(String nom_colonne1,String champ1, String nom_colonne2, String champ2);
      
      
    public void deconnection();
     public void activation();
    
    //SETTERS
    public void set_reduction_adulte(double reduction);
    public void set_reduction_enfant(double reduction);
    
    //GETTERS
    public double get_reduc(String nom);
    public double get_prix_manege(String nom);
    public ArrayList get_dates(String manege);
        
        ///SQL
    public Connection get_connection();
    public Statement get_statement();
    public ResultSet get_resultat();
    public void set_resultat(ResultSet a);
    public Object GetChampTable(String nom_table,String champ_indentification,String valeur_champ_identification,String nom_type_colonne);
    public void SetChampTable(String nom_table,String champ_indentification,String valeur_champ_identification,String nom_colonne,Object var_set);
}
