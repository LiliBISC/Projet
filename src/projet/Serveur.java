/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import static projet.Sousprogrammes.ip;
import static projet.Sousprogrammes.nom_DB;
import static projet.Sousprogrammes.port;

/**
 *
 * @author trani
 */
public interface Serveur {
     final static DB_memory data=new DB_memory(nom_DB,ip,port, "root", "A44fichaux");;
}
