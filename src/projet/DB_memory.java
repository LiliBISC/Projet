/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author trani
 */
public class DB_memory {
    ArrayList<Customer> customers=new ArrayList<>();
    ArrayList<Employee> employees=new ArrayList<>();
    
    public void push_Customer(Customer c,Statement statement) throws SQLException{///ajoute le customer dans la base de donnée mémoire vive et sql
        statement.executeUpdate("INSERT INTO Utilisateur (nom,prenom, mot_de_passe,date_inscription) VALUES ("+"'"+c.nom+"','"+c.prenom+"',"+"MD5('"+c.mdp+"'),"+"NOW());");
        customers.add(c);
    }
    
}
