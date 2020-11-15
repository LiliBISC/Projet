/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.util.ArrayList;
import static projet.Sousprogrammes.motaleatoire;

/**
 *
 * @author trani
 */
public class Parc {
    ArrayList<Ride> rides=new ArrayList<>();
    
    public void build_ride(int n)
    {
        for(int i=0; i<n;i++)
        {
            Ride r= new Ride(motaleatoire(5));
            rides.add(r);
        }
    }
    
    public ArrayList<Ride> getRides()
    {
        return rides;
    }
    
}
