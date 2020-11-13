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
public class Employee {
    protected String name;
    protected String surname;
    protected String id;
    protected String password;
    
    public Employee(String name,String surname,String id,String password){
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.password=password;
        
    }
    
}
