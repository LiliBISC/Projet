package Modele;


import java.math.RoundingMode;
import java.sql.SQLException;
import java.text.DecimalFormat;
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
    
    
   
  
    
    
    public static final String RESET = "\u001B[0m";
public static final String BLACK = "\u001B[30m";
public static final String RED = "\u001B[31m";
public static final String GREEN = "\u001B[32m";
public static final String YELLOW = "\u001B[33m";
public static final String BLUE = "\u001B[34m";
public static final String PURPLE = "\u001B[35m";
public static final String CYAN = "\u001B[36m";
public static final String WHITE = "\u001B[37m";
    
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
    public static void println(Object msg,String couleur){
        msg=String.valueOf(msg);
        System.out.println(couleur+msg);
        System.out.print(RESET);
    }
    public static void println(Object msg){
        msg=String.valueOf(msg);
        System.out.println(msg+RESET);
        
    }
    public static void main(String[] args) {
        println(motaleatoire(5));
    }
    
    public static String nombre(double d){
DecimalFormat format = new DecimalFormat("0.0");
format.setMaximumFractionDigits(5);
format.setRoundingMode(RoundingMode.FLOOR);
    return format.format(d);

    }
}
