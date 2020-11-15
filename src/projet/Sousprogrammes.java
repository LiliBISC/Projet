package projet;


import java.sql.SQLException;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trani
 */
public class Sousprogrammes {
    
    static String motaleatoire(int nlettre){
         Random rnd = new Random();
      String a="abcdefghijklmnopqrstuvwxyz123456789";
      String mot="";
      
      for(int i=0;i<nlettre;i++){
          int r=(int) (Math.random() * a.length());
          mot+=a.substring(r, r+1);
      }
      
      return mot;
    }
    public static void main(String[] args) {
        //System.out.println(motaleatoire());
    }
}
