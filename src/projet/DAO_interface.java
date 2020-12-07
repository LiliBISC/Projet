/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.ArrayList;

/**
 *
 * @author trani
 */
public interface DAO_interface {
     public boolean recherche_client(String nom_colonne,String champ);
     public boolean recherche_manege_date(String nom_colonne1,String champ1, String nom_colonne2, String champ2);
     public double get_prix_manege(String nom);
     public void set_reduction_adulte(double reduction);
     public void set_reduction_enfant(double reduction);
     public double get_reduc(String nom);
     public ArrayList get_dates(String manege);
     public void ajouter_manege_date(String nom_manege,String datem);
     public void supprimer_manege_date(String manege, String date);
}
