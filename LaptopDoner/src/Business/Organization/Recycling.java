/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RecycleManagerRole;
import Business.Role.Role;
import java.util.ArrayList;


public class Recycling extends Organization {

    public Recycling() {
        super(Organization.Type.Recycling.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RecycleManagerRole());
        return roles;
    }
    
}
