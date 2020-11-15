/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

/**
 *
 * @author trani
 */
public class Customer {
    protected String identifiant;
    protected String nom;
    protected String prenom;
    protected String mdp;
    protected String date_inscription;
    

    public Customer(String identifiant,String nom,String prenom,String mdp){
        this.identifiant=identifiant;
        this.nom=nom;
        this.prenom=prenom;
        
        this.mdp=mdp;
        
    }
   
    
}
