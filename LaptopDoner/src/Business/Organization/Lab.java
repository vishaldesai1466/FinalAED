/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.TechnicianRole;
import Business.Role.ServiceCenterManagerRole;
import Business.Role.Role;
import java.util.ArrayList;


public class Lab extends Organization {

    public Lab() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ServiceCenterManagerRole());       
        roles.add(new TechnicianRole());
        return roles;
    }
    
}
