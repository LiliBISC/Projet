/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;



/**
 *
 * @author trani
 *///jdbc:mysql://mysql-base-fiber.alwaysdata.net:3306/base-fiber_attraction
public interface DAO_Connection {
    public static final String ip="mysql-base-fiber.alwaysdata.net";
    public static final String port="3306";
    public static final String nom_DB="base-fiber_attraction";
    public static final String user="218790";
    public static final String mdp="A44fichaux!";
    
     
     
     
    //boolean recherche_identifiants_employe(String email,String mdp);
     //public boolean recherche_client(String nom_colonne,String champ);
     final static DAO_impl_SQL data=new DAO_impl_SQL(nom_DB,ip,port,user,mdp);
}
