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
public interface Serveur {
    public static final String ip="0.tcp.eu.ngrok.io";
    public static final String port="12197";
    public static final String nom_DB="BD_P8";
    public static final String user="root";
    public static final String mdp="A44fichaux";
    
     final static DB_memory data=new DB_memory(nom_DB,ip,port,user,mdp);
     
}
