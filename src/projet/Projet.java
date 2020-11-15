
package projet;

import java.sql.*;




public class Projet {

   
    public static void main(String[] args) throws SQLException {
    DB_memory Data=new DB_memory();
        try{Class.forName("com.mysql.jdbc.Driver");System.out.println("Driver initialisé");}
        catch(Exception e){System.out.println("Erreur driver");}
        
        try {
   
  Connection connexion= DriverManager.getConnection( "jdbc:mysql://localhost:3306/projet8", "root", "A44fichaux" );
System.out.println("Connection ok");
Statement statement = connexion.createStatement();
/////////////////////////////////////////////////////////////////////
Data.push_Customer(new Customer(1,"Marc","Fichou","trou@gmail.com","78965"), statement);



 /////////////////////////////////////////////////////////////////////
 connexion.close();
} catch (Exception e ) {
   System.out.println("Connection échoué");

    
    }}}