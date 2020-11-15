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
    protected int id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String mdp;
    

    public Customer(int id,String nom,String prenom,String email,String mdp){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.mdp=mdp;
        
    }
   
    
}
